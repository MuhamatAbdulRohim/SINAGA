
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Danu
 */
public class MPanen {
    
    private koneksi connection;
    
    public String[] getAnalisis() throws SQLException, ParseException {
        connection= new koneksi();
        String hasil[];
        String query = "select Nama from kebun;";
        ResultSet rs = connection.getResultStatement(query);
        rs.last();
        hasil=new String[rs.getRow()];
        rs.beforeFirst();
        int a=0;
        while(rs.next()){
            hasil[a]=rs.getString(1);
            a++;
        }
        connection.closeKoneksi();
        
        return hasil;
    }
    
    public String getJenis(String namakebun) throws SQLException{
        connection= new koneksi();
        String jenisbuah = "";
        String query="select Jenis_Buah_Naga from kebun where Nama= '"+namakebun+"';";
        ResultSet rs = connection.getResultStatement(query);
        rs.next();
        jenisbuah=rs.getString(1);
        return jenisbuah;    
    }
    
    public void savepanen(String jenisBuah, String stock, String harga, String grade) throws SQLException{
        connection= new koneksi();
        String query="insert into tabel_panen values (null,'"+jenisBuah+"',"+stock+",0,"+harga+",'"+grade+"');";
        connection.executeQuery(query);
        connection.closeKoneksi();
    }
    public void savepanenkebun(String namakebun, String stock) throws SQLException{
        connection= new koneksi();
        String query="update kebun set Hasil_Panen="+stock+" where Nama='"+namakebun+"';";
        connection.executeQuery(query);
        connection.closeKoneksi();
    }
    
    public void updateharga(String grade, String harga, String stock, String Jenis) throws SQLException{
        connection= new koneksi();
        String query1="select Stock from tabel_panen where Jenis_Buah='"+Jenis+"' and Grade='"+grade+"';";
        ResultSet rs= connection.getResultStatement(query1);
        rs.next();
        int setok=Integer.valueOf(rs.getString(1));
        int stockbaru=setok+ Integer.valueOf(stock);
        String query="update tabel_panen set Harga="+harga+",Stock="+stockbaru+" where Jenis_Buah='"+Jenis+"' and Grade='"+grade+"';";
        connection.executeQuery(query);
        connection.closeKoneksi();
    }
}
