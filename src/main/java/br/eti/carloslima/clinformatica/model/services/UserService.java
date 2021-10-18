/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eti.carloslima.clinformatica.model.services;

import br.eti.carloslima.clinformatica.model.dao.DaoFactory;
import br.eti.carloslima.clinformatica.model.dao.UsuarioDao;
import br.eti.carloslima.clinformatica.model.entities.UserModel;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Classe Responsavel por fazer o controle em acesso ao banco de dados
 *
 * @author Carlos Lima
 */
public class UserService {

    private UsuarioDao dao = DaoFactory.createUsuarioDao();

    /**
     * Metodo que ira salva um novo usuario
     *
     * @param obj
     * @return Retorna um numero maior que 0 se salvar 0 se não salva
     */
    public int salvar(UserModel obj) {
        return dao.insert(obj);
    }

    /**
     * Metodo Responsavel por deleta um usuario
     *
     * @param id
     */
    public void Apagar(int id) {
        dao.delete(id);
    }

    /**
     * Metodo por recupera todos os Usuarios do banco
     *
     * @return Uma lista de Usuarios
     */
    public List<UserModel> SelecionarTudo() {
        return dao.findAll();
    }

    /**
     * Busca um usuario pelo numero de registro
     *
     * @param id
     * @return Retorna um Usuario refalente ao id passado
     */
    public UserModel SelecaoUnica(int id) {
        return dao.findById(id);
    }
    
    /**
     * Metodo que ira salva as modificação
     * @param obj 
     */
    public int Atualiza(UserModel obj){
        //impede de tenta atualiza um usuario que nao tenha id ou nao teja no
        // banco
        var linhas = 0;
        if(obj.getId() > 0){
          linhas =  dao.update(obj); 
        }else{
            JOptionPane.showMessageDialog(null, "Não pode modifica Usuario que nao existe! ID nulo.", "", JOptionPane.ERROR_MESSAGE);
        }
        return linhas;
    }
}
