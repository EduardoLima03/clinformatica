
package br.eti.carloslima.clinformatica.model.dao;

import br.eti.carloslima.clinformatica.db.Db;
import br.eti.carloslima.clinformatica.model.dao.impl.LoginDaoImpl;

/**
 * Criar a conexão com a base de dados
 * Create the connection to the database
 * @author Carlos Lima
 */
public class DaoFactory {
    
    /**
     * Inicia a classe de implementação para login
     * Starts the deployment class for login
     * @return LoginDaoImpl
     */
    public static LoginDao createLoginDao(){
        return new LoginDaoImpl(Db.getConnection());
    }
}
