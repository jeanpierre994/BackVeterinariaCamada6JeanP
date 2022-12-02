package com.dh.clinica.service.imple;

import com.dh.clinica.dto.UserDto;
import com.dh.clinica.entities.Usuario;
import com.dh.clinica.repository.UsuarioRepository;
import com.dh.clinica.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioSericesImpl implements UsuarioService {

    @Autowired
    private final UsuarioRepository usuarioRepository;

    public UsuarioSericesImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }


    @Override
    public UserDto save(Usuario user) {
        Usuario user = usuarioRepository.save(user);
        UserDto userDto = mapper.convertValue(user,UserDto.class);
        return ;
    }

    @Override
    public void delete(UserDto user) {

    }

    @Override
    public UserDto get(UserDto user) {
        return null;
    }

    @Override
    public UserDto uddate(UserDto user) {
        return null;
    }
}
