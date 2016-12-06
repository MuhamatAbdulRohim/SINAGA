/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.MPanen;
import view.VPanen;

/**
 *
 * @author Danu
 */
public class CPanen {
    
    VPanen panen;
    MPanen model;
    private static CPanen instance;

    public static CPanen getInstance(VPanen panen, MPanen model) throws SQLException, ParseException {
        if (instance == null) {
            instance = new CPanen(panen, model);
        }
        return instance;
    }

    public static CPanen getInstance() {
        return instance;
    }

    public static void setInstance() {
        instance = null;
    }
//    -------------------------------------------------------------------
    public CPanen(VPanen panen, MPanen model) throws SQLException, ParseException{
        this.panen=panen;
        this.model = model;
        this.panen.setVisible(true);
        this.panen.back_action(new back());
        this.panen.lihatA(new lA());
        this.panen.lihatB(new lB());
        this.panen.lihatC(new lC());
        this.panen.updateA(new uA());
        this.panen.updateB(new uB());
        this.panen.updateC(new uC());
        this.panen.atkebunA(model.getAnalisis());
        this.panen.atkebunB(model.getAnalisis());
        this.panen.atkebunC(model.getAnalisis());
        
    }
    
    private class back implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            CHome.getInstance().home.setVisible(true);
            panen.dispose();             
        }
    }
    
    private class lA implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                model.savepanen(model.getJenis(panen.getkebunA()), panen.banyakA(), panen.hargaA(), "Grade A");
                model.savepanenkebun(panen.getkebunA(),panen.banyakA());
                int harga= Integer.valueOf(panen.banyakA())*Integer.valueOf(panen.hargaA());
                panen.hasilA(String.valueOf(harga));
            } catch (SQLException ex) {
                Logger.getLogger(CPanen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private class lB implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                model.savepanen(model.getJenis(panen.getkebunB()), panen.banyakB(), panen.hargaB(), "Grade B");
                model.savepanenkebun(panen.getkebunB(),panen.banyakB());
                int harga= Integer.valueOf(panen.banyakB())*Integer.valueOf(panen.hargaB());
                panen.hasilB(String.valueOf(harga));
            } catch (SQLException ex) {
                Logger.getLogger(CPanen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private class lC implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                model.savepanen(model.getJenis(panen.getkebunC()), panen.banyakC(), panen.hargaC(), "Grade C");
                model.savepanenkebun(panen.getkebunC(),panen.banyakC());
                int harga= Integer.valueOf(panen.banyakC())*Integer.valueOf(panen.hargaC());
                panen.hasilC(String.valueOf(harga));
            } catch (SQLException ex) {
                Logger.getLogger(CPanen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private class uA implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (panen.getupdatetextA().equalsIgnoreCase("update")) {                
                JOptionPane.showMessageDialog(panen, "anda akan mengupdate harga dan stok");
                panen.sethargadanstokA();
                panen.sethasilenableA(false);
                panen.updatesetTextA("simpan");
            }
            else{
                try {
                    model.updateharga("Grade A", panen.hargaA(), panen.banyakA(), model.getJenis(panen.getkebunA()));
                    JOptionPane.showMessageDialog(panen, "data berhasil di update");
                    panen.kembaliA();
                    panen.sethasilenableA(true);
                    panen.updatesetTextA("update");
                    
                } catch (SQLException ex) {
                    Logger.getLogger(CPanen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }    
    }
    
    private class uB implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (panen.getupdatetextB().equalsIgnoreCase("update")) {                
                JOptionPane.showMessageDialog(panen, "anda akan mengupdate harga dan stok");
                panen.sethargadanstokB();
                panen.sethasilenableB(false);
                panen.updatesetTextB("simpan");
            }
            else{
                try {
                    model.updateharga("Grade B", panen.hargaB(), panen.banyakB(), model.getJenis(panen.getkebunB()));
                    JOptionPane.showMessageDialog(panen, "data berhasil di update");
                    panen.kembaliB();
                    panen.sethasilenableB(true);
                    panen.updatesetTextB("update");
                    
                } catch (SQLException ex) {
                    Logger.getLogger(CPanen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }    
    }
    
    private class uC implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            if (panen.getupdatetextC().equalsIgnoreCase("update")) {                
                JOptionPane.showMessageDialog(panen, "anda akan mengupdate harga dan stok");
                panen.sethargadanstokC();
                panen.sethasilenableC(false);
                panen.updatesetTextC("simpan");
            }
            else{
                try {
                    model.updateharga("Grade C", panen.hargaC(), panen.banyakC(), model.getJenis(panen.getkebunC()));
                    JOptionPane.showMessageDialog(panen, "data berhasil di update");
                    panen.kembaliC();
                    panen.sethasilenableC(true);
                    panen.updatesetTextC("update");
                    
                } catch (SQLException ex) {
                    Logger.getLogger(CPanen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }    
    }
}
