package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.MCektanaman;
import view.VCTanaman2;
import view.VCTanaman3;

/**
 *
 * @author Danu
 */
public class CCTanaman2 {

    VCTanaman2 CTanaman2;
    MCektanaman model;
    private static CCTanaman2 instance;
    String NamaKebun;

    public static CCTanaman2 getInstance(VCTanaman2 Ctanaman2, MCektanaman model, String NamaKebun) throws SQLException {
        if (instance == null) {
            instance = new CCTanaman2(Ctanaman2, model, NamaKebun);
        }
        return instance;
    }

    public static CCTanaman2 getInstance() {
        return instance;
    }

    public static void setInstance() {
        instance = null;
    }

    public CCTanaman2(VCTanaman2 CTanaman, MCektanaman model, String namaKebun) throws SQLException {
        this.CTanaman2 = CTanaman;
        this.NamaKebun = namaKebun;
        this.model = model;
        this.CTanaman2.setData(model.getData(namaKebun));
        this.CTanaman2.setVisible(true);
        this.CTanaman2.back_action(new back());
        this.CTanaman2.tdksehat_action(new tdksehat());
        this.CTanaman2.cek(new cek());

    }

    private class back implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            CCTanaman1.getInstance().CTanaman.setVisible(true);
            CTanaman2.dispose();
        }
    }

    private class tdksehat implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            CCTanaman3.setInstance();
            CCTanaman3.getInstance(new VCTanaman3(), new MCektanaman(), NamaKebun);
            CTanaman2.dispose();
        }
    }

    private class cek implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                int suhu = Integer.valueOf(CTanaman2.getSuhu());
                CTanaman2.setsaran(model.saran(CTanaman2.getCuaca(), CTanaman2.getSuhu(), CTanaman2.getTanah()));
            } catch (Exception e){
                JOptionPane.showMessageDialog(CTanaman2, "Masukkan Angka Bukan Huruf");
            }
        }
    }

}
