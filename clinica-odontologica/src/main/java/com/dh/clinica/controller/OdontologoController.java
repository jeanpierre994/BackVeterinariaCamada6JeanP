package com.dh.clinica.controller;

import com.dh.clinica.entities.Odontologo;
import com.dh.clinica.exception.ResourceNotFoundException;
import com.dh.clinica.service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {

    @Autowired
    private OdontologoService odontologoService;

    @GetMapping("/search")
    public ResponseEntity<Odontologo> buscar(@RequestParam Integer id) {
        Odontologo odontologo = odontologoService.buscar(id).orElse(null);
        return ResponseEntity.ok(odontologo);
    }

    @GetMapping
    public ResponseEntity<List<Odontologo>> buscarTodos() {
        return ResponseEntity.ok(odontologoService.buscarTodos());


    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public String processResourceNotFound(ResourceNotFoundException resourceNotFoundException){
        return resourceNotFoundException.getMessage();

    }
}
