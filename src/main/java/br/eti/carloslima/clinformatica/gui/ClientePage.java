/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.eti.carloslima.clinformatica.gui;

import br.eti.carloslima.clinformatica.model.entities.AddresModel;
import br.eti.carloslima.clinformatica.model.entities.ClientModel;
import br.eti.carloslima.clinformatica.model.services.AddresService;
import br.eti.carloslima.clinformatica.model.services.ClientService;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eduar
 */
public class ClientePage extends javax.swing.JInternalFrame {

    /**
     * Creates new form ClientePage
     */
    private AddresService aService;
    private ClientService cService;

    private DefaultTableModel model;

    private int delCliId = 0, delEndId = 0;

    public ClientePage() {
        initComponents();
        aService = new AddresService();
        cService = new ClientService();

        initTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSobreNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ftxtCpf = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        ftxtTelefone = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbBairro = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        ftxtCep = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        BtnDeletar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        lblPesquisa = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Clientes");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("* Campos Obrigatorios");

        jLabel2.setText("* Nome");

        jLabel3.setText("Sobre nome");

        jLabel4.setText("* CPF");

        try {
            ftxtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtCpf.setText("000.000.000-00");

        jLabel5.setText("* Telefone");

        try {
            ftxtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtTelefone.setText("(00)00000-0000");

        jLabel6.setText("* Logradouro");

        jLabel7.setText("* Numero");

        jLabel11.setText("Complemento");

        jLabel8.setText("Bairro");

        cbBairro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aerolândia", "Aeroporto", "Aldeota", "Alto da Balança", "Alvaro Weyne", "Amadeu Furtado", "Ancuri", "Antônio Bezerra", "Aracapé", "Autran Nunes", "Bairro Ellery", "Barra do Ceará", "Barroso", "Bela Vista", "Benfica", "Boa Vista", "Bom Futuro", "Bom Jardim", "Bonsucesso", "Cais do Porto", "Cajazeiras", "Cambeba", "Canindezinho", "Carlito Pamplona", "Centro", "Cidade 2000", "Cidade dos Funcionários", "Coaçu", "Cocó", "Conjunto Ceará 1", "Conjunto Ceará 2", "Conjunto Esperança", "Conjunto Palmeiras", "Couto Fernandes", "Cristo Redentor", "Curió", "Damas", "De Lourdes", "Demócrito Rocha", "Dendê", "Dias Macedo", "Dionísio Torres", "Dom Lustosa", "Edson Queiroz", "Farias Brito", "Fátima", "Floresta", "Genibaú", "Granja Lisboa", "Granja Portugal", "Guajerú", "Guararapes", "Henrique Jorge", "Itaoca", "Itaperi", "Jacarecanga", "Jangurussu", "Jardim América", "Jardim Cearense", "Jardim das Oliveiras", "Jardim Guanabara", "Jardim Iracema", "João XXIII", "Joaquim Távora", "Jóquei Clube", "José Bonifácio", "José de Alencar", "José Walter", "Lagoa Redonda", "Luciano Cavalcante", "Manuel Dias Branco", "Maraponga", "Meireles", "Messejana", "Mondubim", "Monte Castelo", "Montese", "Moura Brasil", "Mucuripe", "Novo Mondubim", "Olavo Oliveira", "Padre Andrade", "Panamericano", "Papicu", "Parangaba", "Parque Araxá", "Parque Dois Irmãos", "Parque Iracema", "Parquelândia", "Parque Manibura", "Parque Santa Rosa", "Parque São José", "Parreão", "Passaré", "Paupina", "Pedras", "Pici", "Pirambu", "Planalto Ayrton Senna", "Praia de Iracema", "Praia do Futuro I", "Praia do Futuro II", "Presidente Kennedy", "Presidente Vargas", "Quintino Cunha", "Rodolfo Teófilo", "Sabiaguaba", "Salinas", "Santa Maria", "São Bento", "São Gerardo", "São João do Tauape", "Sapiranga", "Serrinha", "Siqueira", "Varjota", "Vicente Pinzon", "Vila Manuel Sátiro", "Vila Peri", "Vila União", "Vila Velha" }));

        jLabel9.setText("Cep");

        try {
            ftxtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtCep.setText("00000-000");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Dados de Endereço");

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        BtnDeletar.setText("Deletar");
        BtnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeletarActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        tbClientes = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registro", "Nome", "Sobre Nome", "CPF", "Telefone", "Rua", "Numero", "Complemento", "Bairro", "Cep"
            }
        ));
        tbClientes.setFocusable(false);
        tbClientes.getTableHeader().setReorderingAllowed(false);
        tbClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbClientes);

        lblPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblPesquisaKeyReleased(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ftxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(jLabel5)
                                        .addGap(28, 28, 28)
                                        .addComponent(ftxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtNome))
                                .addGap(62, 62, 62)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtSobreNome, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(210, 246, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 892, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(ftxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblPesquisa, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnLimpar)
                                        .addGap(18, 18, 18)
                                        .addComponent(BtnDeletar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSalvar)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(txtSobreNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ftxtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(ftxtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cbBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(ftxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(BtnDeletar)
                    .addComponent(btnSalvar))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel12)
                    .addComponent(lblPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setBounds(0, 0, 1072, 650);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        validateFields();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limpar();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void tbClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClientesMouseClicked
        setFields();
    }//GEN-LAST:event_tbClientesMouseClicked

    private void BtnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeletarActionPerformed
        delete();
    }//GEN-LAST:event_BtnDeletarActionPerformed

    private void lblPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblPesquisaKeyReleased
        // TODO add your handling code here:
        var letra = lblPesquisa.getText().toString();
        researchTable(letra);
    }//GEN-LAST:event_lblPesquisaKeyReleased
//parei aqui. fazer deleta

