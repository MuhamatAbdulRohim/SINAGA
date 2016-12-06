/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.MCektanaman;
import view.VCTanaman1;
import view.VCTanaman2;

/**
 *
 * @author Danu
 */
public class CCTanaman1 {

    VCTanaman1 CTanaman;
    MCektanaman model;
    private static CCTanaman1 instance;

    public static CCTanaman1 getInstance(VCTanaman1 home, MCektanaman model) throws SQLException {
        if (instance == null) {
            instance = new CCTanaman1(home, model);
        }
        return instance;
    }

    public static CCTanaman1 getInstance() {
        return instance;
    }

    public static void setInstance() {
        instance = null;
    }
//--------------------------------------------------------------------------------------

    public CCTanaman1(VCTanaman1 CTanaman, MCektanaman model) throws SQLException {
        this.CTanaman = CTanaman;
        this.model = model;
        this.CTanaman.setVisible(true);
        this.CTanaman.back_action(new back());
        this.CTanaman.cek_action(new cek());
        this.CTanaman.tableaction(new tableklik());
        this.CTanaman.setTablemodel(model.view(this.CTanaman.getTablemodel()));

    }

    private class back implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            CHome.getInstance().home.setVisible(true);
            CTanaman.dispose();
        }
    }

    private class cek implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                CCTanaman2.setInstance();
                CCTanaman2.getInstance(new VCTanaman2(), new MCektanaman(), CTanaman.getNamaKebun());
                CTanaman.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(CCTanaman1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class tableklik implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent me) {
            CTanaman.setcekEnable(true);
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
