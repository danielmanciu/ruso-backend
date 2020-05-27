package com.ruso.backend.controller;

import com.ruso.backend.repository.PrezentareGeneralaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/prezentareGenerala")
public class PrezentareGeneralaController {

    private final PrezentareGeneralaRepository prezentareGeneralaRepository;

    @Autowired
    public PrezentareGeneralaController(PrezentareGeneralaRepository prezentareGeneralaRepository) {
        this.prezentareGeneralaRepository = prezentareGeneralaRepository;
    }

    @GetMapping("/testimoniale")
    public ResponseEntity<List<String>> getTestimonials() {
        return ResponseEntity.ok(prezentareGeneralaRepository.getTestimoniale());
    }
}