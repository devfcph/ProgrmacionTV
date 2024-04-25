package com.devfcph.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "programacion")
public class ProgramacionCanal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProgramacionCanal")
    private int idProgramacionCanal;

    private String horario;

    private String fecha;

    private String duracion;

    @ManyToOne
    @JoinColumn(name = "idCanal")
    private Canal canal;

    @ManyToOne
    @JoinColumn(name = "idPrograma")
    private Programa programa;

}
