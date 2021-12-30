/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eti.carloslima.clinformatica.model.services;

import br.eti.carloslima.clinformatica.model.dao.DaoFactory;
import br.eti.carloslima.clinformatica.model.dao.GraficoDao;

/**
 *
 * @author eduar
 */
public class GraficoService {

    private final GraficoDao dao = DaoFactory.createGraficoDao();

    /**
     * Metodo que busca a quantidade de serviços realizado em um ano
     *
     * @return Quantidade de registro em Int
     */
    public int totalAttendances() {
        return dao.quantidadeDeOrdemDeServicoTotal();
    }

    /**
     * Modelo de String as ser passada '2021-12-01 00:00:00'
     *
     * @param argumentos
     * @return
     */
    public int totalAttendancesOfTheMonth(String[] argumentos) {
        return dao.quantidadeDeOrdemDeServicoPorMes(argumentos);
    }

    /**
     * Pesquica a quantidate de atendimento sobre um tipo especifico 1 - para
     * orçamentos 2 - Ordem de Serviço
     *
     * @param argumentos data inicial, data final, tipo de atendimento
     * @return Int 0 para erro ou não ter encontrado nada
     */
    public int callsByType(String[] argumentos) {
        return dao.quantidadeDeRegistroPorTipo(argumentos);
    }

    /**
     * Realiza a consulta do faturamento atual
     *
     * @param datas data Inicial e data final do mes
     * @param tipoDeServico tipo Orçamento ou Ordem de Serviço
     * @return double com o valor da soma de todos os serviços do periodo e o
     * tipo escolhido
     */
    public double currentBilling(String[] datas, int tipoDeServico) {
        return dao.faturamentoMensal(datas, tipoDeServico);
    }
}
