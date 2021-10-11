
package br.eti.carloslima.clinformatica.model.dao.impl;

import br.eti.carloslima.clinformatica.db.Db;
import br.eti.carloslima.clinformatica.db.DbException;
import br.eti.carloslima.clinformatica.model.dao.LoginDao;
import br.eti.carloslima.clinformatica.model.entities.UserModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author eduar
 */
public class LoginDaoImpl implements LoginDao{
    
    private Connection conn;
    
    public LoginDaoImpl(Connection conn){
        this.conn = conn;
    }

    @Override
    public UserModel findByUsername(String userName) {
        PreparedStatement st = null;
        ResultSet rs = null;
        
        UserModel obj = new UserModel();
        
        try{
            st = conn.prepareStatement(
                    "SELECT * FROM APP.USERS WHERE username = ?"
            );
            
            st.setString(1, userName);
            
            rs = st.executeQuery();
            
            //criando um dto com a tabela retornada
            // da consulta
            if(rs.next()){
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("name"));
                obj.setUserName(rs.getString("username"));
                obj.setPassword(rs.getString("password"));
                obj.setPerfil(rs.getInt("profile"));
            }
            return obj;
        } catch (SQLException ex) {
            throw new DbException(ex.getMessage());
        }finally{
            Db.closeResultSet(rs);
            Db.closeStatement(st);
        }
    }
    
}
