package br.com.morekids.telas;

import java.sql.*;
import br.com.morekids.dal.ModuloConexao;
import java.awt.Color;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public void logar() {
        String sql = "select * from tb_usuario where Login=? and Senha=?";
        try {
            // As linhs abaaixo preparam a aconsulta ao banco em função ao que foi digitado nas caixas de texto;
            // O '?' é substituído pelo conteúdo das variáveis
            pst = conexao.prepareStatement(sql);
            pst.setString(1, user_box_field.getText());
            pst.setString(2, password_box_field.getText());        
            // A linha abaixo executa a query;
            rs = pst.executeQuery();            
            // Se existir usuáio e senha correspondente
            if (rs.next()) {
                // A linha abaixo obtém o conteúdo do campo Perfil da tabela tb_adm;
                String Perfil = rs.getString(6);
                //System.out.println(perfil);
                //A estrutura abaixo faz o tratamento do perfil do usuário;
                if(Perfil.equals("Administrador")){
                TelaPrincipal principal = new TelaPrincipal();
                principal.setVisible(true);
                TelaPrincipal.relatorio_Bar.setEnabled(true);
                TelaPrincipal.usuario_Cadastro_Menu_Bar.setEnabled(true);
                TelaPrincipal.produto_Cadastro_Menu_Bar.setEnabled(true);
                TelaPrincipal.lbl_usuario.setText(rs.getString(2));
                TelaPrincipal.lbl_usuario.setForeground(Color.red);             
                this.dispose();
                conexao.close();
                }
                else{
                TelaPrincipal principal = new TelaPrincipal();
                principal.setVisible(true);
                this.dispose();
                TelaPrincipal.lbl_usuario.setText(rs.getString(2));
                TelaPrincipal.lbl_usuario.setForeground(Color.DARK_GRAY);
                conexao.close();
                }
                

            } else {
                JOptionPane.showMessageDialog(null, "usuário e/ou senha inválidos(s)");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public TelaLogin() {
        initComponents();
        conexao = ModuloConexao.conector();
        //System.out.println(conexao);

        if (conexao != null) {
            lblStatus.setText("Conectado com sucesso!");
            lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/morekids/icons/dbok.png")));
        } else {
            lblStatus.setText("Desconectado!");
            lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/morekids/icons/dberror.png")));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_user = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        user_box_field = new javax.swing.JTextField();
        btn_login = new javax.swing.JButton();
        password_box_field = new javax.swing.JPasswordField();
        Logo = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lbl_Login = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("More Kid's  - Login");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.darkGray);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        lbl_user.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbl_user.setText("Usuário");

        lbl_password.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbl_password.setText("Senha");

        user_box_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_box_fieldActionPerformed(evt);
            }
        });

        btn_login.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btn_login.setText("Login");
        btn_login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        password_box_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_box_fieldActionPerformed(evt);
            }
        });
        password_box_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                password_box_fieldKeyPressed(evt);
            }
        });

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/morekids/icons/150px.png"))); // NOI18N

        lblStatus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/morekids/icons/dberror.png"))); // NOI18N

        lbl_Login.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_Login.setText("Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblStatus))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(lbl_Login))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(user_box_field, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(password_box_field, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_user, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_password, javax.swing.GroupLayout.Alignment.LEADING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Logo)
                        .addGap(16, 16, 16))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_Login)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_user)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(user_box_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_password)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(password_box_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblStatus)
                        .addGap(7, 7, 7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Logo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void user_box_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_box_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_box_fieldActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // Chamando o método Logar:
        logar();
        
    }//GEN-LAST:event_btn_loginActionPerformed

    private void password_box_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_box_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_box_fieldActionPerformed

    private void password_box_fieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password_box_fieldKeyPressed

    }//GEN-LAST:event_password_box_fieldKeyPressed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lbl_Login;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JPasswordField password_box_field;
    private javax.swing.JTextField user_box_field;
    // End of variables declaration//GEN-END:variables
}
