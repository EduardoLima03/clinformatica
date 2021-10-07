package br.eti.carloslima.clinformatica.db;

/**
 * Class de Erro personalizado para o database
 *
 * @author eduar
 */
public class DbException extends RuntimeException {

    /**
     * Gera um Exception sem para a execusao do programa
     *
     * @param msg
     */
    public DbException(String msg) {
        super(msg);
    }
}
