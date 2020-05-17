package com.ruso.backend.controller;

import com.ruso.backend.model.Regulament;
import com.ruso.backend.repository.DescriereaProgramuluiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/descriereaProgramului")
public class DescriereaProgramuluiController {

    private final DescriereaProgramuluiRepository descriereaProgramuluiRepository;

    @Autowired
    public DescriereaProgramuluiController(DescriereaProgramuluiRepository descriereaProgramuluiRepository) {
        this.descriereaProgramuluiRepository = descriereaProgramuluiRepository;
    }

    @GetMapping("/regulamentCazare")
    public ResponseEntity<Regulament> getRegulamentCazare() {
        return ResponseEntity.ok(descriereaProgramuluiRepository.getRegulamentCazare());
    }

    @GetMapping("/regulamentCredite")
    public ResponseEntity<Regulament> getRegulamentCredite() {
        return ResponseEntity.ok(descriereaProgramuluiRepository.getRegulamentCredite());
    }
}