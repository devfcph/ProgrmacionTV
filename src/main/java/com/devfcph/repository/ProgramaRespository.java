package com.devfcph.repository;

import com.devfcph.dto.Programa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramaRespository extends JpaRepository<Programa, Integer> {

}
