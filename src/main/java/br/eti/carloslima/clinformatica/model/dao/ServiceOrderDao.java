/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eti.carloslima.clinformatica.model.dao;

import br.eti.carloslima.clinformatica.model.entities.ServiceOrderModel;
import java.util.List;

/**
 *
 * @author eduar
 */
public interface ServiceOrderDao {
    //retorna o id dos dados adicionado
    int insert(ServiceOrderModel order);
    //retorna o numero de linhas modificada
    int update(ServiceOrderModel order);
    //retorna o numero de linha modificada
    int delete(int id);
    
    List<ServiceOrderModel> selectAll();
    ServiceOrderModel selectById(int id);
    
}
