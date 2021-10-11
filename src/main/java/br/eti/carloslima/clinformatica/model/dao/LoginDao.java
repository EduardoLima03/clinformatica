
package br.eti.carloslima.clinformatica.model.dao;

import br.eti.carloslima.clinformatica.model.entities.UserModel;

/**
 *
 * @author Carlos Lima
 */
public interface LoginDao {
    
    UserModel findByUsername(String userName);
}
