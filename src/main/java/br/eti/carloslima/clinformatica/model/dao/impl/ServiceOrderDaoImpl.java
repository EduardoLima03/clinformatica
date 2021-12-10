/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eti.carloslima.clinformatica.model.dao.impl;

import br.eti.carloslima.clinformatica.db.Db;
import br.eti.carloslima.clinformatica.db.DbException;
import br.eti.carloslima.clinformatica.model.dao.ServiceOrderDao;
import br.eti.carloslima.clinformatica.model.entities.AddresModel;
import br.eti.carloslima.clinformatica.model.entities.ClientModel;
import br.eti.carloslima.clinformatica.model.entities.ServiceOrderModel;
import br.eti.carloslima.clinformatica.model.entities.UserModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
            st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
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
        var sql = "SELECT a.*, c.*, u.*, o.* FROM APP.ORDEM_SERVICO AS o "
                + "JOIN cliente AS c ON c.IDCLIENTE = o.CLIENTE_IDCLIENTE "
                + "JOIN endereco AS a ON a.ID_ENDERECO = c.ENDERECO_IDENDERECO "
                + "JOIN users AS u ON u.ID = o.USUARIO_IDUSUARIO "
                + "WHERE o.ID_SERVICO = ?";
        ServiceOrderModel obj = null;
        
        PreparedStatement st = null;
        ResultSet rs = null;
        
        try {
            st = conn.prepareStatement(sql);
            st.setInt(1, id);
            
            rs = st.executeQuery();
            
            if(rs.next()){
                obj = new ServiceOrderModel();
                ClientModel client = new ClientModel();
                UserModel tecnico = new UserModel();
                AddresModel addres = new AddresModel();
                //criando o endereço
                addres.setId(rs.getInt("ID_ENDERECO"));
                addres.setLogradouro(rs.getString("LOGRADOURO"));
                addres.setNumero(rs.getString("NUMERO"));
                addres.setComplemento(rs.getString("COMPLEMENTO"));
                addres.setBairro(rs.getString("BAIRRO"));
                addres.setCep(rs.getString("CEP"));
                
                //criando o cliente
                client.setRegistro(rs.getInt("IDCLIENTE"));
                client.setNome(rs.getString("NOME"));
                client.setSobreNome(rs.getString("SOBRE_NOME"));
                client.setCpf(rs.getString("CPF"));
                client.setTelefone(rs.getString("FONE"));
                
                // Fazendo as ligaçoes entre objetos cliente e endereço
                client.setResidencia(addres);
                addres.setMoradores(client);
                
                //criando o obj para usuario
                tecnico.setRegistro(rs.getInt("ID"));
                tecnico.setNome(rs.getString("NAME"));
                tecnico.setUserName(rs.getString("USERNAME"));
                tecnico.setPassword(rs.getString("PASSWORD"));
                tecnico.setPerfil(rs.getInt("PROFILE"));
                
                // CRIANDO o obj para order
                obj.setNumSerOrder(rs.getInt("ID_SERVICO"));
                obj.setDataSerOrder(rs.getTimestamp("DATE_OS").toLocalDateTime());
                obj.setType(rs.getInt("TIPO_SERVICE"));
                obj.setEquipamento(rs.getString("EQUIPAMENTO"));
                obj.setDefeito(rs.getString("DEFEITO"));
                obj.setServicoRealizado(rs.getString("SERVICO"));
                obj.setValor(rs.getDouble("VALOR_TOTAL"));
                obj.setStatus(rs.getInt("STATUS"));
                
                //Relações entre os objetos
                obj.setTecnico(tecnico);
                obj.setCliente(client);
                
                tecnico.setManuntecoes(obj);
                
                client.setContratos(obj);
            }
        } catch (SQLException ex) {
            throw new DbException(ex.getMessage());
        }
        return obj;
    }
    
    
}
