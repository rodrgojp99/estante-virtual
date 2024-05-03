package com.booknook.booknook_springboot.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booknook.booknook_springboot.models.LivroModel;
import com.booknook.booknook_springboot.repositories.LivroRepository;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api/livro")
public class LivroController {

    @Autowired
    LivroRepository livroRepository;

    LivroModel livroModel = new LivroModel();

    @GetMapping
    Iterable<LivroModel> getAllLivroModel() {
        return livroRepository.findAll();
    }

    @GetMapping("/{id}")
    LivroModel getLivroModel(@PathVariable Long id) {
        Optional<LivroModel> busca = livroRepository.findById(id);
        return busca.orElse(null);
    }

    @PostMapping
    LivroModel postLivroModel(@RequestBody LivroModel livroModel) {
        return livroRepository.save(livroModel);
    }

    @DeleteMapping("/{id}")
    void deleteLivroModelById(@PathVariable Long id) {
        livroRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    LivroModel putLivroModel(@PathVariable Long id, @RequestBody LivroModel livroModel) {
        Optional<LivroModel> busca = livroRepository.findById(id);
        if (busca.isPresent()) {
            livroRepository.deleteById(id);
            livroRepository.save(livroModel);
        } else {
            return null;
        }
        return livroModel;
    }

}
