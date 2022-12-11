package com.dh.clinica.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
public class OdontologoDto {
        private Integer id;
        private String nombre;
        private String apellido;
        private Integer matricula;

}
