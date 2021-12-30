
package br.eti.carloslima.clinformatica.model.dao;

/**
 *
 * @author eduar
 */
public interface GraficoDao {
    int quantidadeDeOrdemDeServicoTotal();
    int quantidadeDeOrdemDeServicoPorMes(String[] argumentos);
    double valorSemTotalDeOrdemDeServicoSemLucroDoMes(String[] argumentos);
    int quantidadeDeRegistroPorTipo(String[] argumentos);
    double faturamentoMensal(String[] datas, int tipoDeServico);
}
