/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eti.carloslima.clinformatica.gui;

import br.eti.carloslima.clinformatica.model.entities.ClientModel;
import br.eti.carloslima.clinformatica.model.entities.ServiceOrderModel;
import br.eti.carloslima.clinformatica.model.entities.UserModel;
import br.eti.carloslima.clinformatica.model.entities.enums.ServiceSituation;
import br.eti.carloslima.clinformatica.model.services.ClientService;
import br.eti.carloslima.clinformatica.model.services.ServiceOrderService;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eduar
 */
public class ServiceOrderScreen extends javax.swing.JInternalFrame {

    /**
     * Creates new form ServiceOrderScreen
     */
    private ClientService cService = new ClientService();
    private ServiceOrderService oService = new ServiceOrderService();

    private ServiceOrderModel order = null;

    //recupera o tecnico para ser salvo na ordem
    private UserModel user = LoginScreen.user;

    //recupera o cliente para salva na ordem
    private ClientModel client;
    private List<ClientModel> objs;

    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public ServiceOrderScreen() {
        initComponents();
        getDate();
        
        txtNomeTecnico.setText(user.getNome());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        typeServiceGroup = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        pnRegistroAtendimento = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumService = new javax.swing.JTextField();
        txtDateService = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbStatus = new javax.swing.JComboBox<>();
        pnRegistroCliente = new javax.swing.JPanel();
        txtPesquisaCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtEquipamento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDefeito = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtServico = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNomeTecnico = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnPesquisa = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        txtValorTotal = new javax.swing.JTextField();
        btnNovo = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Ordem de Serviço");
        setPreferredSize(new java.awt.Dimension(1072, 307));

        pnRegistroAtendimento.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("N° OS");

        jLabel2.setText("Data");

        txtNumService.setEditable(false);
        txtNumService.setPreferredSize(new java.awt.Dimension(80, 22));

        txtDateService.setEditable(false);

        javax.swing.GroupLayout pnRegistroAtendimentoLayout = new javax.swing.GroupLayout(pnRegistroAtendimento);
        pnRegistroAtendimento.setLayout(pnRegistroAtendimentoLayout);
        pnRegistroAtendimentoLayout.setHorizontalGroup(
            pnRegistroAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRegistroAtendimentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnRegistroAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtNumService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(pnRegistroAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtDateService, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnRegistroAtendimentoLayout.setVerticalGroup(
            pnRegistroAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRegistroAtendimentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnRegistroAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnRegistroAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDateService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumService, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jLabel3.setText("Situação:");

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ORÇAMENTO", "APROVADO", "EM_SERVICO", "AGUARDANDO_PEÇA", "ORÇAMENTO_VENCIDO", "CANCELADO", "CONCLUIDO", "ENTREGUE" }));

        pnRegistroCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        txtPesquisaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaClienteKeyReleased(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("* Id:");

        txtIdCliente.setEditable(false);

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nome", "Telefone"
            }
        ));
        tblCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCliente);

        javax.swing.GroupLayout pnRegistroClienteLayout = new javax.swing.GroupLayout(pnRegistroCliente);
        pnRegistroCliente.setLayout(pnRegistroClienteLayout);
        pnRegistroClienteLayout.setHorizontalGroup(
            pnRegistroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRegistroClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnRegistroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnRegistroClienteLayout.createSequentialGroup()
                        .addComponent(txtPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(pnRegistroClienteLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        pnRegistroClienteLayout.setVerticalGroup(
            pnRegistroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRegistroClienteLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnRegistroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(pnRegistroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel6.setText("*Equipamento:");

        jLabel7.setText("*Defeito:");

        jLabel8.setText("Serviço:");

        jLabel9.setText("Tecnico:");

        jLabel10.setText("*Valor Total:");

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnSave.setText("Salvar");
        btnSave.setToolTipText("Salvar");
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search2.png"))); // NOI18N
        btnPesquisa.setText("Pesquisar");
        btnPesquisa.setToolTipText("pesquisar");
        btnPesquisa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setToolTipText("Editar");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.setToolTipText("Deletar");
        btnDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Print.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.setToolTipText("Imprimir");
        btnImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtValorTotal.setText("0");

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new_page_document.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setToolTipText("Nova Ordem de Serviço");
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEquipamento)
                                .addComponent(txtDefeito)
                                .addComponent(txtServico, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtNomeTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnSave)
                                .addGap(18, 18, 18)
                                .addComponent(btnPesquisa)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditar)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeletar)
                                .addGap(18, 18, 18)
                                .addComponent(btnImprimir)
                                .addGap(18, 18, 18)
                                .addComponent(btnNovo))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnRegistroAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnRegistroAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addComponent(pnRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtDefeito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNomeTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(txtValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSave)
                    .addComponent(btnPesquisa)
                    .addComponent(btnEditar)
                    .addComponent(btnDeletar)
                    .addComponent(btnImprimir)
                    .addComponent(btnNovo))
                .addContainerGap(471, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1011, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setBounds(0, 0, 1035, 751);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisaClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaClienteKeyReleased
        // Faz a pesquisa assim que é digitada alguma letra.
        researchTable(txtPesquisaCliente.getText().toString());
    }//GEN-LAST:event_txtPesquisaClienteKeyReleased

    private void tblClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClienteMouseClicked
        // TODO add your handling code here:
        setFieldIdClient();
    }//GEN-LAST:event_tblClienteMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        salva();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        cleanFields();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        // TODO add your handling code here:
        pesquisaOrder();
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        deleteServiceOrder();
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        UpdateOrderService();
    }//GEN-LAST:event_btnEditarActionPerformed

