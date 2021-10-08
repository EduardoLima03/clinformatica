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
 * @author Carlos Lima
 */
public class Db {

    private static Connection conn = null;

    /**
     * Método responsável por cria uma nova conexão com o banco
     *
     * Method responsible for creating a new connection to the bank
     * @return conexao com o banco de dados
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
     * Fecha a conexão com o banco de dados
     * Deve ser executado pôs o fechamento do ResultSet e Statement,
     * closeResultSet(), @closeStatement
     *
     * Closes the connection to the database
     * Must be executed put the closing of the ResultSet and Statement,
     * closeResultSet(), @closeStatement
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
     *
     * Closes the Resultset connection
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
     *
     * Closes the Statement connection
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
