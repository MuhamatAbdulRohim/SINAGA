package model;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Danu
 */
public class MLogin {

    private koneksi connection;

    public boolean valid(String[] account) throws SQLException {
        boolean valid = false;
        connection = new koneksi();
        String sql = "select Username from User where Username = '"+account [0]+"' and Password = '"+account[1]+"';";
        ResultSet rs = connection.getResultStatement(sql);
        valid = rs.next();
        return valid;
    }
}
