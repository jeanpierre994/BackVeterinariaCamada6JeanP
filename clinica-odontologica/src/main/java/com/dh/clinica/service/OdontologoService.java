package com.dh.clinica.service;

import com.dh.clinica.entities.Odontologo;
import com.dh.clinica.repository.OdontologoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OdontologoService {

    @Autowired
    private OdontologoRepository odontologoRepository;




    public Odontologo registrarOdontologo(Odontologo odontologo) {
        return odontologoRepository.save(odontologo);

    }

    public void eliminar(Integer id) {
        odontologoRepository.deleteById(id);
    }

    public Optional<Odontologo> buscar(Integer id) {
        return odontologoRepository.findById(id);
    }

    public List<Odontologo> buscarTodos() {
        return odontologoRepository.findAll();
    }

    public Odontologo actualizar(Odontologo odontologo) {
        return odontologoRepository.save(odontologo);
    }


}
