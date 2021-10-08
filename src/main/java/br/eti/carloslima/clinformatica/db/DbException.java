package br.eti.carloslima.clinformatica.db;

/**
 * Classe de Erro personalizado para a base de dados
 *
 * Custom Error Class for database
 * @author Carlos Lima
 */
public class DbException extends RuntimeException {

    /**
     * Gera um exerção sem para a execução do programa
     *
     * Generates an exercise without for the execution of the program
     * @param msg
     */
    public DbException(String msg) {
        super(msg);
    }
}
