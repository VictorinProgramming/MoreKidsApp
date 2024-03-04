
package br.com.morekids.dal;

import java.sql.Connection;
import java.sql.SQLException;


public interface Conexao {
    public Connection conector() throws SQLException;
    
}

