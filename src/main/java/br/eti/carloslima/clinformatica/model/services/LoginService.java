
package br.eti.carloslima.clinformatica.model.services;

import br.eti.carloslima.clinformatica.model.dao.DaoFactory;
import br.eti.carloslima.clinformatica.model.dao.LoginDao;
import br.eti.carloslima.clinformatica.model.dto.LoginDTO;

/**
 *
 * @author Carlos Lima
 */
public class LoginService {
    private LoginDao dao = DaoFactory.createLoginDao();
    
    /**
     * Método que retorna os dados necessário para realiza o login
     * Method that returns the data needed to log in 
     * @param userName
     * @return LoginDTO
     */
    public LoginDTO login(String userName){
        return dao.findByUsername(userName);
    }
}
