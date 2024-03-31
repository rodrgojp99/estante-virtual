package com.booknook.booknook_springboot.controllers;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booknook.booknook_springboot.models.CartaoModel;
import com.booknook.booknook_springboot.repositories.CartaoRepository;

@RestController
@RequestMapping("/api/cartao")
public class CartaoController {

    @Autowired
    CartaoRepository cartaoRepository;

    CartaoModel cartaoModel = new CartaoModel();

    @GetMapping
    Iterable<CartaoModel> getAllCartaoModel() {
        return cartaoRepository.findAll();
    }

    @GetMapping("/{id}")
    CartaoModel getCartaooModel(@PathVariable Long id) {
        Optional<CartaoModel> busca = cartaoRepository.findById(id);
        return busca.orElse(null);
    }

    @PostMapping
    CartaoModel postLivroModel(@RequestBody CartaoModel cartaomodel) {
        return cartaoRepository.save(cartaomodel);
    }
}
