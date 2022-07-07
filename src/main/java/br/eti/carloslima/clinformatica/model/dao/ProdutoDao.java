/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.eti.carloslima.clinformatica.model.dao;

import br.eti.carloslima.clinformatica.model.entities.Produto;

/**
 *
 * @author eduar
 */
public interface ProdutoDao {
    
    int insert(Produto obj);
    //int update(AddresModel obj);
    Produto select(int id);
    //int delete(int id);
    
}
