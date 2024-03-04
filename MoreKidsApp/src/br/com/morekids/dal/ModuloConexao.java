package br.com.morekids.dal;


import java.sql.Connection;
import java.sql.DriverManager;


public class ModuloConexao {

    public ModuloConexao() {
    }

    //Método responsável por estabelecer a conexão com o banco de dados;
    public static Connection conector() {
        java.sql.Connection conexao = null;
        // Vamos chamar o Driver que importamos para bibliotecas;
        String driver = "com.mysql.cj.jdbc.Driver";
        // Armzazenando informações referente ao banco de dados;
        String url = "jdbc:mysql://localhost:3306/usermorekids";
        String user = "root";
        String password = "@novaSenha1";
        // Estabelecendo a conexão com o banco de dados;
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            return null;
        }
    }

}
