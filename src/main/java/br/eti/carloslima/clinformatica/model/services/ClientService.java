/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eti.carloslima.clinformatica.model.services;

import br.eti.carloslima.clinformatica.model.dao.ClientDao;
import br.eti.carloslima.clinformatica.model.dao.DaoFactory;
import br.eti.carloslima.clinformatica.model.entities.ClientModel;
import java.util.List;

/**
 *
 * @author Carlos Lima
 */
public class ClientService {

    private ClientDao dao = DaoFactory.createClientDao();

    public int salva(ClientModel obj) {
        return dao.insert(obj);
    }

    public int atualizar(ClientModel obj) {
        return dao.update(obj);
    }

    public int apagar(int id) {
        return dao.delete(id);

    }
    
    public List<ClientModel> buscaTodos(){
        return dao.selectAll();
    }
        
}
