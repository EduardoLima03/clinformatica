package br.eti.carloslima.clinformatica.model.dao.impl;

import br.eti.carloslima.clinformatica.db.Db;
import br.eti.carloslima.clinformatica.db.DbException;
import br.eti.carloslima.clinformatica.model.dao.GraficoDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author eduar
 */
public class GraficoImpl implements GraficoDao {

    private Connection conn = null;

    public GraficoImpl(Connection conn) {
        this.conn = conn;
    }

    /**
     * Metodo que busca a quantidade de serviços realizado em um ano
     *
     * @return Quantidade de registro em Int
     */
    @Override
    public int totalDeServicos() {
        var sql = "SELECT COUNT(id_servico) FROM APP.ORDEM_SERVICO";
        var quantidadeDeRegistro = 0;

        Statement st = null;
        ResultSet rs = null;

        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                quantidadeDeRegistro = rs.getInt("1");
            }
        } catch (SQLException ex) {
            throw new DbException(ex.getMessage());
        } finally {
            Db.closeStatement(st);
            Db.closeResultSet(rs);
        }

        return quantidadeDeRegistro;
    }

    /**
     * Modelo de String as ser passada '2021-12-01'
     *
     * @param argumentos
     * @return
     */
    @Override
    public int totalDeAtendimentosNoMes(String[] argumentos) {
        var sql = "SELECT count(date_os) FROM APP.ORDEM_SERVICO WHERE date_os BETWEEN ? AND ?";
        var quantidadeDeRegistroNoMes = 0;

        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement(sql);

            st.setString(1, argumentos[0]);
            st.setString(2, argumentos[1]);

            rs = st.executeQuery();

            if (rs.next()) {
                quantidadeDeRegistroNoMes = (rs.getInt("1") > 0) ? rs.getInt("1") : 0;
            }
        } catch (SQLException ex) {
            throw new DbException(ex.getMessage());
        } finally {
            Db.closeStatement(st);
            Db.closeResultSet(rs);
        }

        return quantidadeDeRegistroNoMes;
    }

    /**
     * Pesquica a quantidate de atendimento sobre um tipo especifico 1 - para
     * orçamentos 2 - Ordem de Serviço
     *
     * @param argumentos data inicial, data final, tipo de atendimento
     * @return Int 0 para erro ou não ter encontrado nada
     */
    @Override
    public int totalDeOrcamentoNoMes(String[] argumentos) {
        var sql = "SELECT count(ORDEM_SERVICO.STATUS) FROM APP.ORDEM_SERVICO WHERE "
                + "date_os BETWEEN ? AND ? AND STATUS = 1";
        PreparedStatement st = null;
        ResultSet rs = null;
        int quantidadeDeRegistros = 0;

        try {
            st = conn.prepareStatement(sql);
            st.setString(1, argumentos[0]);
            st.setString(2, argumentos[1]);

            rs = st.executeQuery();

            if (rs.next()) {
                quantidadeDeRegistros = rs.getInt("1");
            }

        } catch (SQLException ex) {

        } finally {
            Db.closeStatement(st);
            Db.closeResultSet(rs);
        }

        return quantidadeDeRegistros;

    }

    /**
     * Realiza a consulta do faturamento atual
     *
     * @param datas data Inicial e data final do mes
     * @param tipoDeServico tipo Orçamento ou Ordem de Serviço
     * @return double com o valor da soma de todos os serviços do periodo e o
     * tipo escolhido
     */
    @Override
    public double faturamentoMensalPedente(String[] datas) {
        var sql = "SELECT SUM(valor_total) FROM ordem_servico WHERE "
                + "date_os BETWEEN ? AND ? AND status BETWEEN 1 AND 5";
        double faturamento = 0;
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement(sql);
            st.setString(1, datas[0]);
            st.setString(2, datas[1]);

            rs = st.executeQuery();

            if (rs.next()) {
                faturamento = rs.getDouble("1");
            }

        } catch (SQLException ex) {
            throw new DbException(ex.getMessage());
        } finally {
            Db.closeStatement(st);
            Db.closeResultSet(rs);
        }

        return faturamento;

    }

    @Override
    public short totalDeServicosNoMes(String[] argumentos) {
        var sql = "SELECT COUNT(*) AS quantidade FROM APP.ORDEM_SERVICO WHERE STATUS BETWEEN 2 AND 5 AND DATE_OS ? AND ?";
        short total = 0;
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement(sql);
            st.setString(1, argumentos[0]);
            st.setString(2, argumentos[1]);

            rs = st.executeQuery();

            if (rs.next()) {
                total = rs.getShort("1");
            }

        } catch (SQLException ex) {
            throw new DbException(ex.getMessage());
        } finally {
            Db.closeResultSet(rs);
            Db.closeStatement(st);
        }

        return total;
    }

    @Override
    public short totalDeServicosConcluidoNoMes(String[] argumentos) {
        var sql = "SELECT COUNT(*) FROM APP.ORDEM_SERVICO WHERE status BETWEEN 5 AND 6 AND date_os BETWEEN ? AND ?";
        short total = 0;
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement(sql);
            st.setString(1, argumentos[0]);
            st.setString(2, argumentos[1]);

            rs = st.executeQuery();

            if (rs.next()) {
                total = rs.getShort("1");
            }

        } catch (SQLException ex) {
            throw new DbException(ex.getMessage());
        } finally {
            Db.closeResultSet(rs);
            Db.closeStatement(st);
        }

        return total;
    }

    @Override
    public double faturamentoMensalConcluido(String[] data) {
        var sql = "SELECT SUM(valor_total) FROM ordem_servico WHERE "
                + "date_os BETWEEN ? AND ? AND status = 6";
        double faturamento = 0;
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            st = conn.prepareStatement(sql);
            st.setString(1, data[0]);
            st.setString(2, data[1]);

            rs = st.executeQuery();

            if (rs.next()) {
                faturamento = rs.getDouble("1");
            }

        } catch (SQLException ex) {
            throw new DbException(ex.getMessage());
        } finally {
            Db.closeStatement(st);
            Db.closeResultSet(rs);
        }

        return faturamento;
    }

    @Override
    public double valorSemTotalDeOrdemDeServicoSemLucroDoMes(String[] argumentos) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
