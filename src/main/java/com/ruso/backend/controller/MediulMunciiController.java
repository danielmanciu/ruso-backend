package com.ruso.backend.controller;

import com.ruso.backend.repository.MediulMunciiRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// TODO: competente formale, info practica/parteneri, internship-uri
@RestController
@RequestMapping("/mediulMuncii")
public class MediulMunciiController {

    private final MediulMunciiRepository mediulMunciiRepository;

    @Autowired
    public MediulMunciiController(MediulMunciiRepository mediulMunciiRepository) {
        this.mediulMunciiRepository = mediulMunciiRepository;
    }

    @GetMapping("/oportunitatiProfesionale")
    public ResponseEntity<List<String>> getOportunitatiProfesionale() {
        return ResponseEntity.ok(mediulMunciiRepository.getOportunitatiProfesionale());
    }
}