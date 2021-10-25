/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eti.carloslima.clinformatica.model.dao.impl;

import br.eti.carloslima.clinformatica.db.Db;
import br.eti.carloslima.clinformatica.db.DbException;
import br.eti.carloslima.clinformatica.model.dao.AddresDao;
import br.eti.carloslima.clinformatica.model.entities.AddresModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author eduar
 */
public class AddresDaoImpl implements AddresDao {

    private Connection conn = null;

    public AddresDaoImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public int insert(AddresModel obj) {
        String sql = "INSERT INTO APP.ENDERECO(logradouro, numero, "
                + "complemento, bairro, cep) VALUES(?, ?, ?, ?, ?)";
        PreparedStatement st = null;
        ResultSet rs = null;
        int row =0;

        try {
            st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setString(1, obj.getLogradouro());
            st.setString(2, obj.getNumero());
            st.setString(3, obj.getComplemento());
            st.setString(4, obj.getBairro());
            st.setString(5, obj.getCep());

            
            st.executeUpdate();
            
            rs = st.getGeneratedKeys();
            if(rs.next())
                row = rs.getInt(1);

        } catch (SQLException ex) {
            throw new DbException(ex.getMessage());
        } finally {
            Db.closeStatement(st);
        }

        return row;
    }

    @Override
    public int update(AddresModel obj) {
        int row;
        String sql = "UPDATE APP.ENDERECO SET logradouro = ?, numero = ?, "
                + "complemento = ?, bairro = ?, cep = ? WHERE id = ?";        
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, obj.getLogradouro());
            st.setString(2, obj.getNumero());
            st.setString(3, obj.getComplemento());
            st.setString(4, obj.getBairro());
            st.setString(5, obj.getCep());
            st.setInt(6, obj.getId());

            row = st.executeUpdate();
        } catch (SQLException ex) {
            throw new DbException(ex.getMessage());
        } finally {
            Db.closeStatement(st);
        }
        return row;
    }

    @Override
    public AddresModel select(int id) {
        String sql = "SELECT * FROM APP.ENDERECO WHERE id = ?";
        PreparedStatement st = null;
        ResultSet rs = null;
        AddresModel obj = new AddresModel();

        try {
            st = conn.prepareStatement(sql);
            st.setInt(1, id);

            rs = st.executeQuery();

            if (rs.next()) {
                obj.setId(rs.getInt("id_endereco"));
                obj.setLogradouro(rs.getString("logradouro"));
                obj.setNumero(rs.getString("numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCep(rs.getString("cep"));

                return obj;
            }
        } catch (SQLException ex) {
            throw new DbException(ex.getMessage());
        } finally {
            Db.closeStatement(st);
            Db.closeResultSet(rs);
        }

        return null;
    }

    @Override
    public AddresModel selectByLogradouro(String rua) {
        String sql = "SELECT * FROM APP.ENDERECO WHERE id = ?";
        PreparedStatement st = null;
        ResultSet rs = null;
        AddresModel obj = new AddresModel();

        try {
            st = conn.prepareStatement(sql);
            st.setString(1, rua);

            rs = st.executeQuery();

            if (rs.next()) {
                obj.setId(rs.getInt("id_endereco"));
                obj.setLogradouro(rs.getString("logradouro"));
                obj.setNumero(rs.getString("numero"));
                obj.setComplemento(rs.getString("complemento"));
                obj.setBairro(rs.getString("bairro"));
                obj.setCep(rs.getString("cep"));

                return obj;
            }
        } catch (SQLException ex) {
            throw new DbException(ex.getMessage());
        } finally {
            Db.closeStatement(st);
            Db.closeResultSet(rs);
        }

        return null;
    }

}
