/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author Danu
 */
public class MLaporan {
    
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
    
    public String [] getData(String param []) throws SQLException{
        String data [] = new String [4];
        connection = new koneksi();
        String query = "select Stock, Terjual, Harga from tabel_panen where Jenis_Buah = '"+param [0]+"' and Grade = '"+param [1]+"';";
        ResultSet rs = connection.getResultStatement(query);
        rs.next();
        data [0] = rs.getString(1);
        data [1] = rs.getString(2);
        data [2] = String.valueOf(Integer.valueOf(rs.getString(1))-Integer.valueOf(rs.getString(2)));
        data [3] = String.valueOf(Integer.valueOf(rs.getString(2))*Integer.valueOf(rs.getString(3)));
        return data;
    }
    
    
    
}
