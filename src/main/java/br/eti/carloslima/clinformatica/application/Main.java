/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eti.carloslima.clinformatica.application;

import br.eti.carloslima.clinformatica.model.dto.LoginDTO;
import br.eti.carloslima.clinformatica.model.services.LoginService;

/**
 *
 * @author eduar
 */
public class Main {
    public static void main(String[] args){
        System.out.println("login");
        String userName = "lima";
        LoginService instance = new LoginService();
        LoginDTO expResult = new LoginDTO("lima", "1234", 1);
        LoginDTO result = instance.login(userName);
        
        //Compra se as class sao igual
        //se o dado do banco é o mesmo
        if(result.equals(expResult)){
            System.out.println("Dados igual, banco funcionando");
        }else{
            System.out.println("Deu erro");
        }
    }

}
