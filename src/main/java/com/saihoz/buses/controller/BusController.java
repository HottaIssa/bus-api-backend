package com.saihoz.buses.controller;

import com.saihoz.buses.dto.BusRequest;
import com.saihoz.buses.model.Bus;
import com.saihoz.buses.service.BusService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PagedModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bus")
@AllArgsConstructor
public class BusController {

    private final BusService busService;

    @GetMapping
    public ResponseEntity<PagedModel<Bus>> findAll(
            @RequestParam(value="page", defaultValue="0") int page,
            @RequestParam(value="size", defaultValue="10") int size
    ) {
        Page<Bus> busPage = busService.findAll(page, size);

        return ResponseEntity.ok(new PagedModel<>(busPage));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bus> findById(@PathVariable Long id) {
        return ResponseEntity.ok(busService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Bus> save(@RequestBody BusRequest bus) {
        return ResponseEntity.status(HttpStatus.CREATED).body(busService.save(bus));
    }
}
