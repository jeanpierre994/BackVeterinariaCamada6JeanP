package com.dh.clinica.service;

import com.dh.clinica.dto.UserDto;
import com.dh.clinica.entities.UserDto;
import com.dh.clinica.entities.Usuario;
import org.springframework.stereotype.Service;

@Service
public interface UsuarioService {
    public Usuario save(Usuario user);
    public void delete(UserDto user);
    public UserDto get(UserDto user);
    public UserDto uddate(UserDto user);
}
