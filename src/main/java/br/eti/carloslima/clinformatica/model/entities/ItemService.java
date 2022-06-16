/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eti.carloslima.clinformatica.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 *
 * @author eduar
 */
public class ItemService implements Serializable {

    private short quantidade;
    private String descricao;
    private BigDecimal valor;

    public ItemService() {
    }

    public ItemService(short quantidade, String descricao, String valor) {
        this.quantidade = quantidade;
        this.descricao = descricao;
        setValor(valor);
    }

    public short getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(short quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = new BigDecimal(valor);
    }
    
    /**
     * 
     * @return BigDecimal valor total por item. quantidade x valor
     */
    public BigDecimal getValorTotal(){
       return this.valor.multiply(new BigDecimal(quantidade));
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.quantidade;
        hash = 37 * hash + Objects.hashCode(this.descricao);
        hash = 37 * hash + Objects.hashCode(this.valor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ItemService other = (ItemService) obj;
        if (this.quantidade != other.quantidade) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        return Objects.equals(this.valor, other.valor);
    }

    @Override
    public String toString() {
        return "quantidade=" + quantidade + ", descricao=" + descricao + ", valor=" + valor;
    }

}
