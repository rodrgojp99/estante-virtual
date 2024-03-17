package com.booknook.booknook_springboot.controllers;
import java.util.Optional;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booknook.booknook_springboot.models.UsuarioModel;
import com.booknook.booknook_springboot.repositories.UsuarioRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("api/usuario")
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    UsuarioModel usuarioModel = new UsuarioModel();

    @GetMapping
    Iterable<UsuarioModel> getAllUsuarioModel(){
        return usuarioRepository.findAll();
    }

    @GetMapping("/{id}")
    UsuarioModel getUsuarioModel(@PathVariable Long id){ 
        Optional<UsuarioModel> busca = usuarioRepository.findById(id);
        return busca.orElse(null);
    }
    
}
