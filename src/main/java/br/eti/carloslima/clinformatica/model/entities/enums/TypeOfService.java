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
public enum TypeOfService {
    ORÇAMENTO(1),
    ORDEM_DE_SERVIÇO(2);

    private int code;

    private TypeOfService(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static TypeOfService valueOf(int code) {
        for (TypeOfService value : TypeOfService.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Codigo de estatus errado");
    }
}
