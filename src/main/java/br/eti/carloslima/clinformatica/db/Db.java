package br.eti.carloslima.clinformatica.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 *
 * @author eduar
 */
public class Db {

    private static Connection conn = null;

    /**
     * Metodo responsavel por cria uma nova conexao com o banco
     *
     * @return conecxao com o banco de dados
     */
    public static Connection getConnection() {

        if (conn == null) {

            try {
                Properties props = loadProperties();
                String url = props.getProperty("dburl");
                conn = DriverManager.getConnection(url);
            } catch (SQLException ex) {
                throw new DbException(ex.getMessage());

            }
        }

        return conn;
    }

    private static Properties loadProperties() {
        try ( FileInputStream fs = new FileInputStream("db.properties")) {

            Properties props = new Properties();
            props.load(fs);
            return props;

        } catch (IOException e) {
            throw new DbException(e.getMessage());
        }
    }

    /**
     * Fecha a conexao com o banco de dados
     * Deve ser execultado a pos os fechamento do ResultSet e Statement,
     * closeResultSet(), @closeStatement
     * 
     */
    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    /**
     * Fecha a conexao do ResltSet
     * @param rs 
     */
    public static void closeResultSet(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }
    
    /**
     * Fecha a conexao do Statement
     * @param st 
     */
    public static void closeStatement(Statement st) {
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }
}
