
package br.eti.carloslima.clinformatica.gui;

import br.eti.carloslima.clinformatica.model.services.GraficoService;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author eduar
 */
public class DashboardScreen extends javax.swing.JInternalFrame {

    /**
     * Creates new form Dashboard
     */
    public DashboardScreen() {
        initComponents();
        initLabels();
        
        lblMesAtual.setText(mes(dateDoDia.getMonthValue()));
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblMesAtual = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblOrcamentosAtual = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblServicosAtual = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblFaturamentoPendente = new javax.swing.JLabel();
        pnBalancoSemanal = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblFaturamentoAtual = new javax.swing.JLabel();
        pnBalancoTrimestral = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Dashboard");
        setPreferredSize(new java.awt.Dimension(1072, 700));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Mês Atual:");

        lblMesAtual.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Orçamentos");

        lblOrcamentosAtual.setBackground(new java.awt.Color(255, 255, 255));
        lblOrcamentosAtual.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblOrcamentosAtual.setForeground(new java.awt.Color(255, 255, 255));
        lblOrcamentosAtual.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(lblOrcamentosAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblOrcamentosAtual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Serviços");

        lblServicosAtual.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblServicosAtual.setForeground(new java.awt.Color(255, 255, 255));
        lblServicosAtual.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblServicosAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblServicosAtual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Faturamento Pendente");

        lblFaturamentoPendente.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblFaturamentoPendente.setForeground(new java.awt.Color(255, 255, 255));
        lblFaturamentoPendente.setText("R$ 0,00");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFaturamentoPendente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFaturamentoPendente)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnBalancoSemanal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnBalancoSemanalLayout = new javax.swing.GroupLayout(pnBalancoSemanal);
        pnBalancoSemanal.setLayout(pnBalancoSemanalLayout);
        pnBalancoSemanalLayout.setHorizontalGroup(
            pnBalancoSemanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );
        pnBalancoSemanalLayout.setVerticalGroup(
            pnBalancoSemanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 255));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Faturamento Atual");

