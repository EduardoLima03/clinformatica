/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eti.carloslima.clinformatica.model.entities;

import br.eti.carloslima.clinformatica.model.entities.enums.ServiceSituation;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author eduar
 */
public class ServiceOrderModel implements Serializable {

    private Integer numSerOrder;
    private LocalDate dataSerOrder;
    private ServiceSituation status;
    private String equipamento;
    private String defeito;
    private String servicoRealizado;
    private BigDecimal valor;

    //depedencias
    private ClientModel cliente;
    private UserModel tecnico;

    public ServiceOrderModel() {
    }

    public ServiceOrderModel(Integer numSerOrder, LocalDate dataSerOrder, Integer status, String equipamento, String defeito, String servicoRealizado, String valor, ClientModel cliente, UserModel tecnico) {
        this.numSerOrder = numSerOrder;
        this.dataSerOrder = dataSerOrder;
        setStatus(status);
        this.equipamento = equipamento;
        this.defeito = defeito;
        this.servicoRealizado = servicoRealizado;
        setValor(valor);
        this.cliente = cliente;
        this.tecnico = tecnico;
    }

    public ServiceOrderModel(Integer status, String equipamento, String defeito, String valor, ClientModel cliente, UserModel tecnico) {
        setStatus(status);
        this.equipamento = equipamento;
        this.defeito = defeito;
        setValor(valor);
        this.cliente = cliente;
        this.tecnico = tecnico;
    }

    public Integer getNumSerOrder() {
        return numSerOrder;
    }

    public void setNumSerOrder(Integer numSerOrder) {
        this.numSerOrder = numSerOrder;
    }

    public LocalDate getDataSerOrder() {
        return dataSerOrder;
    }

    public void setDataSerOrder(LocalDate dataSerOrder) {
        this.dataSerOrder = dataSerOrder;
    }
    
    public int getStatus() {
        return status.getCode();
    }

    public void setStatus(int status) {
        this.status = ServiceSituation.valueOf(status);
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    public String getDefeito() {
        return defeito;
    }

    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }

    public String getServicoRealizado() {
        return servicoRealizado;
    }

    public void setServicoRealizado(String servicoRealizado) {
        this.servicoRealizado = servicoRealizado;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(String value) {
        this.valor = new BigDecimal(value).setScale(4, RoundingMode.HALF_EVEN);
    }

    public ClientModel getCliente() {
        return cliente;
    }

    public void setCliente(ClientModel cliente) {
        this.cliente = cliente;
    }

    public UserModel getTecnico() {
        return tecnico;
    }

    public void setTecnico(UserModel tecnico) {
        this.tecnico = tecnico;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.numSerOrder);
        hash = 79 * hash + Objects.hashCode(this.equipamento);
        hash = 79 * hash + Objects.hashCode(this.cliente);
        hash = 79 * hash + Objects.hashCode(this.tecnico);
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
        final ServiceOrderModel other = (ServiceOrderModel) obj;
        if (!Objects.equals(this.equipamento, other.equipamento)) {
            return false;
        }
        if (!Objects.equals(this.numSerOrder, other.numSerOrder)) {
            return false;
        }
        if (!Objects.equals(this.cliente, other.cliente)) {
            return false;
        }
        if (!Objects.equals(this.tecnico, other.tecnico)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ServiceOrderModel{" + "numSerOrder=" + numSerOrder + ", dataSerOrder=" + dataSerOrder + ", status=" + status + ", equipamento=" + equipamento + ", defeito=" + defeito + ", servicoRealizado=" + servicoRealizado + ", valor=" + valor + ", cliente=" + cliente.getNome()+" "+ cliente.getSobreNome() + ", tecnico=" + tecnico.getNome() + '}';
    }

}
