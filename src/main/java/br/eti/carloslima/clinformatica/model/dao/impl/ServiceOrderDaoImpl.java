/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eti.carloslima.clinformatica.model.dao.impl;

import br.eti.carloslima.clinformatica.db.Db;
import br.eti.carloslima.clinformatica.db.DbException;
import br.eti.carloslima.clinformatica.model.dao.ServiceOrderDao;
import br.eti.carloslima.clinformatica.model.entities.ServiceOrderModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eduar
 */
public class ServiceOrderDaoImpl implements ServiceOrderDao{
    
    private Connection conn;
    
    public ServiceOrderDaoImpl(Connection conn){
        this.conn = conn;
    }

    @Override
    public int insert(ServiceOrderModel order) {
        String sql = "INSERT INTO APP.ORDEM_SERVICO(cliente_idCliente, "
                + "usuario_idUsuario, tipo_service, equipamento, defeito, "
                + "servico, valor_total, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement st = null;
        ResultSet rs = null;
        var row =0;
        
        try {
            st = conn.prepareStatement(sql);
            st.setInt(1, order.getCliente().getRegistro());
            st.setInt(2, order.getTecnico().getRegistro());
            st.setInt(3, order.getType());
            st.setString(4, order.getEquipamento());
            st.setString(5, order.getDefeito());
            st.setString(6, order.getServicoRealizado());
            st.setDouble(7, order.getValor());
            st.setInt(8, order.getStatus());
            
            st.executeUpdate();
            
            rs = st.getGeneratedKeys(); //cupera o id da linha inserida
            if(rs.next())
                row = rs.getInt(1);
        } catch (SQLException ex) {
             throw new DbException(ex.getMessage());
        }finally{
            Db.closeStatement(st);
            Db.closeResultSet(rs);
        }
        
        return row;
    }

    @Override
    public int update(ServiceOrderModel order) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ServiceOrderModel> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ServiceOrderModel selectById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
