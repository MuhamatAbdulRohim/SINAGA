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
import model.MCekkebun;
import view.VCkebun;
/**
 *
 * @author Danu
 */
public class CCekkebun {
    
    VCkebun cekkebun;
    MCekkebun model;
    private static CCekkebun instance;
    
    public static CCekkebun getInstance(VCkebun home, MCekkebun model) throws SQLException {
        if (instance == null) {
            instance = new CCekkebun(home, model);
        }
        return instance;
    }

    public static CCekkebun getInstance() {
        return instance;
    }

    public static void setInstance() {
        instance = null;
    }
//    -------------------------------------------------------------------
    public CCekkebun(VCkebun CCekkebun, MCekkebun model) throws SQLException {
        this.cekkebun = CCekkebun;
        this.model = model;
        this.cekkebun.setVisible(true);
        this.cekkebun.back_action(new back());
        this.cekkebun.tableaction(new tableklik());
        this.cekkebun.setTablemodel(model.view(this.cekkebun.getTablemodel()));        
    }

   
    private class back implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            CHome.getInstance().home.setVisible(true);
            cekkebun.dispose();
        }
    }
        
    private class tableklik implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent me) {
            cekkebun.setcekEnable(true);
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
