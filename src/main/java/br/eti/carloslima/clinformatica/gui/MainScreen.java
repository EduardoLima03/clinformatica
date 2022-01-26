/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eti.carloslima.clinformatica.gui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author eduar
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainPage
     */
    public MainScreen() {
        initComponents();
        getDate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        desktop = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnCadastro = new javax.swing.JMenu();
        mniFuncionarios = new javax.swing.JMenuItem();
        mniCliente = new javax.swing.JMenuItem();
        mmiOrdem = new javax.swing.JMenuItem();
        mnRelatorio = new javax.swing.JMenu();
        mmiDashboard = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CL Informática");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CL Informatica");

        lblName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblName.setText("Name");

        lblDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblDate.setText("Date");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDate)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(lblDate))
                .addContainerGap(694, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1026, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        mnCadastro.setText("Cadastro");

        mniFuncionarios.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mniFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-user.png"))); // NOI18N
        mniFuncionarios.setText("Funcionarios");
        mniFuncionarios.setEnabled(false);
        mniFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniFuncionariosActionPerformed(evt);
            }
        });
        mnCadastro.add(mniFuncionarios);

        mniCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mniCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon-client.png"))); // NOI18N
        mniCliente.setText("Clientes");
        mniCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniClienteActionPerformed(evt);
            }
        });
        mnCadastro.add(mniCliente);

        mmiOrdem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mmiOrdem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/document.png"))); // NOI18N
        mmiOrdem.setText("Ordem de Ser.");
        mmiOrdem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmiOrdemActionPerformed(evt);
            }
        });
        mnCadastro.add(mmiOrdem);

        jMenuBar1.add(mnCadastro);

        mnRelatorio.setText("Relatorio");
        mnRelatorio.setEnabled(false);

        mmiDashboard.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mmiDashboard.setText("Dashboard");
        mmiDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmiDashboardActionPerformed(evt);
            }
        });
        mnRelatorio.add(mmiDashboard);

        jMenuBar1.add(mnRelatorio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(desktop)
        );

        setSize(new java.awt.Dimension(1300, 805));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mniFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniFuncionariosActionPerformed
        // chamando a tela de funcionarios
        EmployeeRegistrationScreen funcionario = new EmployeeRegistrationScreen();
        funcionario.setVisible(true);
        //fazendo que a tela seja colocada dentro do desktop
        desktop.add(funcionario);
    }//GEN-LAST:event_mniFuncionariosActionPerformed

    private void mniClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniClienteActionPerformed
        
        CustomerRegistrationScreen cliente = new CustomerRegistrationScreen();
        cliente.setVisible(true);
        desktop.add(cliente);
    }//GEN-LAST:event_mniClienteActionPerformed

    private void mmiOrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmiOrdemActionPerformed
        // TODO add your handling code here:
        ServiceOrderScreen os = new ServiceOrderScreen();
        os.setVisible(true);
        desktop.add(os);
    }//GEN-LAST:event_mmiOrdemActionPerformed

    private void mmiDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmiDashboardActionPerformed
        DashboardScreen dashboard = new DashboardScreen();
        dashboard.setVisible(true);
        desktop.add(dashboard);
    }//GEN-LAST:event_mmiDashboardActionPerformed

    
    //Date
    private LocalDate date;
    
    private void getDate(){
        date = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        lblDate.setText(date.format(format));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDate;
    public javax.swing.JLabel lblName;
    private javax.swing.JMenuItem mmiDashboard;
    private javax.swing.JMenuItem mmiOrdem;
    private javax.swing.JMenu mnCadastro;
    public javax.swing.JMenu mnRelatorio;
    private javax.swing.JMenuItem mniCliente;
    public javax.swing.JMenuItem mniFuncionarios;
    // End of variables declaration//GEN-END:variables
}