    private void delete() {
        if (delCliId > 0) {
            if (cService.apagar(delCliId) > 0) {
                aService.deleta(delEndId);
                JOptionPane.showMessageDialog(null, "Cliente deletado com sucesso");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não selecionado!");
        }
        limpar();
        initTable();
        
        
    }

    /**
     * Apresenta ao usuario os dados da linha selecionda na tabela
     */
    private void setFields() {
        int row = tbClientes.getSelectedRow();

        int id = Integer.parseInt(tbClientes.getModel().getValueAt(row, 0).toString());
        ClientModel client = cService.buscaById(id);

        txtNome.setText(client.getNome());
        txtSobreNome.setText(client.getSobreNome());
        ftxtCpf.setText(client.getCpf());
        ftxtTelefone.setText(client.getTelefone());
        txtLogradouro.setText(client.getResidencia().getLogradouro());
        txtNumero.setText(client.getResidencia().getNumero());
        txtComplemento.setText(client.getResidencia().getComplemento());
        cbBairro.setSelectedItem(client.getResidencia().getBairro());
        ftxtCep.setText(client.getResidencia().getCep());

        delCliId = client.getRegistro();
        delEndId = client.getResidencia().getId();
    }

    private void validateFields() {
        if (txtNome.getText().isEmpty() || ftxtCpf.getText().isEmpty()
                || ftxtTelefone.getText().isEmpty()
                || txtLogradouro.getText().isEmpty()
                || txtNumero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Deve preencher todos os campos obrigatorios");
        } else {
            if (ftxtCpf.getText().equals("000.000.000-00")) {
                JOptionPane.showMessageDialog(null, "CPF invalido");
            } else {

                salvar();
            }
        }
    }

    /**
     * Responsavel de Salva e Atualizar os dados no banco
     */
    private void salvar() {
        ClientModel client = new ClientModel();
        AddresModel addres = new AddresModel();

        addres.setLogradouro(txtLogradouro.getText());
        addres.setNumero(txtNumero.getText());
        addres.setComplemento(txtComplemento.getText());
        addres.setCep(ftxtCep.getText());
        addres.setBairro(cbBairro.getSelectedItem().toString());

        if (delEndId > 0) {
            //se maior que zero é porque ja existe: atualiza
            addres.setId(delEndId);

            //atualizando o endereco
            aService.atualiza(addres);
        } else {
            //se nao for maior é uma novo endereço: salva

            //salvando o endereço
            int id = aService.salvar(addres);
            if (id > 0) {
                //coloca o id do endereço vindo do banco 
                addres.setId(id);
            }
        }

        client.setNome(txtNome.getText());
        client.setSobreNome(txtSobreNome.getText());
        client.setCpf(ftxtCpf.getText());
        client.setTelefone(ftxtTelefone.getText());

        if (addres.getId() != null && client.getRegistro() == null) {
            /*se o entedereço tive salvo e o cliente nao tiva realação de endereço
            o endereço em questão selá atribudo ao cliente*/

            client.setResidencia(addres);
        }

        //adicioando o enderaço ao cliente
        //so pode ser adicionado se o enderaço tive id
        /*if (addres.getId() != null) {
            client.setResidencia(addres);

        }*/
        addres.setMoradores(client);

        if (delCliId > 0) {
            //se maior que zero é porque ja existe: atualiza
            client.setRegistro(delCliId);
            //atualizando o cliente
            cService.atualizar(client);
        } else {
            //salcando o cliente
            if (client.getResidencia() != null) {
                if (cService.salva(client) > 0) {
                    JOptionPane.showMessageDialog(null, "Cliente Salvo com Sucesso!");
                }
            }
        }

        limpar();
        addres = null;
        client = null;
        initTable();

    }

    private void initTable() {
        model = (DefaultTableModel) tbClientes.getModel();
        List<ClientModel> objs = cService.buscaTodos();

        model.setNumRows(0);
        for (ClientModel c : objs) {

            model.insertRow(model.getRowCount(), new Object[]{
                c.getRegistro(), c.getNome(), c.getSobreNome(), c.getCpf(),
                c.getTelefone(), c.getResidencia().getLogradouro(),
                c.getResidencia().getNumero(), c.getResidencia().getComplemento(),
                c.getResidencia().getBairro(), c.getResidencia().getCep()
            });
        }
    }
    
    private void researchTable(String letra){
        model = (DefaultTableModel) tbClientes.getModel();
        List<ClientModel> objs = cService.pesquisaespecial(letra);

        model.setNumRows(0);
        for (ClientModel c : objs) {

            model.insertRow(model.getRowCount(), new Object[]{
                c.getRegistro(), c.getNome(), c.getSobreNome(), c.getCpf(),
                c.getTelefone(), c.getResidencia().getLogradouro(),
                c.getResidencia().getNumero(), c.getResidencia().getComplemento(),
                c.getResidencia().getBairro(), c.getResidencia().getCep()
            });
        }
    }

    private void limpar() {
        txtComplemento.setText("");
        txtLogradouro.setText("");
        txtNome.setText("");
        txtNumero.setText("");
        txtSobreNome.setText("");
        ftxtCep.setText("");
        ftxtCpf.setText("");
        ftxtTelefone.setText("");
        
        delCliId = 0;
        delEndId = 0;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDeletar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cbBairro;
    private javax.swing.JFormattedTextField ftxtCep;
    private javax.swing.JFormattedTextField ftxtCpf;
    private javax.swing.JFormattedTextField ftxtTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lblPesquisa;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtSobreNome;
    // End of variables declaration//GEN-END:variables
}
