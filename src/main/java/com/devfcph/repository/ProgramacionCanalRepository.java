package com.devfcph.repository;

import com.devfcph.dto.ProgramacionCanal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramacionCanalRepository extends JpaRepository<ProgramacionCanal, Integer> {
}
