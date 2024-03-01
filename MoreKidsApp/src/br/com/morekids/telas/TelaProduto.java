/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.morekids.telas;

import br.com.morekids.dal.ModuloConexao;
import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Victor
 */
public class TelaProduto extends javax.swing.JInternalFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    // Adicionando Produto;
    private void adicionar() {
        String sql = "insert into tb_estoque (Nome_Produto, Tipo_Produto, Quantidade_Disponivel, Valor_Unitario, Tamanho ) values (?, ?, ?, ?, ?)";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txt_Nome_Produto.getText());
            pst.setString(2, txt_Tipo_Produto.getText());
            pst.setString(3, txt_Quantidade.getText());
            pst.setString(4, txt_Valor.getText());
            pst.setString(5, comboBox_Tamanho.getSelectedItem().toString());

            //Validação dos Campos Obrigaatórios;
            if ((txt_Nome_Produto.getText().isEmpty()) || (txt_Tipo_Produto.getText().isEmpty()) || (txt_Quantidade.getText().isEmpty()) || (txt_Valor.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Preencha todos os Campos OBRIGATÓRIOS!");
            } else {
                //A linha abaixo atualiza a tabela usuario com os dados do formulário;
                int adicionado = pst.executeUpdate();

                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Produto adicionado com Sucesso!");
                    limpar();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
        // Pesquisando Produto;
    private void read() {
        String sql = "select * from tb_estoque where ID_Estoque=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txt_Id.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                txt_Nome_Produto.setText(rs.getString(2));
                txt_Tipo_Produto.setText(rs.getString(3));
                txt_Quantidade.setText(rs.getString(4));
                txt_Valor.setText(rs.getString(5));
                comboBox_Tamanho.setSelectedItem(rs.getString(6));
                
            } else {
                JOptionPane.showMessageDialog(null, "Produto não Cadastrado!");
                limpar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
     
    
    //Alterar Produto
    private void alterar() {
        String sql = "update tb_estoque set Nome_Produto=?, Tipo_Produto=?, Quantidade_Disponivel=?, Valor_Unitario=?, Tamanho=? where ID_Estoque=?";
        //
        try {

            pst = conexao.prepareStatement(sql);
            pst.setString(1, txt_Nome_Produto.getText());
            pst.setString(2, txt_Tipo_Produto.getText());
            pst.setString(3, txt_Quantidade.getText());
            pst.setString(4, comboBox_Tamanho.getSelectedItem().toString());
            pst.setString(5, txt_Valor.getText());
            pst.setString(6, txt_Id.getText());
            if ((txt_Nome_Produto.getText().isEmpty()) || (txt_Tipo_Produto.getText().isEmpty()) || (txt_Quantidade.getText().isEmpty()) || (txt_Valor.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Preencha todos os Campos OBRIGATÓRIOS!");
            } else {
                //A linha abaixo atualiza os dados do usuario com os dados da tabela;
                int alterado = pst.executeUpdate();

                if (alterado > 0) {
                    JOptionPane.showMessageDialog(null, "Dados do Produto alterados com Sucesso!");
                    limpar();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    //Deletando Produto
    private void deletar() {
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover este Item do Estoque?", "Atenção", JOptionPane.YES_NO_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {
            String sql = "delete from tb_estoque where Nome_Produto=?";
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, txt_Nome_Produto.getText());
                int apagado = pst.executeUpdate();
                if (apagado > 0) {
                    JOptionPane.showMessageDialog(null, "Item deletado com Sucesso!");
                    limpar();
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        try {

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Método para limpar os campos do formulário
    private void limpar() {
        txt_Id.setText(null);
        txt_Nome_Produto.setText(null);
        txt_Tipo_Produto.setText(null);
        txt_Quantidade.setText(null);
        txt_Valor.setText(null);
    }
    public TelaProduto() {
        initComponents();
        conexao = ModuloConexao.conector();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Castro_Produtos = new javax.swing.JLabel();
        lbl_Id = new javax.swing.JLabel();
        lbl_Nome_Produto = new javax.swing.JLabel();
        lbl_Tipo_Produto = new javax.swing.JLabel();
        lbl_Quantidade = new javax.swing.JLabel();
        lbl_Tamanho = new javax.swing.JLabel();
        lbl_Valor = new javax.swing.JLabel();
        txt_Id = new javax.swing.JTextField();
        txt_Nome_Produto = new javax.swing.JTextField();
        txt_Tipo_Produto = new javax.swing.JTextField();
        txt_Quantidade = new javax.swing.JTextField();
        comboBox_Tamanho = new javax.swing.JComboBox<>();
        txt_Valor = new javax.swing.JTextField();
        btn_Create = new javax.swing.JButton();
        btn_Update = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();
        btn_Read = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();

        setBorder(null);
        setClosable(true);
        setTitle("Cadastro de Produto");
        setToolTipText("");

        lbl_Castro_Produtos.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lbl_Castro_Produtos.setText("Cadastro de Produtos");

        lbl_Id.setText("Id");

        lbl_Nome_Produto.setText("Nome Produto");

        lbl_Tipo_Produto.setText("Tipo Produto");

        lbl_Quantidade.setText("Quantidade");

        lbl_Tamanho.setText("Tamanho");

        lbl_Valor.setText("Valor");

        txt_Tipo_Produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Tipo_ProdutoActionPerformed(evt);
            }
        });

        comboBox_Tamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "4", "6", "8", "10", "12", "14", "16", "PP", "P", "M", "G", "GG", "XG", "EXG" }));

        btn_Create.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/morekids/icons/create.png"))); // NOI18N
        btn_Create.setToolTipText("Create");
        btn_Create.setPreferredSize(new java.awt.Dimension(80, 80));
        btn_Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CreateActionPerformed(evt);
            }
        });

        btn_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/morekids/icons/update.png"))); // NOI18N
        btn_Update.setToolTipText("Update");
        btn_Update.setPreferredSize(new java.awt.Dimension(80, 80));
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });

        btn_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/morekids/icons/delete.png"))); // NOI18N
        btn_Delete.setToolTipText("Delete");
        btn_Delete.setPreferredSize(new java.awt.Dimension(80, 80));
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });

        btn_Read.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/morekids/icons/read.png"))); // NOI18N
        btn_Read.setPreferredSize(new java.awt.Dimension(80, 80));
        btn_Read.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbl_Castro_Produtos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(lbl_Id)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Create, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Read, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Nome_Produto)
                                    .addComponent(lbl_Tipo_Produto, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_Quantidade, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_Tamanho, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_Valor, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_Nome_Produto)
                                    .addComponent(txt_Tipo_Produto)
                                    .addComponent(txt_Quantidade)
                                    .addComponent(comboBox_Tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Valor, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE))))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbl_Castro_Produtos)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Id)
                            .addComponent(txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Nome_Produto)
                            .addComponent(txt_Nome_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Tipo_Produto)
                            .addComponent(txt_Tipo_Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Quantidade)
                            .addComponent(txt_Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Tamanho)
                            .addComponent(comboBox_Tamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Valor)
                            .addComponent(txt_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_Create, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btn_Read, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(239, Short.MAX_VALUE))
        );

        setBounds(0, 0, 796, 687);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_Tipo_ProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Tipo_ProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Tipo_ProdutoActionPerformed

    private void btn_CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CreateActionPerformed
        // TODO add your handling code here:
        adicionar();
    }//GEN-LAST:event_btn_CreateActionPerformed

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        // TODO add your handling code here:
        alterar();
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void btn_ReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReadActionPerformed
        read();
    }//GEN-LAST:event_btn_ReadActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        deletar();
    }//GEN-LAST:event_btn_DeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Create;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Read;
    private javax.swing.JButton btn_Update;
    private javax.swing.JComboBox<String> comboBox_Tamanho;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Castro_Produtos;
    private javax.swing.JLabel lbl_Id;
    private javax.swing.JLabel lbl_Nome_Produto;
    private javax.swing.JLabel lbl_Quantidade;
    private javax.swing.JLabel lbl_Tamanho;
    private javax.swing.JLabel lbl_Tipo_Produto;
    private javax.swing.JLabel lbl_Valor;
    public static javax.swing.JTextField txt_Id;
    private javax.swing.JTextField txt_Nome_Produto;
    private javax.swing.JTextField txt_Quantidade;
    private javax.swing.JTextField txt_Tipo_Produto;
    private javax.swing.JTextField txt_Valor;
    // End of variables declaration//GEN-END:variables
}
