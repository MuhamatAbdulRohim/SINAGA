package view;

import java.awt.event.ActionListener;

/**
 *
 * @author Danu
 */
public class VCekpupuk1 extends javax.swing.JFrame {

    /**
     * Creates new form VCekpupuk1
     */
    public VCekpupuk1() {
        initComponents();
        this.setLocationRelativeTo(this);
    }
    public void back_action(ActionListener a){
        this.BBack.addActionListener(a);
    }
    
    public void jadwal1(String jdw){
        this.Jpemupukan1.setText(jdw);
    }
    
    public void jml1(String jml){
        this.JjumlahPupuk1.setText(jml);
    }
    
    
    public void jadwal2(String jdw){
        this.Jpemupukan2.setText(jdw);
    }
    
//    public void jml2(String jml){
//        this.JjumlahPupuk2.setText(jml);
//    }
    
    public void jadwal3(String jdw){
        this.Jpemupukan3.setText(jdw);
    }
    
//    public void jml3(String jml){
//        this.JjumlahPupuk3.setText(jml);
//    }
    
    public void jadwal4(String jdw){
        this.Jpemupukan4.setText(jdw);
    }
    
//    public void jml4(String jml){
//        this.JjumlahPupuk4.setText(jml);
//    }
    
    public void jmlbibit(String jdw){
        this.Jbibit.setText(jdw);
    }
    
    public void luas(String jdw){
        this.JLahan.setText(jdw);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundCekpupuk1 = new komponenTambahan.BackgroundCekpupuk();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Jpemupukan1 = new javax.swing.JTextField();
        Jpemupukan2 = new javax.swing.JTextField();
        Jpemupukan3 = new javax.swing.JTextField();
        Jpemupukan4 = new javax.swing.JTextField();
        Jbibit = new javax.swing.JLabel();
        JLahan = new javax.swing.JLabel();
        JjumlahPupuk1 = new javax.swing.JTextField();
        BCetak = new javax.swing.JButton();
        BBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Jadwal Pemupukan            :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Jumlah Bibit                        :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Luas Lahan                         :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Jumlah puupk                    :");

        Jbibit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Jbibit.setText("10000 bibit");

        JLahan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JLahan.setText("10000 M persegi");

        BCetak.setBackground(new java.awt.Color(102, 102, 102));
        BCetak.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BCetak.setText("Cetak");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(Jpemupukan1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Jpemupukan2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Jpemupukan3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Jpemupukan4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(Jbibit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(JLahan))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BCetak)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(JjumlahPupuk1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(285, 285, 285))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Jpemupukan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jpemupukan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jpemupukan3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jpemupukan4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Jbibit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JLahan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(JjumlahPupuk1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(BCetak)
                .addGap(19, 19, 19))
        );

        BBack.setText("Kembali");

        javax.swing.GroupLayout backgroundCekpupuk1Layout = new javax.swing.GroupLayout(backgroundCekpupuk1);
        backgroundCekpupuk1.setLayout(backgroundCekpupuk1Layout);
        backgroundCekpupuk1Layout.setHorizontalGroup(
            backgroundCekpupuk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundCekpupuk1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(backgroundCekpupuk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BBack)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        backgroundCekpupuk1Layout.setVerticalGroup(
            backgroundCekpupuk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundCekpupuk1Layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BBack)
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundCekpupuk1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundCekpupuk1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBack;
    private javax.swing.JButton BCetak;
    private javax.swing.JLabel JLahan;
    private javax.swing.JLabel Jbibit;
    private javax.swing.JTextField JjumlahPupuk1;
    private javax.swing.JTextField Jpemupukan1;
    private javax.swing.JTextField Jpemupukan2;
    private javax.swing.JTextField Jpemupukan3;
    private javax.swing.JTextField Jpemupukan4;
    private komponenTambahan.BackgroundCekpupuk backgroundCekpupuk1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
