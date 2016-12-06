package view;

import java.awt.event.ActionListener;

/**
 *
 * @author Danu
 */
public class VHome extends javax.swing.JFrame {

    /**
     * Creates new form VHome
     */
    public VHome() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    public void penanamanbaru_action(ActionListener a) {
        this.BPenanamanbaru.addActionListener(a);

    }

    public void cektanaman_action(ActionListener a) {
        this.BCektanaman.addActionListener(a);

    }

    public void panen_action(ActionListener a) {
        this.BPanen.addActionListener(a);

    }

    public void cekpupuk_action(ActionListener a) {
        this.BCekPupuk.addActionListener(a);
    }
    
    public void cekkebun_action(ActionListener a) {
        this.BCekkebun.addActionListener(a);
    }

    public void lapjual_action(ActionListener a) {
        this.BLaporanpenjualan.addActionListener(a);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundHome1 = new komponenTambahan.BackgroundHome();
        BLaporanpenjualan = new javax.swing.JButton();
        BPenanamanbaru = new javax.swing.JButton();
        BCektanaman = new javax.swing.JButton();
        BPanen = new javax.swing.JButton();
        BCekPupuk = new javax.swing.JButton();
        BCekkebun = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundHome1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BLaporanpenjualan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BLaporanpenjualan.setText("Laporan Penjualan");
        BLaporanpenjualan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backgroundHome1.add(BLaporanpenjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 175, 37));

        BPenanamanbaru.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BPenanamanbaru.setText("Penanaman Baru");
        BPenanamanbaru.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backgroundHome1.add(BPenanamanbaru, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 175, 37));

        BCektanaman.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BCektanaman.setText("Cek Tanaman");
        BCektanaman.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backgroundHome1.add(BCektanaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 175, 37));

        BPanen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BPanen.setText("Panen");
        BPanen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backgroundHome1.add(BPanen, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 175, 37));

        BCekPupuk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BCekPupuk.setText("Cek Pupuk");
        BCekPupuk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backgroundHome1.add(BCekPupuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 175, 37));

        BCekkebun.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BCekkebun.setText("Cek Kebun");
        BCekkebun.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backgroundHome1.add(BCekkebun, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 175, 37));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundHome1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundHome1, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCekPupuk;
    private javax.swing.JButton BCekkebun;
    private javax.swing.JButton BCektanaman;
    private javax.swing.JButton BLaporanpenjualan;
    private javax.swing.JButton BPanen;
    private javax.swing.JButton BPenanamanbaru;
    private komponenTambahan.BackgroundHome backgroundHome1;
    // End of variables declaration//GEN-END:variables
}
