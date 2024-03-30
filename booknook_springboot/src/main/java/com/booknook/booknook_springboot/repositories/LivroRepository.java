package com.booknook.booknook_springboot.repositories;

import org.springframework.data.repository.CrudRepository;

import com.booknook.booknook_springboot.models.LivroModel;

public interface LivroRepository extends CrudRepository<LivroModel, Long> {
    
}
