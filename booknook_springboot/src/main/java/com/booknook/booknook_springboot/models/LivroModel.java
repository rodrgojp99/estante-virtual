package com.booknook.booknook_springboot.models;

import java.sql.Date;
import java.sql.Time;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "livro")
public class LivroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    @NotBlank @NotEmpty
    private String nome;

    @Column
    @NotNull
    private float valor;

    @Column
    @NotNull
    private int qnt_estoque;

    @Column(length = 50)
    @NotBlank @NotEmpty
    private String editora;

    @Column
    private Date dia_venda;

    @Column
    private Time hora_venda;

    @Column(length = 20)
    @NotBlank @NotEmpty
    private String cor;

    @Column
    @NotNull
    private float peso;

    @Column(length = 50)
    @NotBlank @NotEmpty  
    private String dimensoes;

    @NotNull  
    private int classificacao;

    @Lob
    private String sinopse;

    @Column(unique = true)
    private String isbn;

    @ManyToOne @JsonIgnore
    @JoinColumn(name = "cpf_usuario", nullable = true)
    private UsuarioModel usuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getQnt_estoque() {
        return qnt_estoque;
    }

    public void setQnt_estoque(int qnt_estoque) {
        this.qnt_estoque = qnt_estoque;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Date getDia_venda() {
        return dia_venda;
    }

    public void setDia_venda(Date dia_venda) {
        this.dia_venda = dia_venda;
    }

    public Time getHora_venda() {
        return hora_venda;
    }

    public void setHora_venda(Time hora_venda) {
        this.hora_venda = hora_venda;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getDimensoes() {
        return dimensoes;
    }

    public void setDimensoes(String dimensoes) {
        this.dimensoes = dimensoes;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public UsuarioModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioModel usuario) {
        this.usuario = usuario;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getIsbn(){
        return isbn;
    }

    public void setIsbn( String isbn){
        this.isbn = isbn;
    }
}
