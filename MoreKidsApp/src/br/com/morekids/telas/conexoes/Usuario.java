/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.morekids.telas.conexoes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Victor
 */
public class Usuario {

    PreparedStatement pst = null;
    ResultSet rs = null;
    
    private Connection conexao;
   
    public Usuario (Connection conexao){
        this.conexao = conexao;
    }

    // Considerando que você já tem a conexão definida em algum lugar, por exemplo, em ModuloConexao
    // Método público para adicionar usuário
    public void adicionar(JTextField txt_Id_Usuario, JTextField txt_Nome_Usuario, JTextField txt_Email_Usuario,
            JTextField txt_Senha_Usuario, JComboBox<String> comboBox_TipoDePerfil, JTextField txt_Login_Usuario) {
        // ... código do método adicionar
        String sql = "insert into tb_usuario (id, nome, email, senha, perfil, login ) values (?, ?, ?, ?, ?, ?)";

        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txt_Id_Usuario.getText());
            pst.setString(2, txt_Nome_Usuario.getText());
            pst.setString(3, txt_Email_Usuario.getText());
            pst.setString(4, txt_Senha_Usuario.getText());
            pst.setString(5, comboBox_TipoDePerfil.getSelectedItem().toString());
            pst.setString(6, txt_Login_Usuario.getText());

            //Validação dos Campos Obrigaatórios;
            if ((txt_Id_Usuario.getText().isEmpty()) || (txt_Nome_Usuario.getText().isEmpty()) || (txt_Email_Usuario.getText().isEmpty()) || (txt_Senha_Usuario.getText().isEmpty()) || (txt_Login_Usuario.getText().isEmpty())) {
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
                    txt_Login_Usuario.setText(null);
                    comboBox_TipoDePerfil.setSelectedItem(null);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Método público para consultar usuário
    public void consultar(JTextField txt_Id_Usuario, JTextField txt_Nome_Usuario, JTextField txt_Email_Usuario,
            JTextField txt_Senha_Usuario, JComboBox<String> comboBox_TipoDePerfil, JTextField txt_Login_Usuario) {
        // ... código do método consultar

        String sql = "select * from tb_usuario where id=?";
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txt_Id_Usuario.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                txt_Nome_Usuario.setText(rs.getString(2));
                txt_Email_Usuario.setText(rs.getString(3));
                txt_Senha_Usuario.setText(rs.getString(4));
                txt_Login_Usuario.setText(rs.getString(5));
                comboBox_TipoDePerfil.setSelectedItem(rs.getString(6));
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não Cadastrado!");
                //A linha abaixo limpam os campos;
                txt_Nome_Usuario.setText(null);
                txt_Email_Usuario.setText(null);
                txt_Senha_Usuario.setText(null);
                txt_Login_Usuario.setText(null);
                comboBox_TipoDePerfil.setSelectedItem(null);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Método público para alterar usuário
    public void alterar(JTextField txt_Id_Usuario, JTextField txt_Nome_Usuario, JTextField txt_Email_Usuario,
            JTextField txt_Senha_Usuario, JComboBox<String> comboBox_TipoDePerfil, JTextField txt_Login_Usuario) {
        // ... código do método alterar
        String sql = "update tb_usuario set nome=?, email=?, senha=?, perfil=?, login=? where id=?";
        //
        try {
            pst = conexao.prepareStatement(sql);
            pst.setString(1, txt_Nome_Usuario.getText());
            pst.setString(2, txt_Email_Usuario.getText());
            pst.setString(3, txt_Senha_Usuario.getText());
            pst.setString(4, comboBox_TipoDePerfil.getSelectedItem().toString());
            pst.setString(5, txt_Login_Usuario.getText());
            pst.setString(6, txt_Id_Usuario.getText());
            if ((txt_Id_Usuario.getText().isEmpty()) || (txt_Nome_Usuario.getText().isEmpty()) || (txt_Email_Usuario.getText().isEmpty()) || (txt_Senha_Usuario.getText().isEmpty()) || (txt_Login_Usuario.getText().isEmpty())) {
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
                    txt_Login_Usuario.setText(null);
                    comboBox_TipoDePerfil.setSelectedItem(null);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Método público para deletar usuário
    public void deletar(JTextField txt_Id_Usuario) {
        // ... código do método deletar
        int confirma = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover este usuário?", "Atenção", JOptionPane.YES_NO_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {
            String sql = "delete from tb_usuario where id=?";
            try {
                pst = conexao.prepareStatement(sql);
                pst.setString(1, txt_Id_Usuario.getText());
                int apagado = pst.executeUpdate();
                if (apagado > 0) {
                    JOptionPane.showMessageDialog(null, "Usuário deletado com Sucesso!");
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

}
