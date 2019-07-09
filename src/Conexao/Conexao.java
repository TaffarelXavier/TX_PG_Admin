/**
 * Esta classe foi criada em 28/02/2018
 * pelo Grupo 5 - LC IFTO
 */
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author Taffrel Xavier <taffarel_deus@hotmail.com>
 */
public class Conexao {

    private static Connection conn;

    /**
     *
     * @return @throws SQLException
     */
    public static Connection abrir() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            String url = "jdbc:postgresql://localhost:5432/banco_ifto";
            Properties props = new Properties();
            props.setProperty("user", "postgres");
            props.setProperty("password", "chkdsk");
            conn = DriverManager.getConnection(url, props);
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            throw new SQLException();
        }
    }

    /**
     *
     * @throws SQLException
     */
    public static void fecharConexao() throws SQLException {
        Conexao.conn.close();
    }
    
    public static void main(String[] args){

}

}
