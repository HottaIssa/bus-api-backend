package com.saihoz.buses.service;

import com.saihoz.buses.dto.ModelRequest;
import com.saihoz.buses.model.Model;
import com.saihoz.buses.repo.ModelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ModelService {

    private final ModelRepository modelRepository;

    public List<Model> findAll() {
        return modelRepository.findAll();
    }

    public Model save(ModelRequest model) {
        Model newModel = new Model();
        newModel.setName(model.getName());
        return modelRepository.save(newModel);
    }

}
