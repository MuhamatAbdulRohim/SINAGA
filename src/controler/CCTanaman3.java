package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.MCektanaman;
import view.VCTanaman3;

/**
 *
 * @author Danu
 */
public class CCTanaman3 {

    VCTanaman3 CTanaman3;
    MCektanaman model;
    private static CCTanaman3 instance;
    String NamaKebun;

    public static CCTanaman3 getInstance(VCTanaman3 Ctanaman3, MCektanaman model, String NamaKebun) {
        if (instance == null) {
            instance = new CCTanaman3(Ctanaman3, model, NamaKebun);
        }
        return instance;
    }

    public static CCTanaman3 getInstance() {
        return instance;
    }

    public static void setInstance() {
        instance = null;
    }
//-------------------------------------------------------------------------
    public CCTanaman3(VCTanaman3 CTanaman, MCektanaman model, String NamaKebun) {
        this.CTanaman3 = CTanaman;
        this.NamaKebun = NamaKebun;
        this.model = model;
        this.CTanaman3.setVisible(true);
        this.CTanaman3.lihatbusuk(new lbusuk());
        this.CTanaman3.lihathama(new lhama());
    }
    
    private class lbusuk implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            CTanaman3.setpenangananbusuk(model.getPenangananbusuk(CTanaman3.getjenisbusuk(), CTanaman3.jumlahtanamanbusuk()));
            
        }
    }
    
    private class lhama implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            CTanaman3.setpenangananhama(model.getPenangananhama(CTanaman3.getjenishama(), CTanaman3.jumlahtanamanhama()));
            
        }
    }
    
    private class update implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int tanam = Integer.valueOf(CTanaman3.jumlahtanamanmati());
                model.update(NamaKebun, CTanaman3.jumlahtanamanmati());
            } catch (NumberFormatException  a){
                JOptionPane.showMessageDialog(CTanaman3, "Masukkan Angka Bukan Huruf");
            } catch (SQLException ex) {
                Logger.getLogger(CCTanaman3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
