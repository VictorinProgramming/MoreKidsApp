package br.com.morekids.telas;

import br.com.morekids.dal.ModuloConexao;
import java.sql.*;
import javax.swing.JOptionPane;

public class TelaVendas extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public TelaVendas() {
        initComponents();
        conexao = ModuloConexao.conector();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Informacoes = new javax.swing.JPanel();
        lbl_nm_venda = new javax.swing.JLabel();
        lbl_dt_venda = new javax.swing.JLabel();
        txt_nm_venda = new javax.swing.JTextField();
        txt_dt_venda = new javax.swing.JTextField();
        radioBtn_Orcamento = new javax.swing.JRadioButton();
        radioBtn_Venda = new javax.swing.JRadioButton();
        txt_Vendedor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        panel_Produto = new javax.swing.JPanel();
        lbl_Produto = new javax.swing.JLabel();
        lbl_Tp_Produto = new javax.swing.JLabel();
        lbl_Qntd = new javax.swing.JLabel();
        lbl_Tamanho = new javax.swing.JLabel();
        lbl_Valor = new javax.swing.JLabel();
        lbl_Valor_Total = new javax.swing.JLabel();
        lbl_Id_Produto = new javax.swing.JLabel();
        txt_Produto = new javax.swing.JTextField();
        txt_Tp_Produto = new javax.swing.JTextField();
        txt_Qntd = new javax.swing.JTextField();
        comboBox_Tamanho = new javax.swing.JComboBox<>();
        txt_Valor = new javax.swing.JTextField();
        txt_Valor_Total = new javax.swing.JTextField();
        txt_Id_Produto = new javax.swing.JTextField();
        panel_Info_Produto = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Estoque = new javax.swing.JTable();
        panel_Cts = new javax.swing.JPanel();
        lbl_Nome = new javax.swing.JLabel();
        lbl_Telefone = new javax.swing.JLabel();
        lbl_Id_Cliente = new javax.swing.JLabel();
        txt_Cliente = new javax.swing.JTextField();
        txt_Telefone = new javax.swing.JTextField();
        txt_Id_Cliente = new javax.swing.JTextField();
        panel_Info_Cts = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_Cliente = new javax.swing.JTable();
        panel_Info_Venda = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_Info_Vendas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panel_Informacoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações"));

        lbl_nm_venda.setText("Número Venda");

        lbl_dt_venda.setText("Data da Venda");

