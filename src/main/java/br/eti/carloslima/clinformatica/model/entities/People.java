/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eti.carloslima.clinformatica.model.entities;

/**
 *
 * @author eduar
 */
public abstract class People {

    private Integer registro;
    private String nome;
    private String sobreNome;

    public People() {
    }

    public People(Integer registro, String nome) {
        this.registro = registro;
        this.nome = nome;
    }

    public People(Integer registro, String nome, String sobreNome) {
        this.registro = registro;
        this.nome = nome;
        this.sobreNome = sobreNome;
    }

    public Integer getRegistro() {
        return registro;
    }

    public void setRegistro(Integer registro) {
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

}
