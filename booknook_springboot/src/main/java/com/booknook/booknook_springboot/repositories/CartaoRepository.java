package com.booknook.booknook_springboot.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.booknook.booknook_springboot.models.CartaoModel;

@Repository
public interface CartaoRepository extends CrudRepository<CartaoModel, Long>{

    
}