        txt_nm_venda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nm_vendaActionPerformed(evt);
            }
        });

        radioBtn_Orcamento.setText("Orçamento");

        radioBtn_Venda.setText("Venda");

        txt_Vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_VendedorActionPerformed(evt);
            }
        });

        jLabel1.setText("Vendedor");

        javax.swing.GroupLayout panel_InformacoesLayout = new javax.swing.GroupLayout(panel_Informacoes);
        panel_Informacoes.setLayout(panel_InformacoesLayout);
        panel_InformacoesLayout.setHorizontalGroup(
            panel_InformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_InformacoesLayout.createSequentialGroup()
                .addGroup(panel_InformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_nm_venda)
                    .addComponent(radioBtn_Orcamento)
                    .addComponent(txt_nm_venda, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_InformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioBtn_Venda)
                    .addGroup(panel_InformacoesLayout.createSequentialGroup()
                        .addGroup(panel_InformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_dt_venda, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_dt_venda))
                        .addGroup(panel_InformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_InformacoesLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(txt_Vendedor))
                            .addGroup(panel_InformacoesLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)))))
                .addContainerGap())
        );
        panel_InformacoesLayout.setVerticalGroup(
            panel_InformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_InformacoesLayout.createSequentialGroup()
                .addGroup(panel_InformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nm_venda)
                    .addComponent(lbl_dt_venda)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_InformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nm_venda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_dt_venda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panel_InformacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioBtn_Orcamento)
                    .addComponent(radioBtn_Venda))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        panel_Produto.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos"));

        lbl_Produto.setText("Produto");

        lbl_Tp_Produto.setText("Tipo Produto");

        lbl_Qntd.setText("Quantidade");

        lbl_Tamanho.setText("Tamanho");

        lbl_Valor.setText("Valor");

        lbl_Valor_Total.setText("Valor Total");

        lbl_Id_Produto.setText("ID");

        comboBox_Tamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panel_ProdutoLayout = new javax.swing.GroupLayout(panel_Produto);
        panel_Produto.setLayout(panel_ProdutoLayout);
        panel_ProdutoLayout.setHorizontalGroup(
            panel_ProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_ProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_ProdutoLayout.createSequentialGroup()
                        .addGroup(panel_ProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Produto, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                            .addComponent(lbl_Produto)
                            .addComponent(lbl_Tp_Produto)
                            .addComponent(lbl_Qntd)
                            .addComponent(txt_Tp_Produto))
                        .addGap(0, 72, Short.MAX_VALUE))
                    .addGroup(panel_ProdutoLayout.createSequentialGroup()
                        .addGroup(panel_ProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_ProdutoLayout.createSequentialGroup()
                                .addGroup(panel_ProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_ProdutoLayout.createSequentialGroup()
                                        .addComponent(lbl_Tamanho)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbl_Valor))
                                    .addComponent(txt_Qntd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(76, 76, 76)
                                .addComponent(lbl_Valor_Total))
                            .addGroup(panel_ProdutoLayout.createSequentialGroup()
                                .addComponent(comboBox_Tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(txt_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_Valor_Total)))
                        .addGap(18, 18, 18)
                        .addGroup(panel_ProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Id_Produto)
                            .addComponent(txt_Id_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panel_ProdutoLayout.setVerticalGroup(
            panel_ProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Produto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lbl_Tp_Produto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Tp_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Qntd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Qntd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_ProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Tamanho)
                    .addComponent(lbl_Valor)
                    .addComponent(lbl_Id_Produto)
                    .addComponent(lbl_Valor_Total))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_ProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBox_Tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Id_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Valor_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panel_Info_Produto.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabela Produto"));

        tbl_Estoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Produto", "Tipo", "Quantidade", "Tamanho", "Valor"
            }
        ));
        jScrollPane1.setViewportView(tbl_Estoque);

        javax.swing.GroupLayout panel_Info_ProdutoLayout = new javax.swing.GroupLayout(panel_Info_Produto);
        panel_Info_Produto.setLayout(panel_Info_ProdutoLayout);
        panel_Info_ProdutoLayout.setHorizontalGroup(
            panel_Info_ProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_Info_ProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_Info_ProdutoLayout.setVerticalGroup(
            panel_Info_ProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Info_ProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_Cts.setBorder(javax.swing.BorderFactory.createTitledBorder("Clientes"));

        lbl_Nome.setText("Nome Cliente");

        lbl_Telefone.setText("Telefone");

        lbl_Id_Cliente.setText("ID");

        javax.swing.GroupLayout panel_CtsLayout = new javax.swing.GroupLayout(panel_Cts);
        panel_Cts.setLayout(panel_CtsLayout);
        panel_CtsLayout.setHorizontalGroup(
            panel_CtsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_CtsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_CtsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_CtsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt_Telefone, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                        .addComponent(lbl_Nome, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_Telefone, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_Id_Cliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_Cliente))
                    .addComponent(txt_Id_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_CtsLayout.setVerticalGroup(
            panel_CtsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_CtsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Telefone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(lbl_Id_Cliente)
                .addGap(2, 2, 2)
                .addComponent(txt_Id_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel_Info_Cts.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Tabela Clientes")));

        tbl_Cliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Telefone", "Email"
            }
        ));
        jScrollPane2.setViewportView(tbl_Cliente);

        javax.swing.GroupLayout panel_Info_CtsLayout = new javax.swing.GroupLayout(panel_Info_Cts);
        panel_Info_Cts.setLayout(panel_Info_CtsLayout);
        panel_Info_CtsLayout.setHorizontalGroup(
            panel_Info_CtsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Info_CtsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        panel_Info_CtsLayout.setVerticalGroup(
            panel_Info_CtsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Info_CtsLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_Info_Venda.setBorder(javax.swing.BorderFactory.createTitledBorder("Itens Lançados"));

        tbl_Info_Vendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Produto", "Tipo", "Quantidade", "Tamanho", "Valor Total", "Cliente", "Vendedor"
            }
        ));
        jScrollPane3.setViewportView(tbl_Info_Vendas);

        javax.swing.GroupLayout panel_Info_VendaLayout = new javax.swing.GroupLayout(panel_Info_Venda);
        panel_Info_Venda.setLayout(panel_Info_VendaLayout);
        panel_Info_VendaLayout.setHorizontalGroup(
            panel_Info_VendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Info_VendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        panel_Info_VendaLayout.setVerticalGroup(
            panel_Info_VendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Info_VendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_Cts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Produto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Informacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_Info_Produto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Info_Cts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Info_Venda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_Info_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_Info_Cts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_Info_Venda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_Informacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_Cts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1280, 780));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nm_vendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nm_vendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nm_vendaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void txt_VendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_VendedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_VendedorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBox_Tamanho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_Id_Cliente;
    private javax.swing.JLabel lbl_Id_Produto;
    private javax.swing.JLabel lbl_Nome;
    private javax.swing.JLabel lbl_Produto;
    private javax.swing.JLabel lbl_Qntd;
    private javax.swing.JLabel lbl_Tamanho;
    private javax.swing.JLabel lbl_Telefone;
    private javax.swing.JLabel lbl_Tp_Produto;
    private javax.swing.JLabel lbl_Valor;
    private javax.swing.JLabel lbl_Valor_Total;
    private javax.swing.JLabel lbl_dt_venda;
    private javax.swing.JLabel lbl_nm_venda;
    private javax.swing.JPanel panel_Cts;
    private javax.swing.JPanel panel_Info_Cts;
    private javax.swing.JPanel panel_Info_Produto;
    private javax.swing.JPanel panel_Info_Venda;
    private javax.swing.JPanel panel_Informacoes;
    private javax.swing.JPanel panel_Produto;
    private javax.swing.JRadioButton radioBtn_Orcamento;
    private javax.swing.JRadioButton radioBtn_Venda;
    private javax.swing.JTable tbl_Cliente;
    private javax.swing.JTable tbl_Estoque;
    private javax.swing.JTable tbl_Info_Vendas;
    private javax.swing.JTextField txt_Cliente;
    private javax.swing.JTextField txt_Id_Cliente;
    private javax.swing.JTextField txt_Id_Produto;
    private javax.swing.JTextField txt_Produto;
    private javax.swing.JTextField txt_Qntd;
    private javax.swing.JTextField txt_Telefone;
    private javax.swing.JTextField txt_Tp_Produto;
    private javax.swing.JTextField txt_Valor;
    private javax.swing.JTextField txt_Valor_Total;
    public static javax.swing.JTextField txt_Vendedor;
    private javax.swing.JTextField txt_dt_venda;
    private javax.swing.JTextField txt_nm_venda;
    // End of variables declaration//GEN-END:variables
}
