
package br.eti.carloslima.clinformatica.model.dao;

import br.eti.carloslima.clinformatica.db.Db;
import br.eti.carloslima.clinformatica.model.dao.impl.AddresDaoImpl;
import br.eti.carloslima.clinformatica.model.dao.impl.ClientDaoImpl;
import br.eti.carloslima.clinformatica.model.dao.impl.GraficoImpl;
import br.eti.carloslima.clinformatica.model.dao.impl.LoginDaoImpl;
import br.eti.carloslima.clinformatica.model.dao.impl.ProdutoImpl;
import br.eti.carloslima.clinformatica.model.dao.impl.ServiceOrderDaoImpl;
import br.eti.carloslima.clinformatica.model.dao.impl.UsuarioDaoImpl;

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
    
    /**
     * Inicia a classe de implementação para trabalhor com
     * usuarios
     * @return UsuarioDao
     */
    public static UsuarioDao createUsuarioDao(){
        return new UsuarioDaoImpl(Db.getConnection());
    }
    
    public static AddresDao createAddresDao(){
        return new AddresDaoImpl(Db.getConnection());
    }
    
    public static ClientDao createClientDao(){
        return new ClientDaoImpl(Db.getConnection());
    }
    
    public static ServiceOrderDao createServiceOrderDao(){
        return new ServiceOrderDaoImpl(Db.getConnection());
    }
    
    public static GraficoDao createGraficoDao(){
        return new GraficoImpl(Db.getConnection());
    }
    
        public static ProdutoDao createProdutoDao(){
        return new ProdutoImpl(Db.getConnection());
    }
    
}
