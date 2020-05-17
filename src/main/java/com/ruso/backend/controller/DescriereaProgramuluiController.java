package com.ruso.backend.controller;

import com.ruso.backend.model.CalendarAdmitere;
import com.ruso.backend.model.Hotarare;
import com.ruso.backend.model.InfoAbsolvireDisertatie;
import com.ruso.backend.model.Regulament;
import com.ruso.backend.repository.DescriereaProgramuluiRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// TODO: lista discipline, info acreditare
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

    @GetMapping("/hotarari")
    public ResponseEntity<List<Hotarare>> getHotarari() {
        return ResponseEntity.ok(descriereaProgramuluiRepository.getHotarari());
    }

    @GetMapping("/infoAbsolvireDisertatie")
    public ResponseEntity<InfoAbsolvireDisertatie> getInfoAbsolvireDisertatie() {
        return ResponseEntity.ok(descriereaProgramuluiRepository.getInfoAbsolvireDisertatie());
    }

    @GetMapping("/infoAdmitere")
    public ResponseEntity<List<CalendarAdmitere>> getInfoAdmitere() {
        return ResponseEntity.ok(descriereaProgramuluiRepository.getInfoAdmitere());
    }
}