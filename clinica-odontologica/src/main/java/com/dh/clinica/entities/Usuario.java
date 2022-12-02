package com.dh.clinica.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Entity
@Setter
@NoArgsConstructor

public class Usuario {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String username;
    private String password;

}
