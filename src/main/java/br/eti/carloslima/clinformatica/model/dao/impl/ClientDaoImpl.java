/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eti.carloslima.clinformatica.model.dao.impl;

import br.eti.carloslima.clinformatica.db.Db;
import br.eti.carloslima.clinformatica.db.DbException;
import br.eti.carloslima.clinformatica.model.dao.ClientDao;
import br.eti.carloslima.clinformatica.model.entities.AddresModel;
import br.eti.carloslima.clinformatica.model.entities.ClientModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos Lima
 */
public class ClientDaoImpl implements ClientDao {

    private Connection conn;

    public ClientDaoImpl(Connection conn) {
        this.conn = conn;
    }

    /**
     * Metodo que ira salva um novo Cliente na base de dados
     *
     * @param obj
     * @return Retorna o id do cliente que foi salvo com esse metodo
     */
    @Override
    public int insert(ClientModel obj) {
        String sql = "INSERT INTO APP.CLIENTE(nome, sobre_nome, cpf, fone, endereco_idendereco) VALUES(?, ?, ?, ?, ?)";
        PreparedStatement st = null;
        ResultSet rs = null;
        int row = 0;

        try {
            st = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            st.setString(1, obj.getNome());
            st.setString(2, obj.getSobreNome());
            st.setString(3, obj.getCpf());
            st.setString(4, obj.getTelefone());
            st.setInt(5, obj.getResidencia().getId());

            st.executeUpdate();

            //recebe o dados salvo apos ser executado
            rs = st.getGeneratedKeys();
            if (rs.next()) //recupera so o id do objeto
            {
                row = rs.getInt(1);
            }

        } catch (SQLException ex) {
            throw new DbException(ex.getMessage());
        } finally {
            Db.closeStatement(st);
            Db.closeResultSet(rs);
        }

        return row;
    }

    /**
     * Usado para nodifica algum campo do cliente
     *
     * @param obj
     * @return Retorna o numero inteiro de linhas modificadas. È previsto o
     * retorno de 1
     */
    @Override
    public int update(ClientModel obj) {
        int row;
        String sql = "UPDATE APP.CLIENTE SET nome = ?, sobre_nome = ?, "
                + "cpf = ?, fone = ?, endereco_idendereco = ? WHERE id = ?";
        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, obj.getNome());
            st.setString(2, obj.getSobreNome());
            st.setString(3, obj.getCpf());
            st.setString(4, obj.getTelefone());
            st.setInt(5, obj.getResidencia().getId());
            st.setInt(6, obj.getRegistro());

            //recupera o numero de linhas alterada com o comando a cima
            row = st.executeUpdate();
        } catch (SQLException ex) {
            throw new DbException(ex.getMessage());
        } finally {
            Db.closeStatement(st);
        }
        return row;
    }

    @Override
    public ClientModel selectByRegistro(int id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        ClientModel client = new ClientModel();
        var sql = "SELECT c.IDCLIENTE, c.NOME, c.SOBRE_NOME, c.CPF, c.FONE, e.* "
                + "FROM cliente as c JOIN endereco as e on e.ID_ENDERECO = "
                + "c.ENDERECO_IDENDERECO WHERE c.IDCLIENTE = ?";

        try {
            st = conn.prepareStatement(sql);
            
            st.setInt(1, id);

            //execulta
            rs = st.executeQuery();

            while (rs.next()) {
                AddresModel addres = new AddresModel();

                client.setRegistro(rs.getInt(1));
                client.setNome(rs.getString(2));
                client.setSobreNome(rs.getString(3));
                client.setCpf(rs.getString(4));
                client.setTelefone(rs.getString(5));

                addres.setId(rs.getInt(6));
                addres.setLogradouro(rs.getString(7));
                addres.setNumero(rs.getString(8));
                addres.setComplemento(rs.getString(9));
                addres.setBairro(rs.getString(10));
                addres.setCep(rs.getString(11));

                client.setResidencia(addres);
                addres.setMoradores(client);
            }
        } catch (SQLException ex) {
            throw new DbException(ex.getMessage());
        }finally{
            Db.closeStatement(st);
            Db.closeResultSet(rs);
        }

        return client;
    }

    @Override
    public ClientModel selectByName(String rua) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int id) {
        int row = 0;

        String sql = "DELETE FROM APP.CLIENTE WHERE idcliente = ?";

        PreparedStatement st = null;
        try {
            st = conn.prepareStatement(sql);
            st.setInt(1, id);

            row = st.executeUpdate();
        } catch (SQLException ex) {
            throw new DbException(ex.getMessage());
        } finally {
            Db.closeStatement(st);
        }

        return row;
    }

    @Override
    public List<ClientModel> selectAll() {
        Statement st = null;
        ResultSet rs = null;
        List<ClientModel> clients = new ArrayList<>();
        var sql = "SELECT c.IDCLIENTE, c.NOME, c.SOBRE_NOME, c.CPF, c.FONE, e.* "
                + "FROM cliente as c JOIN endereco as e on e.ID_ENDERECO = c.ENDERECO_IDENDERECO";

        try {
            st = conn.createStatement();

            rs = st.executeQuery(sql);

            while (rs.next()) {
                ClientModel cli = new ClientModel();
                AddresModel addres = new AddresModel();

                cli.setRegistro(rs.getInt(1));
                cli.setNome(rs.getString(2));
                cli.setSobreNome(rs.getString(3));
                cli.setCpf(rs.getString(4));
                cli.setTelefone(rs.getString(5));

                addres.setId(rs.getInt(6));
                addres.setLogradouro(rs.getString(7));
                addres.setNumero(rs.getString(8));
                addres.setComplemento(rs.getString(9));
                addres.setBairro(rs.getString(10));
                addres.setCep(rs.getString(11));

                cli.setResidencia(addres);
                addres.setMoradores(cli);

                clients.add(cli);
            }
        } catch (SQLException ex) {
            throw new DbException(ex.getMessage());
        }finally{
            Db.closeStatement(st);
            Db.closeResultSet(rs);
        }

        return clients;
    }

}
