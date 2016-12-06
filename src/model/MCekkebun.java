/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Danu
 */
public class MCekkebun {

    private koneksi connection;
    
    public DefaultTableModel view(TableModel model) throws SQLException{
        DefaultTableModel table=(DefaultTableModel) model;
        table.setRowCount(0);
        connection= new koneksi();
        String query="select Nama, Lokasi, Jumlah_Tanaman, Tanggal_Panen, Hasil_Panen from kebun";
        
        ResultSet rs = connection.getResultStatement(query);
        int nomor =0;
        while(rs.next()){
            nomor++;
            String rows[]= new String[6];
            rows[0]= String.valueOf(nomor);
            for (int i = 1; i < rows.length; i++) {
                rows[i]=rs.getString(i);
            }
            table.addRow(rows);
        }
        return table;
    }
    
}
