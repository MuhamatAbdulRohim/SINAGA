package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.MPupuk;
import view.VCekpupuk1;
/**
 *
 * @author Danu
 */
public class CCekpupuk1 {
    
    VCekpupuk1 cekpupuk1;
    MPupuk model;

    private static CCekpupuk1 instance;

    public static CCekpupuk1 getInstance(VCekpupuk1 cekpupuk, MPupuk model, String data[]) {
        if (instance == null) {
            instance = new CCekpupuk1(cekpupuk, model, data);
        }
        return instance;
    }

    public static CCekpupuk1 getInstance() {
        return instance;
    }

    public static void setInstance() {
        instance = null;
    }
//-----------------------------------------------------------------------
    public CCekpupuk1(VCekpupuk1 cekpupuk1, MPupuk model, String data[]){
        this.cekpupuk1=cekpupuk1;
        this.model = model;
        this.cekpupuk1.setVisible(true);
        this.cekpupuk1.back_action(new back());
        this.cekpupuk1.jadwal1(data[0]);
        this.cekpupuk1.jadwal2(data[1]);
        this.cekpupuk1.jadwal3(data[2]);
        this.cekpupuk1.jadwal4(data[3]);
        this.cekpupuk1.jmlbibit(data[4]);
        this.cekpupuk1.luas(data[5]);
        this.cekpupuk1.jml1(data[6]);
        
    }
    
    private class back implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            CHome.getInstance().home.setVisible(true);
            cekpupuk1.dispose();             
        }
    }
    
}
