
package br.eti.carloslima.clinformatica.model.dao;

import br.eti.carloslima.clinformatica.model.dto.LoginDTO;

/**
 *
 * @author Carlos Lima
 */
public interface LoginDao {
    
    LoginDTO findByUsername(String userName);
}