    /**
     * Limpa os campos de texto e os objetos.
     */
    private void cleanFields() {
        txtNumService.setText("");
        txtIdCliente.setText("");
        txtEquipamento.setText("");
        txtDefeito.setText("");
        txtServico.setText("");
        txtValorTotal.setText("0");

        client = null;
        order = null;

    }

    private void setFieldIdClient() {
        int row = tblCliente.getSelectedRow(); //recupera a linha selecionada da tabela

        var id = tblCliente.getModel().getValueAt(row, 0).toString();

        txtIdCliente.setText(id);

        /*
            Quero pega o cliente contido na lista de cliente que vem da consulta
            para popular a tabala. com isso não precisso fazer uma nova consulta
            para salva o cliente
         */
        for (ClientModel cm : objs) {
            /*
                procura o Cliente selecionado e salva no cliente geral para salvar
             */
            if (cm.getRegistro() == Integer.parseInt(id)) {
                client = cm;
            }
        }

    }

    /**
     * Preence a tabela de clientes para realiza a seleção
     *
     * @param letra
     */
    private void researchTable(String letra) {
        DefaultTableModel model = (DefaultTableModel) tblCliente.getModel();

        //resaliza a pesquisa e salva em uma lista de clientes
        objs = cService.pesquisaespecial(letra);

        model.setNumRows(0);
        for (ClientModel c : objs) {
            /*
                Adiciona uma linha para cada cliente contido na lista
             */
            model.insertRow(model.getRowCount(), new Object[]{
                c.getRegistro(), c.getNome(), c.getTelefone()
            });
        }
    }

    /**
     * Responsavel de carregar a data no campo corespondete
     */
    private void getDate() {
        LocalDate date = LocalDate.now();
        txtDateService.setText(date.format(format));
    }

