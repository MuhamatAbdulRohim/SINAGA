package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.MPupuk;
import view.VCekpupuk;
import view.VCekpupuk1;

/**
 *
 * @author Danu
 */
public class CCekpupuk {

    VCekpupuk cekpupuk;
    MPupuk model;

    private static CCekpupuk instance;

    public static CCekpupuk getInstance(VCekpupuk cekpupuk, MPupuk model) throws SQLException {
        if (instance == null) {
            instance = new CCekpupuk(cekpupuk, model);
        }
        return instance;
    }

    public static CCekpupuk getInstance() {
        return instance;
    }

    public static void setInstance() {
        instance = null;
    }
//-------------------------------------------------------------------------------------
    public CCekpupuk(VCekpupuk cekpupuk, MPupuk model) throws SQLException {
        this.cekpupuk = cekpupuk;
        this.model = model;
        this.cekpupuk.setVisible(true);
        this.cekpupuk.back_action(new back());
        this.cekpupuk.cek_action(new cek());
        this.cekpupuk.tableaction(new tableklik());
        this.cekpupuk.setTablemodel(model.view(this.cekpupuk.getTablemodel()));
    }

    private class back implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            CHome.getInstance().home.setVisible(true);
            cekpupuk.dispose();
        }
    }

    private class cek implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            CCekpupuk1.setInstance();
            String data[];
            try {
                data = model.getAnalisis(cekpupuk.getvalueat(1));
                CCekpupuk1.getInstance(new VCekpupuk1(), new MPupuk(),data);
                cekpupuk.dispose();
            } catch (SQLException | ParseException ex) {
                Logger.getLogger(CCekpupuk.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    private class tableklik implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent me) {
            cekpupuk.setcekEnable(true);
        }
        @Override
        public void mousePressed(MouseEvent me) {            
        }
        @Override
        public void mouseReleased(MouseEvent me) {            
        }
        @Override
        public void mouseEntered(MouseEvent me) {            
        }
        @Override
        public void mouseExited(MouseEvent me) {            
        }        
    }
}
