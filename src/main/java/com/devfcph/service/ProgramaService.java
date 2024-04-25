package com.devfcph.service;

import com.devfcph.dto.Programa;
import com.devfcph.repository.ProgramaRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgramaService {

    @Autowired
    private ProgramaRespository programaRespository;

    public Programa agregarPrograma(Programa programa) {
        try {
            return  programaRespository.save(programa);
        } catch (Exception e) {
            throw e;
        }
    }
}
