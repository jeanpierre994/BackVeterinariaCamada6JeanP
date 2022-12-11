package com.dh.clinica.service;

import com.dh.clinica.dto.UsuarioDto;
import com.dh.clinica.entities.UserDto;
import com.dh.clinica.entities.Usuario;
import org.springframework.stereotype.Service;

@Service
public interface UsuarioService {
    public Usuario save(Usuario user);
    public void delete(UsuarioDto user);
    public UsuarioDto get(UsuarioDto user);
    public UsuarioDto uddate(UsuarioDto user);
}
