package view;

import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import javax.swing.BorderFactory;

/**
 *
 * @author Danu
 */
public class VLogin extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    private static VLogin instance;

    public static VLogin getInstance() {
        if (instance == null) {
            instance = new VLogin();
        }
        return instance;
    }

    public static void setInstance() {
        instance = null;
    }

    public VLogin() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.username.setBorder(BorderFactory.createCompoundBorder(
                this.username.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        this.password.setBorder(BorderFactory.createCompoundBorder(
                this.password.getBorder(),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        this.label1.requestFocus();
        this.password.setEchoChar((char)0);
    }
    
    public String [] getAccount(){
        String account[] = new String [2];
        account [0] = this.username.getText();
        account [1] = String.valueOf(this.password.getPassword());
        return account;
    }
    
    public void setData(String data []){
        this.username.setText(data [0]);
        this.password.setText(data [1]);
    }
    
    public void userNameFocus(FocusListener focus){
        this.username.addFocusListener(focus);
    }
    
    public void passwordFocus(FocusListener focus){
        this.password.addFocusListener(focus);
    }
    
    public void loginAction(ActionListener action){
        this.BMasuk.addActionListener(action);
    }
    
    public void passwordSetEcho(char a){
        this.password.setEchoChar(a);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background1 = new komponenTambahan.Background();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        BMasuk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        username.setFont(new java.awt.Font("Roboto Cn", 0, 15)); // NOI18N
        username.setForeground(new java.awt.Color(91, 91, 91));
        username.setText("Username");

        password.setFont(new java.awt.Font("Roboto Cn", 0, 15)); // NOI18N
        password.setForeground(new java.awt.Color(91, 91, 91));
        password.setText("Password");

        jLabel1.setFont(new java.awt.Font("Roboto Cn", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(237, 230, 230));
        jLabel1.setText("Password yang sesuai");

        label1.setFont(new java.awt.Font("Roboto Cn", 0, 15)); // NOI18N
        label1.setForeground(new java.awt.Color(237, 230, 230));
        label1.setText("Pastikan anda memasukkan Username dan");

        BMasuk.setFont(new java.awt.Font("Roboto Cn", 1, 20)); // NOI18N
        BMasuk.setText("Masuk");
        BMasuk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addGroup(background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(154, 154, 154))
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background1Layout.createSequentialGroup()
                .addContainerGap(236, Short.MAX_VALUE)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label1)
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(BMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BMasuk;
    private komponenTambahan.Background background1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label1;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
