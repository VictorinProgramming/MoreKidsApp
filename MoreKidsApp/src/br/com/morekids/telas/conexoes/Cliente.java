package br.com.morekids.telas.conexoes;


import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import net.proteanit.sql.DbUtils;

public class Cliente {

    // Configurando o banco de Dados;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    private Connection conexao;

    public Cliente(Connection conexao) {
        this.conexao = conexao;
    }

    // Adicionando Clientes;
    public void adicionar(String txt_Nome_Cliente, String txt_Fone_Cliente, String txt_Genero_Cliente) throws SQLException {
        String sql = "insert into tb_clientes (Nome_cli, Fone_cli, Genero_cli) values (?, ?, ?)";

        try {
            pst = conexao.prepareStatement(sql);

            // Validação dos campos obrigatórios
            if (txt_Nome_Cliente.isEmpty() || txt_Fone_Cliente.isEmpty() || txt_Genero_Cliente.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os Campos OBRIGATÓRIOS!");
            } else {
                pst.setString(1, txt_Nome_Cliente);
                pst.setString(2, txt_Fone_Cliente);
                pst.setString(3, txt_Genero_Cliente);

                // A linha abaixo atualiza a tabela Cliente com os dados do formulário;
                int adicionado = pst.executeUpdate();

                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Cliente Adicionado com Sucesso!");
                    // Chame o método limpar() aqui se for necessário
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            // Certifique-se de fechar os recursos (ResultSet e PreparedStatement) no bloco finally
            if (rs != null) {
                rs.close();
            }
            if (pst != null) {
                pst.close();
            }
        }
    }


    // Editando Clientes;
    public boolean alterar(String txt_Nome_Cliente, String txt_Fone_Cliente, String txt_Genero_Cliente) throws SQLException {
        String sql = "update tb_clientes set Fone_cli=?, Genero_cli=? where Nome_cli=?";

        try {
            pst = conexao.prepareStatement(sql);

            // Validação dos campos obrigatórios
            if (txt_Fone_Cliente.isEmpty() || txt_Genero_Cliente.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos OBRIGATÓRIOS!");
                return false; // Indica falha na validação
            } else {
                pst.setString(1, txt_Fone_Cliente);
                pst.setString(2, txt_Genero_Cliente);
                pst.setString(3, txt_Nome_Cliente);

                int alterado = pst.executeUpdate();

                if (alterado > 0) {
                    JOptionPane.showMessageDialog(null, "Dados do Cliente alterados com Sucesso!");
                    return true; // Indica sucesso na alteração
                } else {
                    JOptionPane.showMessageDialog(null, "Não foi possível alterar os dados do Cliente.");
                    return false; // Indica falha na alteração
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar os dados do Cliente: " + e.getMessage());
            return false; // Indica falha na alteração
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (pst != null) {
                pst.close();
            }
        }
    }
    
}
