/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eti.carloslima.clinformatica.model.entities.enums;

/**
 *
 * @author eduar
 */
public enum Perfil {
    ADMINISTRADOR(1),
    GERENTE(2),
    TECNICO(3);

    public static Integer valueOf(Perfil perfil) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private int code;
    
    private Perfil(int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }
    
    /**
     * 
     * @param code
     * @return 
     */
    public static Perfil valueOf(int code){
        for(Perfil value : Perfil.values() ){
            if(value.getCode() == code){
                return value;
            }
        }
        throw new IllegalArgumentException("Codigo de perfil errado");
    }
}
