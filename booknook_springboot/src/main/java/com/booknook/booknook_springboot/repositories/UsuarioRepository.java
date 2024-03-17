package com.booknook.booknook_springboot.repositories;

import org.springframework.data.repository.CrudRepository;

import com.booknook.booknook_springboot.models.UsuarioModel;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long>{
    
}
