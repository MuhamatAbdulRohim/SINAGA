package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.MPenanaman;
import view.VPenanaman1;
import view.VPenanaman2;

/**
 *
 * @author Danu
 */
public class CPenanaman1 {

    VPenanaman1 penanaman1;
    private static CPenanaman1 instance;

    public static CPenanaman1 getInstance(VPenanaman1 penenaman1) {
        if (instance == null) {
            instance = new CPenanaman1(penenaman1);
        }
        return instance;
    }

    public static CPenanaman1 getInstance() {
        return instance;
    }

    public static void setInstance() {
        instance = null;
    }

    public CPenanaman1(VPenanaman1 penanaman1) {
        this.penanaman1 = penanaman1;
        this.penanaman1.setVisible(true);
        this.penanaman1.simpan_action(new simpan());
        this.penanaman1.back_action(new back());
    }

    private boolean isValid(String[] data) {
        boolean valid = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i].isEmpty()) {
                valid = false;
                break;
            } else {
                valid = true;
            }
        }
        return valid;
    }

    private class simpan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (isValid(penanaman1.getData())) {
                try {
                    int panjang = Integer.valueOf(penanaman1.getData()[1]);
                    int lebar = Integer.valueOf(penanaman1.getData()[2]);
                    Cpenanaman2.setInstance();
                    Cpenanaman2.getInstance(new VPenanaman2(), new MPenanaman(), penanaman1.getData());
                    penanaman1.dispose();
                } catch (NumberFormatException | SQLException e) {
                    Logger.getLogger(CPenanaman1.class.getName()).log(Level.SEVERE, null, e);
                } catch (ParseException ex) {
                    Logger.getLogger(CPenanaman1.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                penanaman1.showMessage("Pastikan Semua Data Terisi");
            }
        }
    }

    private class back implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            CHome.getInstance().home.setVisible(true);
            penanaman1.dispose();
        }
    }

}
