package com.devfcph.controller;

import com.devfcph.constants.TelevisoraConstants;
import com.devfcph.dto.ProgramacionCanal;
import com.devfcph.service.ProgramacionCanalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(TelevisoraConstants.BASE_PATH + "televisora")
public class ProgramacionCanalController {
    @Autowired
    private ProgramacionCanalService service;

    @GetMapping("/obtenerProgramacion")
    public ResponseEntity<List<ProgramacionCanal>> getProgramacion() {
        return ResponseEntity.ok(service.obtenerProgramacion());
    }

    /*
    @PostMapping
    public ResponseEntity<> addPrograma() {

    }

     */
}
