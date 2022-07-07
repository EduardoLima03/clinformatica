/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eti.carloslima.clinformatica.model.dao.impl;

import br.eti.carloslima.clinformatica.db.Db;
import br.eti.carloslima.clinformatica.db.DbException;
import br.eti.carloslima.clinformatica.model.dao.ProdutoDao;
import br.eti.carloslima.clinformatica.model.entities.Produto;
import java.math.BigDecimal;
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
public class ProdutoImpl implements ProdutoDao{

    private Connection conn;
    
    public ProdutoImpl(Connection conn){
        this.conn = conn;
    }
    
    @Override
    public int insert(Produto obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Produto select(int id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        Produto obj = new Produto();
        
        try {
            st = conn.prepareStatement("SELECT * FROM APP.PRODUTO WHERE ID = ?");
            st.setInt(1, id);
            
            rs = st.executeQuery();
   
            if(rs.next()){
                obj.setId(rs.getInt("id"));
                obj.setDescricao(rs.getString("descricao"));
                obj.setPreco(new BigDecimal(rs.getDouble("preco")));
            }            
        } catch (SQLException ex) {
            throw new DbException("Nao foi posivel locarizar o produto");
        }finally{
            Db.closeStatement(st);
            Db.closeResultSet(rs);
        }
        return obj;
    }
    
}
