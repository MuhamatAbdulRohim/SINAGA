package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Danu
 */
public class koneksi {

    private final Connection con;
    private final Statement stm;
    private final PreparedStatement pstm = null;

    public koneksi() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/SINAGA";
        con = DriverManager.getConnection(url, "root", "772502");
        stm = con.createStatement();
    }

    public void executeQuery(String a) throws SQLException {
        stm.executeUpdate(a);
    }

    public ResultSet getResultStatement(String a) throws SQLException {
        return stm.executeQuery(a);
    }
    
    public ResultSet getResultPreparedStatement(PreparedStatement a) throws SQLException {
        return a.executeQuery();
    }

    public void closeKoneksi() throws SQLException {
        con.close();
    }
    
    public PreparedStatement executePreparedStatement(String a) throws SQLException{
       return con.prepareStatement(a);
    }
    
    public Connection getKoneksi(){
        return this.con;
    }
}
