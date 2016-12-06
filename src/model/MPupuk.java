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
public class MPupuk {
    
    private koneksi connection;
    
    public DefaultTableModel view(TableModel model) throws SQLException{
        DefaultTableModel table=(DefaultTableModel) model;
        table.setRowCount(0);
        connection= new koneksi();
        String query="select Nama, Lokasi, Jumlah_Tanaman, Tanggal_Panen from kebun";
        
        ResultSet rs = connection.getResultStatement(query);
        int nomor =0;
        while(rs.next()){
            nomor++;
            String rows[]= new String[5];
            rows[0]= String.valueOf(nomor);
            for (int i = 1; i < rows.length; i++) {
                rows[i]=rs.getString(i);
            }
            table.addRow(rows);
        }
        return table;
    }
    
    public String[] getAnalisis(String namakebun) throws SQLException, ParseException {
        String data1[]=new String[10];
        String query="select ID_Kebun, Jumlah_Tanaman, Panjang, Lebar from kebun where Nama='"+namakebun+"';";
        connection= new koneksi();
        ResultSet rs = connection.getResultStatement(query);
        rs.next();
        data1[4]=rs.getString(2);
        data1[5]=String.valueOf(Integer.valueOf(rs.getString(3))*Integer.valueOf(rs.getString(4)));
        data1[6]=String.valueOf(Integer.valueOf(rs.getString(2))*10);
        String query2="select Pemupukan_1, Pemupukan_2, Pemupukan_3, Pemupukan_4 from jadwal_pemupukan where id_kebun="+rs.getString(1)+";";
        ResultSet rs2 = connection.getResultStatement(query2);
        rs2.next();
        data1[0]=rs2.getString(1);
        data1[1]=rs2.getString(2);
        data1[2]=rs2.getString(3);
        data1[3]=rs2.getString(4);
        connection.closeKoneksi();
        
        return data1;
    }
    
}
