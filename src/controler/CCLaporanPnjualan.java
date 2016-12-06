package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.MLaporan;
import model.MPenjualan;
import view.VLaporanPnjualan;

/**
 *
 * @author Danu
 */
public class CCLaporanPnjualan {

    VLaporanPnjualan lapjual;
    MLaporan model;
    
    private static CCLaporanPnjualan instance;

    public static CCLaporanPnjualan getInstance(VLaporanPnjualan lapjual, MLaporan model) throws SQLException, ParseException {
        if (instance == null) {
            instance = new CCLaporanPnjualan(lapjual, model);
        }
        return instance;
    }

    public static CCLaporanPnjualan getInstance() {
        return instance;
    }

    public static void setInstance() {
        instance = null;
    }

    public CCLaporanPnjualan(VLaporanPnjualan lapjual, MLaporan model) throws SQLException, ParseException {
        this.lapjual = lapjual;
        this.model = model;
        this.lapjual.setVisible(true);
        this.lapjual.back_action(new back());
        this.lapjual.cekAddListener(new cek());
    }

    private class back implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            CHome.getInstance().home.setVisible(true);
            lapjual.dispose();
        }
    }
    
    private class cek implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                lapjual.setData(model.getData(lapjual.getData()));
            } catch (ParseException | SQLException ex) {
                Logger.getLogger(CCLaporanPnjualan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
