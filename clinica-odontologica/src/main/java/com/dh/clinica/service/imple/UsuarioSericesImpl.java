package com.dh.clinica.service.imple;

import com.dh.clinica.dto.UsuarioDto;
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
    public Usuario save(Usuario usuario) {
        Usuario usuarioFromDb = usuarioRepository.save(usuario);
        return
        UsuarioDto usuarioDto = mapper.convertValue(usuario, UsuarioDto.class);
        ;
    }

    @Override
    public void delete(UsuarioDto user) {

    }

    @Override
    public UsuarioDto get(UsuarioDto user) {
        return null;
    }

    @Override
    public UsuarioDto uddate(UsuarioDto user) {
        return null;
    }
}
