/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eti.carloslima.clinformatica.model.services;

import br.eti.carloslima.clinformatica.model.dao.DaoFactory;
import br.eti.carloslima.clinformatica.model.dao.ServiceOrderDao;
import br.eti.carloslima.clinformatica.model.entities.ServiceOrderModel;
import javax.swing.JOptionPane;

/**
 *
 * @author eduar
 */
public class ServiceOrderService {

    private ServiceOrderDao dao = DaoFactory.createServiceOrderDao();

    /**
     * Metodo que ira salvar um nova ordem de serviço no banco de dados
     *
     * @param order
     * @return Retorna o Id do novo registro
     */
    public int salvar(ServiceOrderModel order) {
        return dao.insert(order);
    }

    /**
     * Realiza a consulta por uma ordem especifica
     *
     * @param id
     * @return Retorna uma Ordem de servico
     */
    public ServiceOrderModel buscaPorId(int id) {
        return dao.selectById(id);
    }

    /**
     * Deleta uma ordem de serviço
     * @param id
     * @return a confirmação se foi deletado com sucesso
     */
    public int erasingServiceOrder(int id) {
        if (id != 0) {
            return dao.delete(id);
        } else {
            JOptionPane.showMessageDialog(null, "Registro não localizado", "Erro ao deleta", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }
    
    /**
     * Metodo que ira atualizar uma ordem de serviço
     * @param order
     * @return 1 se atualizou com sucesso e 2 se não for salvo
     */
    public int atualizarOrdemServico(ServiceOrderModel order){
        return dao.update(order);
    }
}