        lblFaturamentoAtual.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblFaturamentoAtual.setForeground(new java.awt.Color(255, 255, 255));
        lblFaturamentoAtual.setText("R$ 0,00");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(lblFaturamentoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFaturamentoAtual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pnBalancoTrimestral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnBalancoTrimestralLayout = new javax.swing.GroupLayout(pnBalancoTrimestral);
        pnBalancoTrimestral.setLayout(pnBalancoTrimestralLayout);
        pnBalancoTrimestralLayout.setHorizontalGroup(
            pnBalancoTrimestralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnBalancoTrimestralLayout.setVerticalGroup(
            pnBalancoTrimestralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1044, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(lblMesAtual))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(pnBalancoSemanal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(pnBalancoTrimestral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 646, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(pnBalancoTrimestral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(lblMesAtual))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(34, 34, 34)
                            .addComponent(pnBalancoSemanal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jScrollPane1.setViewportView(jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        setBounds(0, 0, 976, 700);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFaturamentoAtual;
    private javax.swing.JLabel lblFaturamentoPendente;
    private javax.swing.JLabel lblMesAtual;
    private javax.swing.JLabel lblOrcamentosAtual;
    private javax.swing.JLabel lblServicosAtual;
    private javax.swing.JPanel pnBalancoSemanal;
    private javax.swing.JPanel pnBalancoTrimestral;
    // End of variables declaration//GEN-END:variables

    /* Meu Codigo */
    
    private final GraficoService graficoService = new GraficoService();
    
    
    /*
        Automatiza os balanços atual, assim que a tela é criada
    */
    LocalDate dateDoDia = LocalDate.now();
    /**
     * 
     */
    private void balancoSemanalAtual(){
        LocalDate primeiroDia = dateDoDia.with(TemporalAdjusters.lastDayOfMonth());
        
        Map<String, Integer> valores = new HashMap<>();
        
        String[] semana1 = {primeiroDia.atStartOfDay().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), primeiroDia.plusDays(6).atStartOfDay().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))};
        String[] semana2 = {primeiroDia.plusDays(7).atStartOfDay().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), primeiroDia.plusDays(7 + 6).atStartOfDay().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))};
        String[] semana3 = {primeiroDia.plusDays(7 + 6).atStartOfDay().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), primeiroDia.plusDays(6 + 7 + 6).atStartOfDay().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))};
        String[] semana4 = {primeiroDia.plusDays(6 + 7 + 6).atStartOfDay().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")), primeiroDia.plusDays(6 + 7 + 6 + 6).atStartOfDay().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))};
        
        int quantidade1semana = graficoService.totalAttendancesOfTheMonth(semana1);
        int quantidade2semana = graficoService.totalAttendancesOfTheMonth(semana2);
        int quantidade3semana = graficoService.totalAttendancesOfTheMonth(semana3);
        int quantidade4semana = graficoService.totalAttendancesOfTheMonth(semana4);
        
        valores.put("Semana 1", quantidade1semana);
        valores.put("Semana 2", quantidade2semana);
        valores.put("Semana 3", quantidade3semana);
        valores.put("Semana 4", quantidade4semana);
        
        Set<String> keys = valores.keySet(); // obtem as chaves
        
        //classifica as chaves
        TreeSet<String> chavesClasificadas = new TreeSet<>(keys);
                
        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        
        for(String key : chavesClasificadas){
            dcd.setValue(valores.get(key), " ", key);
        }
        
        //Gera o grafico
        JFreeChart jchart = ChartFactory.createBarChart("Balanco Semanal", 
                null, "Serviços Realizados", dcd, 
                PlotOrientation.VERTICAL, false, false, false);
        
        //Gera um painel de apresentação do grafico
        ChartPanel chartPanel = new ChartPanel(jchart);
        //Define o tamanho do painel ou grafico
        chartPanel.setPreferredSize(new Dimension(490,290));
        
        pnBalancoSemanal.setLayout(new java.awt.BorderLayout());
        // Adiciona o grafico ao painel criado no seu frame.
        pnBalancoSemanal.add(chartPanel, BorderLayout.CENTER);
        pnBalancoSemanal.validate();
    }
    
    private void registroAtualDosAtendimentos(){
        String[] dataoOrçamento = {primeiroDiaDoMes(), ultimoDiaDoMes(), "1"};
        String[] dataServico = {primeiroDiaDoMes(), ultimoDiaDoMes(), "2"};
        int quantidadeDeRegistroOrçamento = graficoService
                .totalBudget(dataoOrçamento);
        int quantidadeDeRegistroServico = graficoService
                .totalServices(dataoOrçamento);
        
        lblOrcamentosAtual.setText(Integer.toString(quantidadeDeRegistroOrçamento));
        lblServicosAtual.setText(Integer.toString(quantidadeDeRegistroServico));
    }
    
    private void balancoTrimestral(){
        
        Map<String, Integer> valores = new HashMap<String, Integer>();
        
        String[] atual = {primeiroDiaDoMes(), ultimoDiaDoMes()};
        String[] antepenutimo = {primeiroDiaDoMes(dateDoDia.getMonth().getValue()
                - 2), ultimoDiaDoMes(dateDoDia.getMonth().getValue() - 2)};
        String[] penutimo = {primeiroDiaDoMes(dateDoDia.getMonth().getValue() 
                - 1), ultimoDiaDoMes(dateDoDia.getMonth().getValue() - 1)};
        int quantidadeAntepenutimo = graficoService.totalAttendancesOfTheMonth(antepenutimo);
        int quantidadePenutimo = graficoService.totalAttendancesOfTheMonth(penutimo);
        int quantidadeAtual = graficoService.totalAttendancesOfTheMonth(atual);
       
        
        
        valores.put(mes(dateDoDia.getMonth().getValue() - 2), quantidadeAntepenutimo);
        valores.put(mes(dateDoDia.getMonth().getValue() - 1), quantidadePenutimo);
        valores.put(mes(dateDoDia.getMonth().getValue()), quantidadeAtual);
        
        Set<String> keys = valores.keySet(); // obtem as chaves
        
        //classifica as chaves
        TreeSet<String> chavesClasificadas = new TreeSet<>(keys);
                
        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        
        for(String key : chavesClasificadas){
            dcd.setValue(valores.get(key), " ", key);
        }
        
        //Gera o grafico
        JFreeChart jchart = ChartFactory.createBarChart("Balanço Trimestral", 
                null, "Atendimentos Realizados", dcd, 
                PlotOrientation.VERTICAL, false, false, false);
        
        //Gera um painel de apresentação do grafico
        ChartPanel chartPanel = new ChartPanel(jchart);
        //Define o tamanho do painel ou grafico
        chartPanel.setPreferredSize(new Dimension(488,288));
        
        pnBalancoTrimestral.setLayout(new java.awt.BorderLayout());
        // Adiciona o grafico ao painel criado no seu frame.
        pnBalancoTrimestral.add(chartPanel, BorderLayout.CENTER);
        pnBalancoTrimestral.validate();
    }
    
    private String primeiroDiaDoMes(int mes){
        return  dateDoDia.withMonth(mes).with(TemporalAdjusters
                .firstDayOfMonth()).format(DateTimeFormatter
                        .ofPattern("yyyy-MM-dd"));
    }
    
    private String ultimoDiaDoMes(int mes){
        return  dateDoDia.withMonth(mes).with(TemporalAdjusters
                .lastDayOfMonth()).format(DateTimeFormatter
                        .ofPattern("yyyy-MM-dd"));
    }
    
    private String primeiroDiaDoMes() {
        return dateDoDia.withMonth(dateDoDia.getMonthValue()).with(TemporalAdjusters.firstDayOfMonth()).format(DateTimeFormatter
                .ofPattern("yyyy-MM-dd"));
    }

    private String ultimoDiaDoMes() {
        return dateDoDia.withMonth(dateDoDia.getMonthValue()).with(TemporalAdjusters.lastDayOfMonth()).format(DateTimeFormatter
                .ofPattern("yyyy-MM-dd"));
    }
    
    /**
     * 
     * @return Soma em reais do servicoes realizados
     */
    private Double faturamentoAtual(){
        String[] datas = {primeiroDiaDoMes(), ultimoDiaDoMes()};
        var faturamentoAtual = graficoService.monthlyInvoicingCompleted(datas);
        
        return faturamentoAtual;
    }
    private Double faturamentoPendente(){
        String[] datas = {primeiroDiaDoMes(), ultimoDiaDoMes()};
        var faturamentoAtual = graficoService.pendingMonthlyInvoicing(datas);
        
        return faturamentoAtual;    
    }
    
    private void faturamentoTrimestral(){
        DefaultCategoryDataset dcd = new DefaultCategoryDataset();
        //Colunas é o que fixa no eixo x. para mim será o mes
        //Row é o objeto comparado, para mim será orçamento e serviços
        //value é os valores que será apresentado
        
        dcd.addValue(faturamentoAtual(), "Ordem de Serviços", mes(12));
        dcd.addValue(faturamentoPendente(), "Orçamentos", mes(12));
        
        String[] antepenutimo = {primeiroDiaDoMes(dateDoDia.getMonthValue() - 2), ultimoDiaDoMes(dateDoDia.getMonthValue() - 2)};
        String[] penutimo = {primeiroDiaDoMes(dateDoDia.getMonthValue() - 1), ultimoDiaDoMes(dateDoDia.getMonthValue() - 1)};
        double quantidadeAntepenutimoSe = graficoService.monthlyInvoicingCompleted(antepenutimo);
        double quantidadeAntepenutimoOr = graficoService.monthlyInvoicingCompleted(antepenutimo);
        double quantidadePenutimoSe = graficoService.monthlyInvoicingCompleted(penutimo);        
        double quantidadePenutimoOr = graficoService.monthlyInvoicingCompleted(penutimo); 
        dcd.addValue(quantidadePenutimoOr, "Orçamentos", mes(dateDoDia.getMonthValue()-1));
        dcd.addValue(quantidadePenutimoSe, "Ordem de Serviços", mes(dateDoDia.getMonthValue()-1));
        dcd.addValue(quantidadeAntepenutimoSe, "Ordem de Serviços", mes(dateDoDia.getMonthValue()-2));
        dcd.addValue(quantidadeAntepenutimoOr, "Orçamentos", mes(dateDoDia.getMonthValue()-2));
        
        //Cria o grafico
        JFreeChart chart = ChartFactory.createLineChart(
                "Faturamento Trimestral", "Meses", "Valores (R$)", dcd, PlotOrientation.VERTICAL,
                true, true, true);
        
        ChartPanel cp = new ChartPanel(chart);
        //Define o tamanho do painel ou grafico
       cp.setPreferredSize(new Dimension(490,290));
        
        pnBalancoSemanal.setLayout(new java.awt.BorderLayout());
        // Adiciona o grafico ao painel criado no seu frame.
        pnBalancoSemanal.add(cp, BorderLayout.CENTER);
        pnBalancoSemanal.validate();
       
    }
    
    private void initLabels(){
        lblFaturamentoAtual.setText(String.format("R$ %.2f", faturamentoAtual()));
        lblFaturamentoPendente.setText(String.format("R$ %.2f", faturamentoPendente()));
        registroAtualDosAtendimentos();
        
        
        if(dateDoDia.getMonthValue() >= 3){
           faturamentoTrimestral();
           balancoTrimestral(); 
        }
    }
    
    private String mes(int value){
        switch (value) {
            case 1:
                return "Janeiro";
            case 2:
                return "Fevereiro";
            case 3:
                return "Março";
            case 4:
                return "Abril";
            case 5:
                return "Maio";
            case 6:
                return "Junho";
            case 7:
                return "Julho";
            case 8:
                return "Agosto";
            case 9:
                return "Setembro";
            case 10:
                return "Outubro";
            case 11:
                return "Novembro";
            case 12:
                return "Dezembro";
            
        }
        return null;
    }
}
