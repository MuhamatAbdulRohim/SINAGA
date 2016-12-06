
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Danu
 */
public class MCektanaman {
    
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
    
    public String saran(String Cuaca, String Suhu, String tanah){
        String saran="";
        int suhu=Integer.valueOf(Suhu);
        if (Cuaca.equalsIgnoreCase("mendung") && (suhu<=20 && suhu>=10) && tanah.equalsIgnoreCase("lembab")) {
            saran="kondisi 1";
        }
        if (Cuaca.equalsIgnoreCase("mendung") && (suhu<=20 && suhu>=10) && tanah.equalsIgnoreCase("kering")) {
            saran="kondisi 2";
        }
        if (Cuaca.equalsIgnoreCase("mendung") && (suhu<=30 && suhu>=21) && tanah.equalsIgnoreCase("lembab")) {
            saran="kondisi 3";
        }
        if (Cuaca.equalsIgnoreCase("mendung") && (suhu<=30 && suhu>=21) && tanah.equalsIgnoreCase("kering")) {
            saran="kondisi 4";
        }
         if (Cuaca.equalsIgnoreCase("mendung") && (suhu<=40 && suhu>=31) && tanah.equalsIgnoreCase("lembab")) {
            saran="kondisi 5";
        }
        if (Cuaca.equalsIgnoreCase("mendung") && (suhu<=40 && suhu>=31) && tanah.equalsIgnoreCase("kering")) {
            saran="kondisi 6";
        }
        
        
        
        
        if (Cuaca.equalsIgnoreCase("kering") && (suhu<=20 && suhu>=10) && tanah.equalsIgnoreCase("lembab")) {
            saran="kondisi 7";
        }
        if (Cuaca.equalsIgnoreCase("kering") && (suhu<=20 && suhu>=10) && tanah.equalsIgnoreCase("kering")) {
            saran="kondisi 8";
        }
        if (Cuaca.equalsIgnoreCase("kering") && (suhu<=30 && suhu>=21) && tanah.equalsIgnoreCase("lembab")) {
            saran="kondisi 9";
        }
        if (Cuaca.equalsIgnoreCase("kering") && (suhu<=30 && suhu>=21) && tanah.equalsIgnoreCase("kering")) {
            saran="kondisi 10";
        }
         if (Cuaca.equalsIgnoreCase("kering") && (suhu<=40 && suhu>=31) && tanah.equalsIgnoreCase("lembab")) {
            saran="kondisi 11";
        }
        if (Cuaca.equalsIgnoreCase("kering") && (suhu<=40 && suhu>=31) && tanah.equalsIgnoreCase("kering")) {
            saran="kondisi 12";
        }
        
        
        
        
        if (Cuaca.equalsIgnoreCase("hujan") && (suhu<=20 && suhu>=10) && tanah.equalsIgnoreCase("lembab")) {
            saran="kondisi 13";
        }
        if (Cuaca.equalsIgnoreCase("hujan") && (suhu<=20 && suhu>=10) && tanah.equalsIgnoreCase("kering")) {
            saran="kondisi 14";
        }
        if (Cuaca.equalsIgnoreCase("hujan") && (suhu<=30 && suhu>=21) && tanah.equalsIgnoreCase("lembab")) {
            saran="kondisi 15";
        }
        if (Cuaca.equalsIgnoreCase("hujan") && (suhu<=30 && suhu>=21) && tanah.equalsIgnoreCase("kering")) {
            saran="kondisi 16";
        }
         if (Cuaca.equalsIgnoreCase("hujan") && (suhu<=40 && suhu>=31) && tanah.equalsIgnoreCase("lembab")) {
            saran="kondisi 17";
        }
        if (Cuaca.equalsIgnoreCase("hujan") && (suhu<=40 && suhu>=31) && tanah.equalsIgnoreCase("kering")) {
            saran="kondisi 18";
        }
        
        return saran;
    }
    
    public String getPenangananbusuk(String jenis, String jml){
        int jumlah=Integer.valueOf(jml);
        int perhitungan= 2*12;
        String penanganan="-teknis\n Potong\n\n-kimia\nberikan pestisida sebanyak "+perhitungan+"per tangki";
        return penanganan;
    }
    
    public String getPenangananhama(String jenis, String jml){
        int jumlah=Integer.valueOf(jml);
        int perhitungan= 2*12;
        String penanganan="-teknis\n Potong\n\n-kimia\nberikan pestisida sebanyak "+perhitungan+"per tangki";
        return penanganan;
    }
    
    public void update(String nama, String jumlah) throws SQLException{
        connection = new koneksi();
        String jumlahAwal = "Select Jumlah_Tanaman from kebun where Nama = '"+nama+"';";
        ResultSet rs = connection.getResultStatement(jumlahAwal);
        rs.next();
        int jmlahAwal = Integer.valueOf(rs.getString(1));
        int jumlahAkhir = jmlahAwal - Integer.valueOf(jumlah);
        String query="update kebun set Jumlah_Tanaman="+jumlahAkhir+" where Nama = '"+nama+"';";
        connection.executeQuery(query);
        connection.closeKoneksi();
    } 
    
    public String [] getData(String namaKebun) throws SQLException{
        connection = new koneksi();
        String data [] = new String [2];
        String query = "Select datediff(current_date(), Tanggal_Tanam) from kebun where Nama = '"+namaKebun+"';";
        ResultSet rs = connection.getResultStatement(query);
        rs.next();
        data [0] = rs.getString(1);
        data [1] = String.valueOf(Integer.valueOf(rs.getString(1))*2);
        connection.closeKoneksi();
        return data;
    }
}
