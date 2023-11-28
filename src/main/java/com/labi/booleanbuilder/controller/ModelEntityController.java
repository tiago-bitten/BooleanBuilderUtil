package com.labi.booleanbuilder.controller;

import com.labi.booleanbuilder.model.ModelEntity;
import com.labi.booleanbuilder.repository.ModelEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/modelentity")
public class ModelEntityController {

    @Autowired
    private ModelEntityRepository modelEntityRepository;

    @GetMapping
    public ResponseEntity<?> findAll(@RequestParam(required = false) String filter) {
        return ResponseEntity.ok(modelEntityRepository.findAll(filter, ModelEntity.class));
    }
}
