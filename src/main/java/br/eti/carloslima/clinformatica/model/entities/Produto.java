/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eti.carloslima.clinformatica.model.entities;

import java.math.BigDecimal;

/**
 *
 * @author eduar
 */
public class Produto {
    private Integer id;
    private String descricao;
    private BigDecimal preco;
    
    public Produto(){}
    public Produto(int id, String descricao, String preco){
        this.id = id;
        this.descricao = descricao;
        this.preco = new BigDecimal(preco);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
    
}
