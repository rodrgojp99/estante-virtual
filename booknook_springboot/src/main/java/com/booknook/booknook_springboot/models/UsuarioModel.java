package com.booknook.booknook_springboot.models;


import java.util.List;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;


@Entity
@Table(name = "usuario")
public class UsuarioModel {

    @Column(length = 11)
    @Id @NotBlank
    @CPF
    private String cpf;

    @Column(length = 50)
    @NotBlank @NotEmpty
    private String nome;
    
    @Column(length = 45)
    @NotBlank @NotEmpty
    @Email
    private String email;

    @Column(length = 16)
    @NotBlank @NotEmpty
    private String telefone;

    @Column(length = 50)
    private String endereco;

    @Column
    @OneToMany(mappedBy = "usuario")
    private List<CartaoModel> cartoes;

    @Column(length = 8)
    private String cep;

    @Column(length = 12)
    @NotBlank @NotEmpty
    private String senha;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<CartaoModel> getCartoes() {
        return cartoes;
    }

    public void setCartoes(List<CartaoModel> cartoes) {
        this.cartoes = cartoes;
    }



    
}
