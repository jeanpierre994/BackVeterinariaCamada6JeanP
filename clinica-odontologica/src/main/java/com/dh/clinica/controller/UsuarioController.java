package com.dh.clinica.controller;

import com.dh.clinica.dto.UsuarioDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UsuarioController {
    @PostMapping
    public UsuarioDto createUsuarioDto (UsuarioDto usuarioDto)

}
