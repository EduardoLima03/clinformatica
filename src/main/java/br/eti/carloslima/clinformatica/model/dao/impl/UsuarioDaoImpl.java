/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eti.carloslima.clinformatica.model.dao.impl;

import br.eti.carloslima.clinformatica.db.Db;
import br.eti.carloslima.clinformatica.db.DbException;
import br.eti.carloslima.clinformatica.model.dao.UsuarioDao;
import br.eti.carloslima.clinformatica.model.entities.UserModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eduar
 */
public class UsuarioDaoImpl implements UsuarioDao{
    
    private Connection conn;
    
    public UsuarioDaoImpl(Connection conn){
        this.conn = conn;
    }

    @Override
    public UserModel findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UserModel> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * 
     * @param obj
     * @return 
     *  Retorna o numero maio que 0 se salva corretamente e 
     *  retorna 0 para se nao conseguir salvar
     */
    @Override
    public int insert(UserModel obj) {
       PreparedStatement st = null;
        try {
            st = conn.prepareStatement(
                    "INSERT INTO APP.USERS(name, username, "
                            + "password, profile) VALUES(?, ?, ?, ?)");
            st.setString(1, obj.getName());
            st.setString(2, obj.getUserName());
            st.setString(3, obj.getPassword());
            st.setInt(4, obj.getPerfil());
            
            return st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
       return 0;
    }

    @Override
    public void update(UserModel obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        PreparedStatement st = null;
        
        try {
            st = conn.prepareStatement("DELETE FROM APP.USERS WHERE id = ?");
            st.setInt(1, id);
            //executando 
            st.execute();
        } catch (SQLException ex) {
            throw new DbException(ex.getMessage());
        }finally{
            Db.closeStatement(st);
        }
        
    }
    
}
