/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eti.carloslima.clinformatica.model.dao;

import br.eti.carloslima.clinformatica.model.entities.ClientModel;
import java.util.List;

/**
 *
 * @author eduar
 */
public interface ClientDao {
    
    int insert(ClientModel obj);
    int update(ClientModel obj);
    int delete(int id);
    ClientModel selectByRegistro(int id);
    List<ClientModel> selectByName(String nome);
    List<ClientModel> selectAll();
}
