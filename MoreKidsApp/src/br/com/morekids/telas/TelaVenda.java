/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.morekids.telas;

/**
 *
 * @author Victor
 */
public class TelaVenda extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaVenda
     */
    public TelaVenda() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panel_Venda = new javax.swing.JPanel();
        lbl_Numero_Venda = new javax.swing.JLabel();
        lbl_Dt_Venda = new javax.swing.JLabel();
        txt_Numero_Venda = new javax.swing.JTextField();
        txt_Dt_Venda = new javax.swing.JTextField();
        radiobtn_Orcamento = new javax.swing.JRadioButton();
        radiobtn_Venda = new javax.swing.JRadioButton();
        lbl_Situacao = new javax.swing.JLabel();
        comboBox_Situacao = new javax.swing.JComboBox<>();
        panel_Cliente = new javax.swing.JPanel();
        txt_Search_Cliente = new javax.swing.JTextField();
        lbl_Icon_Pesquisa = new javax.swing.JLabel();
        lbl_Id_Tela_Venda = new javax.swing.JLabel();
        txt_Id_Tela_Venda_Cliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Cliente_Vendas = new javax.swing.JTable();
        lbl_Id_Venda = new javax.swing.JLabel();
        lbl_Nome_Produto = new javax.swing.JLabel();
        lbl_Tipo_Produto = new javax.swing.JLabel();
        lbl_Quantidade_Produto = new javax.swing.JLabel();
        lbl_Tamanho_Produto = new javax.swing.JLabel();
        lbl_Vendedor = new javax.swing.JLabel();
        lbl_Valor = new javax.swing.JLabel();
        lbl_Cliente = new javax.swing.JLabel();
        lbl_Data_Venda = new javax.swing.JLabel();
        txt_Id_Venda = new javax.swing.JTextField();
        txt_Nome_Produto = new javax.swing.JTextField();
        txt_Tipo_Produto = new javax.swing.JTextField();
        txt_Quantidade = new javax.swing.JTextField();
        comboBox_Tamanho = new javax.swing.JComboBox<>();
        txt_Valor = new javax.swing.JTextField();
        txt_Data_Venda = new javax.swing.JTextField();
        txt_Vendedor = new javax.swing.JTextField();
        txt_Cliente = new javax.swing.JTextField();
        btn_Create = new javax.swing.JButton();
        btn_Read = new javax.swing.JButton();
        btn_Update = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();
        btn_Print = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        setTitle("Vendas");
        setToolTipText("");
        setMinimumSize(new java.awt.Dimension(92, 24));
        setPreferredSize(new java.awt.Dimension(796, 687));

        panel_Venda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbl_Numero_Venda.setText("Numero Venda");

        lbl_Dt_Venda.setText("Data da Venda");

        txt_Numero_Venda.setEditable(false);
        txt_Numero_Venda.setEnabled(false);

        txt_Dt_Venda.setEditable(false);
        txt_Dt_Venda.setEnabled(false);

        buttonGroup1.add(radiobtn_Orcamento);
        radiobtn_Orcamento.setText("Orçamento");

        buttonGroup1.add(radiobtn_Venda);
        radiobtn_Venda.setText("Venda");

        javax.swing.GroupLayout panel_VendaLayout = new javax.swing.GroupLayout(panel_Venda);
        panel_Venda.setLayout(panel_VendaLayout);
        panel_VendaLayout.setHorizontalGroup(
            panel_VendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_VendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_VendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radiobtn_Orcamento)
                    .addGroup(panel_VendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt_Numero_Venda, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_Numero_Venda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(panel_VendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Dt_Venda)
                    .addComponent(txt_Dt_Venda, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radiobtn_Venda))
                .addContainerGap())
        );
        panel_VendaLayout.setVerticalGroup(
            panel_VendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_VendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_VendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Numero_Venda)
                    .addComponent(lbl_Dt_Venda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_VendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Numero_Venda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Dt_Venda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(panel_VendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radiobtn_Orcamento)
                    .addComponent(radiobtn_Venda))
                .addContainerGap())
        );

        lbl_Situacao.setText("Situação");

        comboBox_Situacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abandonado Pelo Cliente", "Aguardando Aprovação", "Entrega Ok", "Na Bancada", "Retornou", "Venda Concluída" }));

        panel_Cliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        txt_Search_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Search_ClienteActionPerformed(evt);
            }
        });

        lbl_Icon_Pesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/morekids/icons/pesquisar.png"))); // NOI18N

        lbl_Id_Tela_Venda.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbl_Id_Tela_Venda.setText("* Id");

        tbl_Cliente_Vendas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbl_Cliente_Vendas);

        javax.swing.GroupLayout panel_ClienteLayout = new javax.swing.GroupLayout(panel_Cliente);
        panel_Cliente.setLayout(panel_ClienteLayout);
        panel_ClienteLayout.setHorizontalGroup(
            panel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                    .addGroup(panel_ClienteLayout.createSequentialGroup()
                        .addComponent(txt_Search_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_Icon_Pesquisa)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_Id_Tela_Venda)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Id_Tela_Venda_Cliente)))
                .addContainerGap())
        );
        panel_ClienteLayout.setVerticalGroup(
            panel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ClienteLayout.createSequentialGroup()
                .addGroup(panel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ClienteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txt_Search_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panel_ClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Id_Tela_Venda)
                            .addComponent(txt_Id_Tela_Venda_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lbl_Icon_Pesquisa)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbl_Id_Venda.setText("Id");

        lbl_Nome_Produto.setText("* Nome Produto");

        lbl_Tipo_Produto.setText("* Tipo do Produto");

        lbl_Quantidade_Produto.setText("* Quantidade");

        lbl_Tamanho_Produto.setText("* Tamanho");

        lbl_Vendedor.setText("* Vendedor");

        lbl_Valor.setText("* Valor");

        lbl_Cliente.setText("* Cliente");

        lbl_Data_Venda.setText("* Data da Venda");

        txt_Id_Venda.setEditable(false);
        txt_Id_Venda.setEnabled(false);
        txt_Id_Venda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Id_VendaActionPerformed(evt);
            }
        });

        txt_Tipo_Produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Tipo_ProdutoActionPerformed(evt);
            }
        });

        comboBox_Tamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "4", "6", "8", "10", "12", "14", "16", "PP", "P", "M", "G", "GG", "XG", "EXG" }));

        txt_Valor.setText("R$");

        txt_Data_Venda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Data_VendaActionPerformed(evt);
            }
        });

        btn_Create.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/morekids/icons/create.png"))); // NOI18N
        btn_Create.setToolTipText("Create");
        btn_Create.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Create.setPreferredSize(new java.awt.Dimension(80, 80));

        btn_Read.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/morekids/icons/read.png"))); // NOI18N
        btn_Read.setToolTipText("Read");
        btn_Read.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Read.setPreferredSize(new java.awt.Dimension(80, 80));

        btn_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/morekids/icons/update.png"))); // NOI18N
        btn_Update.setToolTipText("Update");
        btn_Update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Update.setPreferredSize(new java.awt.Dimension(80, 80));

        btn_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/morekids/icons/delete.png"))); // NOI18N
        btn_Delete.setToolTipText("Delete");
        btn_Delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Delete.setPreferredSize(new java.awt.Dimension(80, 80));

        btn_Print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/morekids/icons/print.png"))); // NOI18N
        btn_Print.setToolTipText("Print");
        btn_Print.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Print.setPreferredSize(new java.awt.Dimension(80, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panel_Venda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Situacao)
                                .addGap(18, 18, 18)
                                .addComponent(comboBox_Situacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(30, 30, 30)
                        .addComponent(panel_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Id_Venda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Id_Venda, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Nome_Produto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Nome_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_Tipo_Produto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Tipo_Produto))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Quantidade_Produto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_Tamanho_Produto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBox_Tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_Valor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_Data_Venda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Data_Venda))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Vendedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_Cliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Cliente)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Create, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Read, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_Print, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel_Venda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Situacao)
                            .addComponent(comboBox_Situacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Id_Venda)
                            .addComponent(txt_Id_Venda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Nome_Produto)
                            .addComponent(txt_Nome_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Tipo_Produto)
                            .addComponent(txt_Tipo_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Quantidade_Produto)
                            .addComponent(txt_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Tamanho_Produto)
                            .addComponent(comboBox_Tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Valor)
                            .addComponent(txt_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Data_Venda)
                            .addComponent(txt_Data_Venda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Vendedor)
                            .addComponent(txt_Vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Cliente)
                            .addComponent(txt_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panel_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Create, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Read, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Print, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79))
        );

        setBounds(0, 0, 796, 687);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_Search_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Search_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Search_ClienteActionPerformed

    private void txt_Id_VendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Id_VendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Id_VendaActionPerformed

    private void txt_Tipo_ProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Tipo_ProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Tipo_ProdutoActionPerformed

    private void txt_Data_VendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Data_VendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Data_VendaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Create;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Print;
    private javax.swing.JButton btn_Read;
    private javax.swing.JButton btn_Update;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboBox_Situacao;
    private javax.swing.JComboBox<String> comboBox_Tamanho;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Cliente;
    private javax.swing.JLabel lbl_Data_Venda;
    private javax.swing.JLabel lbl_Dt_Venda;
    private javax.swing.JLabel lbl_Icon_Pesquisa;
    private javax.swing.JLabel lbl_Id_Tela_Venda;
    private javax.swing.JLabel lbl_Id_Venda;
    private javax.swing.JLabel lbl_Nome_Produto;
    private javax.swing.JLabel lbl_Numero_Venda;
    private javax.swing.JLabel lbl_Quantidade_Produto;
    private javax.swing.JLabel lbl_Situacao;
    private javax.swing.JLabel lbl_Tamanho_Produto;
    private javax.swing.JLabel lbl_Tipo_Produto;
    private javax.swing.JLabel lbl_Valor;
    private javax.swing.JLabel lbl_Vendedor;
    private javax.swing.JPanel panel_Cliente;
    private javax.swing.JPanel panel_Venda;
    private javax.swing.JRadioButton radiobtn_Orcamento;
    private javax.swing.JRadioButton radiobtn_Venda;
    private javax.swing.JTable tbl_Cliente_Vendas;
    private javax.swing.JTextField txt_Cliente;
    private javax.swing.JTextField txt_Data_Venda;
    public static javax.swing.JTextField txt_Dt_Venda;
    private javax.swing.JTextField txt_Id_Tela_Venda_Cliente;
    private javax.swing.JTextField txt_Id_Venda;
    private javax.swing.JTextField txt_Nome_Produto;
    public static javax.swing.JTextField txt_Numero_Venda;
    private javax.swing.JTextField txt_Quantidade;
    private javax.swing.JTextField txt_Search_Cliente;
    private javax.swing.JTextField txt_Tipo_Produto;
    private javax.swing.JTextField txt_Valor;
    private javax.swing.JTextField txt_Vendedor;
    // End of variables declaration//GEN-END:variables
}
