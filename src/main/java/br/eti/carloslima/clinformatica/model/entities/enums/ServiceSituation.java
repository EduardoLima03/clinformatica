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
public enum ServiceSituation {
    ORÇAMENTO(1),
    APROVADO(2),
    EM_SERVICO(3),
    AGUARDANDO_PEÇA(4),
    CONCLUIDO(5),
    ENTREGUE(6),
    ORÇAMENTO_VENCIDO(7),
    CANCELADO(8);
    
    private int code;

    private ServiceSituation(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
    
    public static ServiceSituation valueOf(int code){
        for (ServiceSituation value : ServiceSituation.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Codigo de estatus errado");
    }
}
