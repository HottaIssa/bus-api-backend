package com.saihoz.buses.controller;

import com.saihoz.buses.dto.ModelRequest;
import com.saihoz.buses.model.Model;
import com.saihoz.buses.service.ModelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/model")
@RequiredArgsConstructor
public class ModelController {

    private final ModelService modelService;

    @GetMapping
    public ResponseEntity<List<Model>> findAll() {
        return ResponseEntity.ok(modelService.findAll());
    }

    @PostMapping
    public ResponseEntity<Model> save(@RequestBody ModelRequest model) {
        return ResponseEntity.status(HttpStatus.CREATED).body(modelService.save(model));
    }

}
