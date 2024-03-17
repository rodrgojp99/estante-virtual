package com.booknook.booknook_springboot.models;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "usuario")
public class UsuarioModel {

    @Column(length = 11)
    @Id @NotBlank
    private String cpf;

    @Column(length = 50)
    @NotBlank @NotEmpty
    private String nome;
    
    @Column(length = 45)
    @NotBlank @NotEmpty
    private String email;

    @Column(length = 16)
    @NotBlank @NotEmpty
    private String telefone;

    @Column(length = 50)
    private String endereco;

    @Column(length = 16)
    private String numero_cartao;

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

    public String getNumero_cartao() {
        return numero_cartao;
    }

    public void setNumero_cartao(String numero_cartao) {
        this.numero_cartao = numero_cartao;
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

}
