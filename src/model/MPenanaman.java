package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Danu
 */
public class MPenanaman {

    private koneksi connection;
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    private void save(String dataKebun[]) throws SQLException {
        String query = "insert into kebun values(null,'" + dataKebun[0] + "','" + dataKebun[1] + "'," + dataKebun[2]
                + "," + dataKebun[3] + "," + dataKebun[4] + "," + dataKebun[5] + ",'" + dataKebun[6] + "','" + dataKebun[7]
                + "',null,'" + dataKebun[8] + "');";
        connection = new koneksi();
        connection.executeQuery(query);
        connection.closeKoneksi();
    }
    
    private void saveJadwal(String nama, String dataJadwal[]) throws SQLException {
        String query2 = "insert into jadwal_pemupukan values(null," + getIDKebun(nama) + ",'" + dataJadwal[0] + "','" + dataJadwal[1]
                + "','" + dataJadwal[2] + "','" + dataJadwal[3] + "');";
        System.out.println(query2);
        connection = new koneksi();
        connection.executeQuery(query2);
        connection.closeKoneksi();
    }

    public String getIDKebun(String Nama) throws SQLException {
        connection = new koneksi();
        String query = "select ID_Kebun from kebun where Nama = '" + Nama + "';";
        ResultSet rs = connection.getResultStatement(query);
        if (rs.next()) {
            return rs.getString(1);
        } else {
            return "";
        }
    }

    private String getJadwalPupuk(String Tanggal) throws ParseException {
        Date tanggalTanam = dateFormat.parse(Tanggal);
        Calendar c = Calendar.getInstance();
        c.setTime(tanggalTanam);
        c.add(Calendar.DATE, 90);
        return dateFormat.format(c.getTime());
    }

        public String[] getAnalisis(String data[]) throws SQLException, ParseException {
        String hasil[] = new String[9];
        String dataKebun[] = new String[10];
        String Jadwal[] = new String[4];
        
        hasil[0] = Jadwal[0] = getJadwalPupuk(data[4]);
        hasil[1] = Jadwal[1] = getJadwalPupuk(Jadwal[0]);
        hasil[2] = Jadwal[2] = getJadwalPupuk(Jadwal[1]);
        hasil[3] = Jadwal[3] = getJadwalPupuk(Jadwal[2]);

        double Panjang = Double.valueOf(data[1]);
        double Lebar = Double.valueOf(data[2]);

        double jumlahTiang = (Math.ceil(Panjang / 3) + 1) * (Math.ceil(Lebar / 3) + 1);
        int jumlahBibit = (int) (jumlahTiang * 4);
        int jumlahPupuk = (int) (jumlahTiang * 10);
        int jumLahLampu = (int) (jumlahTiang);

        hasil[4] = String.valueOf(jumlahBibit);
        hasil[5] = String.valueOf(jumlahTiang);
        hasil[6] = String.valueOf(jumLahLampu);
        hasil[7] = String.valueOf(jumlahPupuk);

        Date tanggalTanam = dateFormat.parse(data [4]);
        Calendar c = Calendar.getInstance();
        c.setTime(tanggalTanam);
        c.add(Calendar.YEAR, 1);

        hasil[8] = dateFormat.format(c.getTime());
        
        dataKebun [0] = data [0];
        dataKebun [1] = data [3];
        dataKebun [2] = data [1];
        dataKebun [3] = data [2];
        dataKebun [4] = hasil [4]; 
        dataKebun [5] = hasil [6];
        dataKebun [6] = data [4];
        dataKebun [7] = hasil [8];
        dataKebun [8] = data [5];
//        dataKebun [9] = data [6];
        
        save(dataKebun);
        saveJadwal(data [0], Jadwal);
        return hasil;
    }
}
