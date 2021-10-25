/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eti.carloslima.clinformatica.model.services;

import br.eti.carloslima.clinformatica.model.dao.AddresDao;
import br.eti.carloslima.clinformatica.model.dao.DaoFactory;
import br.eti.carloslima.clinformatica.model.entities.AddresModel;

/**
 *
 * @author eduar
 */
public class AddresService {
    
    private AddresDao dao = DaoFactory.createAddresDao();
    
    public int salvar(AddresModel obj){
        return dao.insert(obj);
    }
    
    public int atualiza(AddresModel obj){
        return dao.update(obj);
    }
    
    public AddresModel busca(int id){
        return dao.select(id);
    }
    
    public AddresModel buscaPorNome(String rua){
        return dao.selectByLogradouro(rua);
    }
}
