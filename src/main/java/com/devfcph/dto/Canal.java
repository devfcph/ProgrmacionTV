package com.devfcph.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Canal {
    private int idCanal;

    private String nombre;

    private boolean esVisible;
}
