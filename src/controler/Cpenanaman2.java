package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import model.MPenanaman;
import view.VPenanaman2;

/**
 *
 * @author Danu
 */
public class Cpenanaman2 {

    VPenanaman2 penanaman2;
    MPenanaman model;
    private static Cpenanaman2 instance;

    public static Cpenanaman2 getInstance(VPenanaman2 penenaman2, MPenanaman model, String data[]) throws SQLException, ParseException {
        if (instance == null) {
            instance = new Cpenanaman2(penenaman2, model, data);
        }
        return instance;
    }

    public static Cpenanaman2 getInstance() {
        return instance;
    }

    public static void setInstance() {
        instance = null;
    }

    public Cpenanaman2(VPenanaman2 penanaman2, MPenanaman model, String Data []) throws SQLException, ParseException {
        this.penanaman2 = penanaman2;
        this.model = model;
        this.penanaman2.setVisible(true);
        this.penanaman2.back_action(new back());
        this.penanaman2.setData(model.getAnalisis(Data));
    }

    private class back implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            CHome.getInstance().home.setVisible(true);
            penanaman2.dispose();
        }
    }
}
