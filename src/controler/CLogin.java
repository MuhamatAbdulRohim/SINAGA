
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.MHome;
import model.MLogin;
import view.VLogin;
import view.VHome;

/**
 *
 * @author rohim
 */
public class CLogin {
    
    private final VLogin view;
    private final MLogin model;
    private static CLogin instance;
    
    public static CLogin getInstance(VLogin view, MLogin model){
        if (instance == null) {
            instance = new CLogin(view,model);
        }
        return instance;
    }
    
    public static CLogin getInstance(){
        return instance;
    }
    
    public static void setInstance(){
        instance = null;
    }
    
    public CLogin(VLogin view, MLogin model){
        this.view = view;
        this.model = model;
        this.view.setVisible(true);
        this.view.userNameFocus(new userNameFocus());
        this.view.passwordFocus(new passwordFocus());
        this.view.loginAction(new loginAction());
    }
    
    private class loginAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                if (model.valid(view.getAccount())) {
                    CHome.getInstance(new VHome(), new MHome ());
                    view.dispose();
                } else {
                    JOptionPane.showMessageDialog(view, "Data yang anda masukkan salah, silahkan masukkan kembali");
                }
            } catch (SQLException ex) {
                Logger.getLogger(CLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    private class userNameFocus implements FocusListener {

        @Override
        public void focusGained(FocusEvent e) {
            String data [] = new String [2];
            if (view.getAccount()[0].equalsIgnoreCase("Username")) {
                data [0] = "";
                data [1] = view.getAccount()[1];
                view.setData(data);
            }
        }

        @Override
        public void focusLost(FocusEvent e) {
            String data [] = new String [2];
            if (view.getAccount()[0].isEmpty()) {
                data [0] = "Username";
                data [1] = view.getAccount()[1];
                view.setData(data);
            }
        }
        
    }
    
    private class passwordFocus implements FocusListener {

        @Override
        public void focusGained(FocusEvent e) {
            String data [] = new String [2];
            if (view.getAccount()[1].equalsIgnoreCase("Password")) {
                data [0] = view.getAccount()[0];
                data [1] = "";
                view.passwordSetEcho('*');
                view.setData(data);
            }
        }

        @Override
        public void focusLost(FocusEvent e) {
            String data [] = new String [2];
            if (view.getAccount()[1].isEmpty()) {
                data [0] = view.getAccount()[1];
                data [1] = "Password";
                view.passwordSetEcho((char) 0);
                view.setData(data);
            }
        }
        
    }
}
