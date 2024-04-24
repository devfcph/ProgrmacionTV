package com.devfcph.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProgramacionCanal {

    private int idProgramacionCanal;
    private String horario;

    private String fecha;

    private String duracion;

    private Canal canal;

    private Programa programa;

}
