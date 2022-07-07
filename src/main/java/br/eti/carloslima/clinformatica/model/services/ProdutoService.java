/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eti.carloslima.clinformatica.model.services;

import br.eti.carloslima.clinformatica.model.dao.DaoFactory;
import br.eti.carloslima.clinformatica.model.dao.ProdutoDao;
import br.eti.carloslima.clinformatica.model.entities.Produto;

/**
 *
 * @author eduar
 */
public class ProdutoService {
    
    private ProdutoDao dao = DaoFactory.createProdutoDao();
    
    public Produto selecionar(short id) {
        return dao.select(id);
    }
}