    private boolean validationfields() {
        if (txtIdCliente.getText().isEmpty() || txtEquipamento.getText().isEmpty()
                || txtDefeito.getText().isEmpty() || txtValorTotal.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    /**
     * Metodo que salva uma nova ordem de serviço
     */
    private void salva() {
        if (!validationfields()) {
            JOptionPane.showMessageDialog(null, "Deve preencher todos os campos obrigatorios");
        } else if (user == null || client == null) {
            JOptionPane.showMessageDialog(null, "Dados do cliente ou Tecnico não encontrado");
        } else {
            populateOrder();

            int id = oService.salvar(order);
            if (id > 0) {
                JOptionPane.showMessageDialog(null, "Ordem de serviço salvo com sucesso!");
                order.setNumSerOrder(id);
                client.setContratos(order);
                user.setManuntecoes(order);
                txtNumService.setText(String.valueOf(id));
            }
        }
    }

    private void UpdateOrderService() {
        if (!validationfields()) {
            JOptionPane.showMessageDialog(null, "Deve preencher todos os campos "
                    + "obrigatorios");
        } else {
            populateOrder();
            var confirmação = oService.atualizarOrdemServico(order);
            
            if(confirmação == 1){
                JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possivel atualizar!",
                        null, JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }

    private void populateOrder() {
        if (order == null) {

            this.order = new ServiceOrderModel();

            this.order.setDataSerOrder(LocalDate.now());
            this.order.setEquipamento(txtEquipamento.getText().toString());
            this.order.setDefeito(txtDefeito.getText().toString());
            this.order.setServicoRealizado(txtServico.getText().toString());
            this.order.setValor(txtValorTotal.getText().toString());
            this.order.setStatus(statusSelected());

            //criando as depedencia dos outros objetos
            this.order.setCliente(client);
            this.order.setTecnico(user);

        } else {
            this.order.setEquipamento(txtEquipamento.getText().toString());
            this.order.setDefeito(txtDefeito.getText().toString());
            this.order.setServicoRealizado(txtServico.getText().toString());
            this.order.setValor(txtValorTotal.getText().toString());
            this.order.setStatus(statusSelected());
        }

    }

    private int statusSelected() {
        switch (cbStatus.getSelectedItem().toString()) {
            case "ORÇAMENTO":
                return 1;
            case "APROVADO":
                return 2;
            case "EM_SERVIÇO":
                return 3;
            case "AGUARDANDO_PEÇA":
                return 4;
            case "ORÇAMENTO_VENCIDO":
                return 5;
            case "CANCELADO":
                return 6;
            case "CONCLUIDO":                
                return 7;
            case "ENTREGUE":
                return 8;
            default:
                return 1;
        }
    }


    private void pesquisaOrder() {
        var registro = JOptionPane.showInputDialog("Digite o Registro buscado");

        order = oService.buscaPorId(Integer.parseInt(registro));

        txtNumService.setText(order.getNumSerOrder().toString());
        txtDateService.setText(order.getDataSerOrder().format(format));
        txtIdCliente.setText(order.getCliente().getRegistro().toString());
        txtEquipamento.setText(order.getEquipamento());
        txtDefeito.setText(order.getDefeito());
        txtServico.setText(order.getServicoRealizado());
        txtNomeTecnico.setText(order.getTecnico().getNome());
        txtValorTotal.setText(order.getValor().toString());

        cbStatus.setSelectedItem(ServiceSituation.valueOf(order.getStatus()));
    }

    private void deleteServiceOrder() {
        if (txtNumService.getText().toString().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Campo de numero de registro vazio");
        } else {
            var confirmacao = oService.erasingServiceOrder(Integer.parseInt(txtNumService.getText().toString()));

            if (confirmacao > 0) {
                JOptionPane.showMessageDialog(null, "Ordem deletado com sucesso!");
            }
            cleanFields();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnRegistroAtendimento;
    private javax.swing.JPanel pnRegistroCliente;
    private javax.swing.JTable tblCliente;
    private javax.swing.JTextField txtDateService;
    private javax.swing.JTextField txtDefeito;
    private javax.swing.JTextField txtEquipamento;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNomeTecnico;
    private javax.swing.JTextField txtNumService;
    private javax.swing.JTextField txtPesquisaCliente;
    private javax.swing.JTextField txtServico;
    private javax.swing.JTextField txtValorTotal;
    private javax.swing.ButtonGroup typeServiceGroup;
    // End of variables declaration//GEN-END:variables

}
