/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eti.carloslima.clinformatica.model.services;

import br.eti.carloslima.clinformatica.model.dao.DaoFactory;
import br.eti.carloslima.clinformatica.model.dao.UsuarioDao;
import br.eti.carloslima.clinformatica.model.entities.UserModel;

/**
 * Classe Responsavel por fazer o controle em acesso ao banco de dados
 * @author Carlos Lima
 */
public class UserService {
    
    private UsuarioDao dao = DaoFactory.createUsuarioDao();
    
    /**
     * Metodo que ira salva um novo usuario
     * @param obj
     * @return 
     *  Retorna um numero maior que 0 se salvar
     *  0 se não salva
     */
    public int salvar(UserModel obj){
        return dao.insert(obj);
    }
    
    /**
     * Metodo Responsavel por deleta um usuario
     * @param id 
     */
    public void Apagar(int id){
        dao.delete(id);
    }
}
