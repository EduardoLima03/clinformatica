/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eti.carloslima.clinformatica.model.dao;

import br.eti.carloslima.clinformatica.model.entities.UserModel;
import java.util.List;

/**
 *
 * @author eduar
 */
public interface UsuarioDao {
    UserModel findById(int id);
    List<UserModel> findAll();
    int insert(UserModel obj);
    void update(UserModel obj);
    void delete(int id);
}
