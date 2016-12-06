package bismillah.sinaga;

import controler.CLogin;
import model.MLogin;
import view.VLogin;
import view.VCTanaman1;

/**
 *
 * @author Danu
 */
public class BismillahSINaga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VCTanaman1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
//        new CHome(new VHome());
        CLogin.getInstance(VLogin.getInstance(), new MLogin());
    }
    
}
