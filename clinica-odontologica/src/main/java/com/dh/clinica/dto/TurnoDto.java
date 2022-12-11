package com.dh.clinica.dto;

import com.dh.clinica.entities.Paciente;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class TurnoDto {
    private Integer id;
    private Paciente paciente;
}
