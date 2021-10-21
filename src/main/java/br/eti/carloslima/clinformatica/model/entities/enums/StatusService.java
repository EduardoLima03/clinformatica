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
public enum StatusService {
    ORÇAMENTO(1),
    APROVADO(2),
    EM_SERVICO(3),
    CONCLUIDO(4);
    
    private int code;

    private StatusService(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
    
    public static StatusService valueOf(int code){
        for (StatusService value : StatusService.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Codigo de estatus errado");
    }
}
