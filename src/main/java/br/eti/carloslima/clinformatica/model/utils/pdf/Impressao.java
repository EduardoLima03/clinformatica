/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.eti.carloslima.clinformatica.model.utils.pdf;

import br.eti.carloslima.clinformatica.model.entities.ServiceOrderModel;

/**
 *
 * @author eduar
 */
public interface Impressao {

    public void orcamento(ServiceOrderModel obj);

    public void garantia();

    public void ordemDeServico();
}
