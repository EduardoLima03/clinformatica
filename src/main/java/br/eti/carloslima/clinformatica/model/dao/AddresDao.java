/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eti.carloslima.clinformatica.model.dao;

import br.eti.carloslima.clinformatica.model.entities.AddresModel;

/**
 *
 * @author eduar
 */
public interface AddresDao {
    
    int insert(AddresModel obj);
    int update(AddresModel obj);
    AddresModel select(int id);
    AddresModel selectByLogradouro(String rua);
    int delete(int id);
}
