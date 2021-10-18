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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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

    /**
     * Responsavel por fazer a seleção de um Usuario.
     * @param id
     * @return 
     *  Retorna um Usuario vindo do banco de dados
     */
    @Override
    public UserModel findById(int id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        
        try {
            st = conn.prepareStatement("SELECT * FROM APP.USERS WHERE id = ?");
            st.setInt(1, id);
            
            rs = st.executeQuery();
            UserModel obj = new UserModel();
            
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
            Db.closeStatement(st);
            Db.closeResultSet(rs);
        }
    }

    /**
     * Metodo para todos os usuarios do banco
     * @return 
     *  Retorna uma lista de Usuario
     */
    @Override
    public List<UserModel> findAll() {
        Statement st = null;
        ResultSet rs = null;
        
        try {
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM APP.USERS");
            
            List<UserModel> list = new ArrayList<>();
            
            while (rs.next()) {                
                UserModel obj = new UserModel();
                obj.setId(rs.getInt("id"));
                obj.setName(rs.getString("name"));
                obj.setUserName(rs.getString("username"));
                obj.setPassword(rs.getString("password"));
                obj.setPerfil(rs.getInt("profile"));
                list.add(obj);
            }
            return list;
        } catch (SQLException ex) {
            throw new DbException(ex.getMessage());
        }finally{
            Db.closeStatement(st);
            Db.closeResultSet(rs);
        }
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
