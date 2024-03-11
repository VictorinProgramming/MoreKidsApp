package br.com.morekids.telas;

import java.sql.*;
import br.com.morekids.dal.ModuloConexao;
import br.com.morekids.telas.conexoes.Usuario;

/**
 *
 * @author Victor
 */
public class TelaUsuarios extends javax.swing.JInternalFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    private Usuario usuario;

    public TelaUsuarios() {
        initComponents();
        conexao = ModuloConexao.conector();
        usuario = new Usuario(conexao);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_CadastrodeUsuario = new javax.swing.JLabel();
        lbl_Nome_Usuário = new javax.swing.JLabel();
        lbl_Email_Usuário = new javax.swing.JLabel();
        lbl_Senha_Usuário = new javax.swing.JLabel();
        lbl_Login_Usuário = new javax.swing.JLabel();
        lbl_Perfil_Usuário = new javax.swing.JLabel();
        txt_Nome_Usuario = new javax.swing.JTextField();
        txt_Email_Usuario = new javax.swing.JTextField();
        txt_Senha_Usuario = new javax.swing.JTextField();
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

        comboBox_TipoDePerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Vendedor" }));
        comboBox_TipoDePerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_TipoDePerfilActionPerformed(evt);
            }
        });

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
                            .addComponent(txt_Senha_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Nome_Usuário)
                                    .addComponent(lbl_Email_Usuário)
                                    .addComponent(lbl_Senha_Usuário)
                                    .addComponent(txt_Nome_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Email_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(comboBox_TipoDePerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)
                                        .addComponent(txt_Id_Usuario))
                                    .addComponent(lbl_Login_Usuário)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_Perfil_Usuário)
                                        .addGap(50, 50, 50)
                                        .addComponent(lbl_Id_Usuario))
                                    .addComponent(txt_Login_Usuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_CadastrodeUsuario)
                        .addGap(92, 92, 92)
                        .addComponent(lbl_Nome_Usuário)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Nome_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Login_Usuário)
                        .addGap(2, 2, 2)
                        .addComponent(txt_Login_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbl_Email_Usuário)
                        .addGap(2, 2, 2)
                        .addComponent(txt_Email_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Perfil_Usuário)
                            .addComponent(lbl_Id_Usuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBox_TipoDePerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Id_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_Senha_Usuário)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Senha_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        usuario.adicionar(txt_Id_Usuario, txt_Nome_Usuario, txt_Email_Usuario,
                txt_Senha_Usuario, comboBox_TipoDePerfil, txt_Login_Usuario);
    }//GEN-LAST:event_btn_CreateActionPerformed

    private void btn_ReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReadActionPerformed
        // Chamando o método Consultar
        usuario.consultar(txt_Id_Usuario, txt_Nome_Usuario, txt_Email_Usuario,
                txt_Senha_Usuario, comboBox_TipoDePerfil, txt_Login_Usuario);
    }//GEN-LAST:event_btn_ReadActionPerformed

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        // Chamando o método Alterar:
        usuario.alterar(txt_Id_Usuario, txt_Nome_Usuario, txt_Email_Usuario,
                txt_Senha_Usuario, comboBox_TipoDePerfil, txt_Login_Usuario);
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        // Chamando o método Remover;
        usuario.deletar(txt_Id_Usuario);
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void comboBox_TipoDePerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_TipoDePerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBox_TipoDePerfilActionPerformed


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
    private javax.swing.JLabel lbl_Id_Usuario;
    private javax.swing.JLabel lbl_Login_Usuário;
    private javax.swing.JLabel lbl_Nome_Usuário;
    private javax.swing.JLabel lbl_Perfil_Usuário;
    private javax.swing.JLabel lbl_Senha_Usuário;
    private javax.swing.JTextField txt_Email_Usuario;
    private javax.swing.JTextField txt_Id_Usuario;
    private javax.swing.JTextField txt_Login_Usuario;
    private javax.swing.JTextField txt_Nome_Usuario;
    private javax.swing.JTextField txt_Senha_Usuario;
    // End of variables declaration//GEN-END:variables

}
