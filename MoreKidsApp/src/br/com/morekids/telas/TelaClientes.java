package br.com.morekids.telas;

import java.sql.*;
import br.com.morekids.dal.ModuloConexao;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import br.com.morekids.telas.conexoes.Cliente;

/**
 *
 * @author Victor
 */
public class TelaClientes extends javax.swing.JInternalFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    private Cliente cliente;

    // Pesquisando Com Filtro
    private void pesquisar_cliente() {
        String sql = "select ID_CTS as Id, Nome_cli as Nome, Fone_cli as Telefone, Genero_cli as Genero from tb_clientes where Nome_cli like ?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txt_Cliente_Pesquisar.getText() + "%");
            rs = pst.executeQuery();
            tbl_Clientes.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void setar_campos() {
        int setar = tbl_Clientes.getSelectedRow();
        txt_Id_Cliente.setText(tbl_Clientes.getModel().getValueAt(setar, 0).toString());
        txt_Nome_Cliente.setText(tbl_Clientes.getModel().getValueAt(setar, 1).toString());
        txt_Fone_Cliente.setText(tbl_Clientes.getModel().getValueAt(setar, 2).toString());
        txt_Genero_Cliente.setText(tbl_Clientes.getModel().getValueAt(setar, 3).toString());
    }

    //Deletando Cliente
    private void deletar() {
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover este Cliente?", "Atenção", JOptionPane.YES_NO_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {
            String sql = "delete from tb_clientes where Nome_cli=?";
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, txt_Nome_Cliente.getText());
                int apagado = pst.executeUpdate();
                if (apagado > 0) {
                    JOptionPane.showMessageDialog(null, "Usuário deletado com Sucesso!");
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
        txt_Id_Cliente.setText(null);
        txt_Nome_Cliente.setText(null);
        txt_Fone_Cliente.setText(null);
        txt_Genero_Cliente.setText(null);
    }

    public TelaClientes() {
        initComponents();
        conexao = ModuloConexao.conector();
        cliente = new Cliente(conexao);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Cadastro_Cliente = new javax.swing.JLabel();
        lbl_Nome_Cliente = new javax.swing.JLabel();
        lbl_Fone_Cliente = new javax.swing.JLabel();
        lbl_Genero_Cliente = new javax.swing.JLabel();
        txt_Nome_Cliente = new javax.swing.JTextField();
        txt_Fone_Cliente = new javax.swing.JTextField();
        txt_Genero_Cliente = new javax.swing.JTextField();
        btn_Cadastro_Cliente = new javax.swing.JButton();
        btb_Edita_Cliente = new javax.swing.JButton();
        btn_Delete_Cliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_Cliente_Pesquisar = new javax.swing.JTextField();
        btn_Pesquisar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Clientes = new javax.swing.JTable();
        lbl_Id_Cliente = new javax.swing.JLabel();
        txt_Id_Cliente = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 0, 0));
        setBorder(null);
        setClosable(true);
        setForeground(java.awt.Color.black);
        setTitle("Cadastro de Clientes");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusable(false);
        setPreferredSize(new java.awt.Dimension(80, 80));
        setRequestFocusEnabled(false);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        lbl_Cadastro_Cliente.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lbl_Cadastro_Cliente.setText("Cadastro de Clientes");

        lbl_Nome_Cliente.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_Nome_Cliente.setText("Nome *");

        lbl_Fone_Cliente.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_Fone_Cliente.setText("Telefone *");

        lbl_Genero_Cliente.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_Genero_Cliente.setText("Genero *");

        txt_Nome_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Nome_ClienteActionPerformed(evt);
            }
        });

        btn_Cadastro_Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/morekids/icons/create.png"))); // NOI18N
        btn_Cadastro_Cliente.setPreferredSize(new java.awt.Dimension(80, 80));
        btn_Cadastro_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Cadastro_ClienteActionPerformed(evt);
            }
        });

        btb_Edita_Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/morekids/icons/update.png"))); // NOI18N
        btb_Edita_Cliente.setPreferredSize(new java.awt.Dimension(80, 80));
        btb_Edita_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btb_Edita_ClienteActionPerformed(evt);
            }
        });

        btn_Delete_Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/morekids/icons/delete.png"))); // NOI18N
        btn_Delete_Cliente.setPreferredSize(new java.awt.Dimension(80, 80));
        btn_Delete_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Delete_ClienteActionPerformed(evt);
            }
        });

        jLabel1.setText("Todos os direitos reservados ©  , 2024.");

        txt_Cliente_Pesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_Cliente_PesquisarKeyReleased(evt);
            }
        });

        btn_Pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/morekids/icons/pesquisar.png"))); // NOI18N

        tbl_Clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Telefone", "Genero"
            }
        ));
        tbl_Clientes.setFocusable(false);
        tbl_Clientes.getTableHeader().setResizingAllowed(false);
        tbl_Clientes.getTableHeader().setReorderingAllowed(false);
        tbl_Clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ClientesMouseClicked(evt);
            }
        });
        tbl_Clientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_ClientesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Clientes);

        lbl_Id_Cliente.setText("Id");

        txt_Id_Cliente.setEnabled(false);
        txt_Id_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Id_ClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(321, 321, 321))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_Cliente_Pesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Pesquisar)
                        .addGap(451, 451, 451))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Id_Cliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Id_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(393, 393, 393)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btb_Edita_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Cadastro_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Delete_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Cadastro_Cliente)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_Genero_Cliente)
                                    .addComponent(lbl_Fone_Cliente)
                                    .addComponent(lbl_Nome_Cliente))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_Genero_Cliente, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Fone_Cliente, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Nome_Cliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(335, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Cadastro_Cliente)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_Cliente_Pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Pesquisar))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Cadastro_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btb_Edita_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_Delete_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Id_Cliente)
                            .addComponent(txt_Id_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Nome_Cliente)
                            .addComponent(txt_Nome_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Fone_Cliente)
                            .addComponent(txt_Fone_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Genero_Cliente)
                            .addComponent(txt_Genero_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addContainerGap())))
        );

        setBounds(0, 0, 796, 686);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Delete_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Delete_ClienteActionPerformed
        // Deletando Cliente
        deletar();
    }//GEN-LAST:event_btn_Delete_ClienteActionPerformed

    private void btb_Edita_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btb_Edita_ClienteActionPerformed
        try {
            if (cliente.alterar(txt_Nome_Cliente.getText(), txt_Fone_Cliente.getText(), txt_Genero_Cliente.getText())) {
                JOptionPane.showMessageDialog(null, "Cliente editado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao editar o cliente. Verifique os campos.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao editar o cliente: " + ex.getMessage());
        }
    }//GEN-LAST:event_btb_Edita_ClienteActionPerformed

    private void btn_Cadastro_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Cadastro_ClienteActionPerformed
        try {
            // Certifique-se de que txt_Nome_Cliente, txt_Fone_Cliente e txt_Genero_Cliente são componentes válidos
            cliente.adicionar(txt_Nome_Cliente.getText(), txt_Fone_Cliente.getText(), txt_Genero_Cliente.getText());
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_btn_Cadastro_ClienteActionPerformed

    private void tbl_ClientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_ClientesKeyReleased

    }//GEN-LAST:event_tbl_ClientesKeyReleased

    private void txt_Cliente_PesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Cliente_PesquisarKeyReleased
        // O Evento abaixo é quando for digitando em tempo real:
        pesquisar_cliente();
    }//GEN-LAST:event_txt_Cliente_PesquisarKeyReleased

    private void tbl_ClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ClientesMouseClicked
        // Quando Clicar em cima dos campos da tabela:
        setar_campos();
    }//GEN-LAST:event_tbl_ClientesMouseClicked

    private void txt_Id_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Id_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Id_ClienteActionPerformed

    private void txt_Nome_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Nome_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Nome_ClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btb_Edita_Cliente;
    private javax.swing.JButton btn_Cadastro_Cliente;
    private javax.swing.JButton btn_Delete_Cliente;
    private javax.swing.JLabel btn_Pesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Cadastro_Cliente;
    private javax.swing.JLabel lbl_Fone_Cliente;
    private javax.swing.JLabel lbl_Genero_Cliente;
    private javax.swing.JLabel lbl_Id_Cliente;
    private javax.swing.JLabel lbl_Nome_Cliente;
    private javax.swing.JTable tbl_Clientes;
    private javax.swing.JTextField txt_Cliente_Pesquisar;
    private javax.swing.JTextField txt_Fone_Cliente;
    private javax.swing.JTextField txt_Genero_Cliente;
    private javax.swing.JTextField txt_Id_Cliente;
    private javax.swing.JTextField txt_Nome_Cliente;
    // End of variables declaration//GEN-END:variables
}
