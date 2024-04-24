package com.devfcph.service;

import com.devfcph.repository.ProgramaRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgramaService {

    @Autowired
    private ProgramaRespository programaRespository;
}
