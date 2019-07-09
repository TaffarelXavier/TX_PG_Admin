/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Conexao.Conexao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Taffarel <taffarel_deus@hotmail.com>
 */
public class PSqlDemo {

    /**
     *
     * @param sql
     * @return
     */
    public static int executarQuery(String sql) {
        try {
            Statement stmt = Conexao.abrir().createStatement();
            return stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(PSqlDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public static int executarQuer() {
        try {
            Statement stmt = Conexao.abrir().createStatement();

            ResultSet rs = stmt.executeQuery("SELECT getf1(ROW(45,25,'this is a test'));");

            System.out.println(rs.next());

            System.out.println(rs.getString("getf1"));

        } catch (SQLException ex) {
            Logger.getLogger(PSqlDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public static void main(String[] args) {
        executarQuer();
        /*
        PreparedStatement stm = Conexao.abrir().prepareStatement("show server_VERSION");
        ResultSet rs = stm.executeQuery();
        if (rs.next()) {
            System.out.println(rs.getString(1));
        }
        */
    }
}
