package com.devfcph.service;

import com.devfcph.repository.ProgramacionCanalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgramacionCanalService {

    @Autowired
    private ProgramacionCanalRepository programacionCanalRepository;
}
