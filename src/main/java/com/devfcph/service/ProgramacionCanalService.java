package com.devfcph.service;

import com.devfcph.dto.ProgramacionCanal;
import com.devfcph.repository.ProgramacionCanalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramacionCanalService {

    @Autowired
    private ProgramacionCanalRepository programacionCanalRepository;

    public List<ProgramacionCanal> obtenerProgramacion() {
        return  programacionCanalRepository.findAll();
    }

    public ProgramacionCanal agregarProgramacion(ProgramacionCanal programacionCanal) {
        try {
            return  programacionCanalRepository.save(programacionCanal);
        } catch (Exception e) {
            throw e;
        }
    }
}
