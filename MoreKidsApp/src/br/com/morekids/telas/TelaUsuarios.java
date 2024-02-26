package br.com.morekids.telas;

import java.sql.*;
import br.com.morekids.dal.ModuloConexao;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor
 */
public class TelaUsuarios extends javax.swing.JInternalFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    // Pesquisando Usuários;
    private void read() {
        String sql = "select * from tb_adm where ID_ADM=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txt_Id_Usuario.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                txt_Nome_Usuario.setText(rs.getString(2));
                txt_Email_Usuario.setText(rs.getString(3));
                txt_Senha_Usuario.setText(rs.getString(4));
                txt_Genero_Usuario.setText(rs.getString(5));
                txt_Login_Usuario.setText(rs.getString(7));
                comboBox_TipoDePerfil.setSelectedItem(rs.getString(6));
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não Cadastrado!");
                //A linha abaixo limpam os campos;
                txt_Nome_Usuario.setText(null);
                txt_Email_Usuario.setText(null);
                txt_Senha_Usuario.setText(null);
                txt_Genero_Usuario.setText(null);
                txt_Login_Usuario.setText(null);
                comboBox_TipoDePerfil.setSelectedItem(null);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Adicionando Usuários;
    private void adicionar() {
        String sql = "insert into tb_adm (ID_ADM, Nome, Email, Senha, Genero, perfil, Login ) values (?, ?, ?, ?, ?, ?, ?)";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txt_Id_Usuario.getText());
            pst.setString(2, txt_Nome_Usuario.getText());
            pst.setString(3, txt_Email_Usuario.getText());
            pst.setString(4, txt_Senha_Usuario.getText());
            pst.setString(5, txt_Genero_Usuario.getText());
            pst.setString(6, comboBox_TipoDePerfil.getSelectedItem().toString());
            pst.setString(7, txt_Login_Usuario.getText());

            //Validação dos Campos Obrigaatórios;
            if ((txt_Id_Usuario.getText().isEmpty()) || (txt_Nome_Usuario.getText().isEmpty()) || (txt_Email_Usuario.getText().isEmpty()) || (txt_Senha_Usuario.getText().isEmpty()) || (txt_Genero_Usuario.getText().isEmpty()) || (txt_Login_Usuario.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Preencha todos os Campos OBRIGATÓRIOS!");
            } else {
                //A linha abaixo atualiza a tabela usuario com os dados do formulário;
                int adicionado = pst.executeUpdate();

                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Usuário adicionado com Sucesso!");
                    txt_Id_Usuario.setText(null);
                    txt_Nome_Usuario.setText(null);
                    txt_Email_Usuario.setText(null);
                    txt_Senha_Usuario.setText(null);
                    txt_Genero_Usuario.setText(null);
                    txt_Login_Usuario.setText(null);
                    comboBox_TipoDePerfil.setSelectedItem(null);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Criando o Metodo para alterar dados do usuario
    private void alterar() {
        String sql = "update tb_adm set Nome=?, Email=?, Senha=?, Genero=?, perfil=?, Login=? where ID_ADM=?";
        //
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txt_Nome_Usuario.getText());
            pst.setString(2, txt_Email_Usuario.getText());
            pst.setString(3, txt_Senha_Usuario.getText());
            pst.setString(4, txt_Genero_Usuario.getText());
            pst.setString(5, comboBox_TipoDePerfil.getSelectedItem().toString());
            pst.setString(6, txt_Login_Usuario.getText());
            pst.setString(7, txt_Id_Usuario.getText());
            if ((txt_Id_Usuario.getText().isEmpty()) || (txt_Nome_Usuario.getText().isEmpty()) || (txt_Email_Usuario.getText().isEmpty()) || (txt_Senha_Usuario.getText().isEmpty()) || (txt_Genero_Usuario.getText().isEmpty()) || (txt_Login_Usuario.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Preencha todos os Campos OBRIGATÓRIOS!");
            } else {
                //A linha abaixo atualiza os dados do usuario com os dados da tabela;
                int adicionado = pst.executeUpdate();

                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Dados do usuário alterados com Sucesso!");
                    txt_Id_Usuario.setText(null);
                    txt_Nome_Usuario.setText(null);
                    txt_Email_Usuario.setText(null);
                    txt_Senha_Usuario.setText(null);
                    txt_Genero_Usuario.setText(null);
                    txt_Login_Usuario.setText(null);
                    comboBox_TipoDePerfil.setSelectedItem(null);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    // Criando o Método para a Exclusão de Usuário;
    private void deletar() {
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover este usuário?", "Atenção", JOptionPane.YES_NO_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {
            String sql = "delete from tb_adm where ID_ADM=?";
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, txt_Id_Usuario.getText());
                int apagado = pst.executeUpdate();
                if (apagado > 0) {
                    JOptionPane.showMessageDialog(null, "Usuário deletado com Sucesso!");
                    txt_Id_Usuario.setText(null);
                    txt_Nome_Usuario.setText(null);
                    txt_Email_Usuario.setText(null);
                    txt_Senha_Usuario.setText(null);
                    txt_Genero_Usuario.setText(null);
                    txt_Login_Usuario.setText(null);
                    comboBox_TipoDePerfil.setSelectedItem(null);
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

    public TelaUsuarios() {
        initComponents();
        conexao = ModuloConexao.conector();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_CadastrodeUsuario = new javax.swing.JLabel();
        lbl_Nome_Usuário = new javax.swing.JLabel();
        lbl_Email_Usuário = new javax.swing.JLabel();
        lbl_Senha_Usuário = new javax.swing.JLabel();
        lbl_Genero_Usuário = new javax.swing.JLabel();
        lbl_Login_Usuário = new javax.swing.JLabel();
        lbl_Perfil_Usuário = new javax.swing.JLabel();
        txt_Nome_Usuario = new javax.swing.JTextField();
        txt_Email_Usuario = new javax.swing.JTextField();
        txt_Senha_Usuario = new javax.swing.JTextField();
        txt_Genero_Usuario = new javax.swing.JTextField();
        txt_Login_Usuario = new javax.swing.JTextField();
        comboBox_TipoDePerfil = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        btn_Create = new javax.swing.JButton();
        btn_Read = new javax.swing.JButton();
        btn_Update = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();
        lbl_Id_Usuario = new javax.swing.JLabel();
        txt_Id_Usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));
        setBorder(null);
        setClosable(true);
        setTitle("Usuários");

        lbl_CadastrodeUsuario.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        lbl_CadastrodeUsuario.setText("Cadastro de Usuário");

        lbl_Nome_Usuário.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_Nome_Usuário.setText("Nome Completo *");

        lbl_Email_Usuário.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_Email_Usuário.setText("E -mail *");

        lbl_Senha_Usuário.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_Senha_Usuário.setText("Senha *");

        lbl_Genero_Usuário.setText("Genero *");

        lbl_Login_Usuário.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_Login_Usuário.setText("Login *");

        lbl_Perfil_Usuário.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lbl_Perfil_Usuário.setText("Tipo de Perfil *");

        txt_Nome_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Nome_UsuarioActionPerformed(evt);
            }
        });

        txt_Senha_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Senha_UsuarioActionPerformed(evt);
            }
        });

        comboBox_TipoDePerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "user" }));

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel11.setText("Todos os direitos reservados ©  , 2024.");

        btn_Create.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/morekids/icons/create.png"))); // NOI18N
        btn_Create.setToolTipText("Criar");
        btn_Create.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Create.setPreferredSize(new java.awt.Dimension(80, 80));
        btn_Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CreateActionPerformed(evt);
            }
        });

        btn_Read.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/morekids/icons/read.png"))); // NOI18N
        btn_Read.setToolTipText("Pesquisar");
        btn_Read.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Read.setPreferredSize(new java.awt.Dimension(80, 80));
        btn_Read.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReadActionPerformed(evt);
            }
        });

        btn_Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/morekids/icons/update.png"))); // NOI18N
        btn_Update.setToolTipText("Editar");
        btn_Update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Update.setPreferredSize(new java.awt.Dimension(80, 80));
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });

        btn_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/morekids/icons/delete.png"))); // NOI18N
        btn_Delete.setToolTipText("Excluir");
        btn_Delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Delete.setPreferredSize(new java.awt.Dimension(80, 80));
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });

        lbl_Id_Usuario.setText("ID *");

        jLabel1.setText("*Campos Obrigatórios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_CadastrodeUsuario)
                        .addGap(292, 292, 292))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(287, 287, 287))))
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_Create, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(83, 83, 83)
                        .addComponent(btn_Read, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(77, 77, 77)
                        .addComponent(btn_Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(69, 69, 69)
                        .addComponent(btn_Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(130, 130, 130))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Nome_Usuário)
                            .addComponent(lbl_Email_Usuário)
                            .addComponent(lbl_Senha_Usuário)
                            .addComponent(txt_Nome_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Email_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Senha_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboBox_TipoDePerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_Id_Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                            .addComponent(lbl_Login_Usuário)
                            .addComponent(lbl_Genero_Usuário)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Perfil_Usuário)
                                .addGap(50, 50, 50)
                                .addComponent(lbl_Id_Usuario))
                            .addComponent(txt_Genero_Usuario)
                            .addComponent(txt_Login_Usuario, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbl_CadastrodeUsuario)
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Nome_Usuário)
                    .addComponent(lbl_Genero_Usuário))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Nome_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Genero_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Email_Usuário)
                    .addComponent(lbl_Login_Usuário))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Email_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Login_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Senha_Usuário, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_Perfil_Usuário)
                        .addComponent(lbl_Id_Usuario)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Senha_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBox_TipoDePerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Id_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Create, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Read, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(145, 145, 145)
                .addComponent(jLabel11)
                .addGap(20, 20, 20))
        );

        setBounds(0, 0, 796, 679);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_Nome_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Nome_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Nome_UsuarioActionPerformed

    private void txt_Senha_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Senha_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Senha_UsuarioActionPerformed

    private void btn_CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CreateActionPerformed
        // Chamando o método Adicionar
        adicionar();
    }//GEN-LAST:event_btn_CreateActionPerformed

    private void btn_ReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReadActionPerformed
        // Chamando o método Consultar
        read();
    }//GEN-LAST:event_btn_ReadActionPerformed

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        // Chamando o método Alterar:
        alterar();
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        // Chamando o método Remover;
        deletar();
    }//GEN-LAST:event_btn_DeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Create;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Read;
    private javax.swing.JButton btn_Update;
    private javax.swing.JComboBox<String> comboBox_TipoDePerfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel lbl_CadastrodeUsuario;
    private javax.swing.JLabel lbl_Email_Usuário;
    private javax.swing.JLabel lbl_Genero_Usuário;
    private javax.swing.JLabel lbl_Id_Usuario;
    private javax.swing.JLabel lbl_Login_Usuário;
    private javax.swing.JLabel lbl_Nome_Usuário;
    private javax.swing.JLabel lbl_Perfil_Usuário;
    private javax.swing.JLabel lbl_Senha_Usuário;
    private javax.swing.JTextField txt_Email_Usuario;
    private javax.swing.JTextField txt_Genero_Usuario;
    private javax.swing.JTextField txt_Id_Usuario;
    private javax.swing.JTextField txt_Login_Usuario;
    private javax.swing.JTextField txt_Nome_Usuario;
    private javax.swing.JTextField txt_Senha_Usuario;
    // End of variables declaration//GEN-END:variables
}
