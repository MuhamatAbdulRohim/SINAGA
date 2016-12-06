package controler;

import view.VHome;
import view.VPenanaman1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.MCektanaman;
import model.MHome;
import model.MLaporan;
import model.MPanen;
import model.MPenanaman;
import model.MPenjualan;
import model.MCekkebun;
import model.MPupuk;
import view.VCTanaman1;
import view.VPanen;
import view.VCekpupuk;
import view.VLaporanPnjualan;
import view.VCkebun;

/**
 *
 * @author Danu
 */
public class CHome {

    VHome home;
    MHome model;
    private static CHome instance;
    
    public static CHome getInstance(VHome home, MHome model){
        if (instance == null) {
            instance = new CHome(home,model);
        }
        return instance;
    }
    
    public static CHome getInstance(){
        return instance;
    }
    
    public static void setInstance(){
        instance = null;
    }

    public CHome(VHome home, MHome model) {
        this.home = home;
        this.model = model;
        this.home.setVisible(true);
        this.home.penanamanbaru_action(new penanamanbaru());
        this.home.cektanaman_action(new cektanaman());
        this.home.panen_action(new panen());
        this.home.cekpupuk_action(new cekpupuk());
        this.home.cekkebun_action(new cekkebun());
        this.home.lapjual_action(new lapjual());
    }

    private class penanamanbaru implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            CPenanaman1.setInstance();
            CPenanaman1.getInstance(new VPenanaman1());
            home.dispose();
        }

    }

    private class cektanaman implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            CCTanaman1.setInstance();
            try {
                CCTanaman1.getInstance(new VCTanaman1(), new MCektanaman());
            } catch (SQLException ex) {
                Logger.getLogger(CHome.class.getName()).log(Level.SEVERE, null, ex);
            }
            home.dispose();
        }

    }

    private class panen implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            CPanen.setInstance();
            try {
                CPanen.getInstance(new VPanen(), new MPanen());
            } catch (SQLException | ParseException ex) {
                Logger.getLogger(CHome.class.getName()).log(Level.SEVERE, null, ex);
            }
            home.dispose();
        }

    }

    private class cekpupuk implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            CCekpupuk.setInstance();
            try {
                CCekpupuk.getInstance(new VCekpupuk(), new MPupuk());
            } catch (SQLException ex) {
                Logger.getLogger(CHome.class.getName()).log(Level.SEVERE, null, ex);
            }
            home.dispose();
        }

    }
    private class cekkebun implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            CCekkebun.setInstance();
            try {
                CCekkebun.getInstance(new VCkebun(), new MCekkebun());
            } catch (SQLException ex) {
                Logger.getLogger(CHome.class.getName()).log(Level.SEVERE, null, ex);
            }
            home.dispose();
        }

    }

    private class lapjual implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            CCLaporanPnjualan.setInstance();
            try {
                CCLaporanPnjualan.getInstance(new VLaporanPnjualan(), new MLaporan());
            } catch (SQLException | ParseException ex) {
                Logger.getLogger(CHome.class.getName()).log(Level.SEVERE, null, ex);
            }
            home.dispose();
        }

    }
}
