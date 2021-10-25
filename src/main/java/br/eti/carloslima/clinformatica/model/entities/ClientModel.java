/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eti.carloslima.clinformatica.model.entities;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author eduar
 */
public class ClientModel extends People implements Serializable {

    private String cpf;
    private String telefone;

    //Dependeicia
    private AddresModel residencia;

    public ClientModel() {
        super();
    }

    public ClientModel(Integer registro, String nome, String cpf, String telefone) {
        super(registro, nome);
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public ClientModel(Integer registro, String nome, String sobreNome,
            String cpf, String telefone) {
        super(registro, nome, sobreNome);
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public ClientModel(String cpf, String telefone, AddresModel residencia,
            Integer registro, String nome, String sobreNome) {
        super(registro, nome, sobreNome);
        this.cpf = cpf;
        this.telefone = telefone;
        this.residencia = residencia;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public AddresModel getResidencia() {
        return residencia;
    }

    public void setResidencia(AddresModel residencia) {
        this.residencia = residencia;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.cpf);
        hash = 29 * hash + Objects.hashCode(this.telefone);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ClientModel other = (ClientModel) obj;
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClientModel{"+ "Registro= " + super.getRegistro()+ " cpf=" + cpf + ", telefone=" + telefone + ", residencia=" + residencia + '}';
    }

}
