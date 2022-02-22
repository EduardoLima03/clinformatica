
package br.eti.carloslima.clinformatica.model.dao;

/**
 *
 * @author eduar
 */
public interface GraficoDao {
    int totalDeServicos();
    int totalDeAtendimentosNoMes(String[] argumentos);
    double valorSemTotalDeOrdemDeServicoSemLucroDoMes(String[] argumentos);
    int totalDeOrcamentoNoMes(String[] argumentos);
    /**
     * 
     * @param argumentos Array de String contendo a data inical do mes e o dia final do mes
     * @return Total de serviçoes que esta sendo realizado e esperando para iniciar
     */
    short totalDeServicosNoMes(String[] data);
    /**
     * 
     * @param argumentos Array de String contendo a data inical do mes e o dia final do mes
     * @return total de serviçoes concluido na data passada
     */
    short totalDeServicosConcluidoNoMes(String[] argumentos);
    double faturamentoMensalPedente(String[] datas);
    
    double faturamentoMensalConcluido(String[] data);
}
