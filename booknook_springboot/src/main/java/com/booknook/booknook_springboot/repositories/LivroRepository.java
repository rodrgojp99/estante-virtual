package com.booknook.booknook_springboot.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.booknook.booknook_springboot.models.LivroModel;

@Repository
public interface LivroRepository extends CrudRepository<LivroModel, Long> {
    
}
