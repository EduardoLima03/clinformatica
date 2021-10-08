
package br.eti.carloslima.clinformatica.model.dao.impl;

import br.eti.carloslima.clinformatica.db.Db;
import br.eti.carloslima.clinformatica.model.dao.LoginDao;
import br.eti.carloslima.clinformatica.model.dto.LoginDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public LoginDTO findByUsername(String userName) {
        PreparedStatement st = null;
        ResultSet rs = null;
        
        LoginDTO obj = new LoginDTO();
        
        try{
            st = conn.prepareStatement(
                    "SELECT username, password, profile FROM APP.USERS WHERE username = ?"
            );
            
            st.setString(1, userName);
            
            rs = st.executeQuery();
            
            //criando um dto com a tabela retornada
            // da consulta
            if(rs.next()){
                obj.setUserName(rs.getString(1));
                obj.setPassword(rs.getString(2));
                obj.setPerfil(rs.getInt(3));
            }
            return obj;
        } catch (SQLException ex) {
            Logger.getLogger(LoginDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            Db.closeResultSet(rs);
            Db.closeStatement(st);
            Db.closeConnection();
        }
        return null;
    }
    
}
