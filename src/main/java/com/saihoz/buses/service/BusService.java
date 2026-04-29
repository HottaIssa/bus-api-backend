package com.saihoz.buses.service;

import com.saihoz.buses.dto.BusRequest;
import com.saihoz.buses.model.Bus;
import com.saihoz.buses.model.Model;
import com.saihoz.buses.repo.BusRepository;
import com.saihoz.buses.repo.ModelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BusService {

    private final BusRepository busRepository;
    private final ModelRepository modelRepository;

    public Page<Bus> findAll(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return busRepository.findAllByOrderByCreatedAtDesc(
                pageable
        );
    }

    public Bus findById(Long id){
        System.out.println(id);
        return busRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Bus not found")
        );
    }

    public Bus save(BusRequest bus){

        Model model = modelRepository.findById(bus.getModelId()).orElseThrow(
                ()-> new RuntimeException("Model not found")
        );

        Bus newBus = new Bus();
        newBus.setNum(bus.getNum());
        newBus.setPlaca(bus.getPlaca());
        newBus.setCaracteristica(bus.getCaracteristica());
        newBus.setModel(model);
        newBus.setActive(true);

        return busRepository.save(newBus);
    }
}
