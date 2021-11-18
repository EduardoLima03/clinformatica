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
    
    /**
     * Pesquisa no banco se existe clientes que o nome inici com o a letra 
     * informada
     *  --- Metodo descontinuado ---
     * @param caract
     * @return retorna uma lista de Clentes que atende os caracteres pasado
     */
    public List<ClientModel> pesquisaespecial(String caract){
        if(caract.contains("%")){
            System.out.println("+++++"+caract+"++++++");
            return dao.selectByName(caract);
        }
        
        return null;
    }
    
    public ClientModel buscaById(int id){
        return dao.selectByRegistro(id);
    }
        
}
