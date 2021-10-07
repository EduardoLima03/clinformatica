/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eti.carloslima.clinformatica.model.dao;

import br.eti.carloslima.clinformatica.model.dto.LoginDTO;

/**
 *
 * @author eduar
 */
public interface LoginDao {
    
    LoginDTO findByUsername(String userName);
}
