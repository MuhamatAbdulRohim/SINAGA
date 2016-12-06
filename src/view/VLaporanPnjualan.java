package view;

import java.awt.event.ActionListener;
import java.text.ParseException;

/**
 *
 * @author Danu
 */
public class VLaporanPnjualan extends javax.swing.JFrame {

    /**
     * Creates new form VLaporanPnjualan
     */
    public VLaporanPnjualan() {
        initComponents();
        this.setLocationRelativeTo(this);
    }
    public void back_action(ActionListener a){
        this.BBack.addActionListener(a);
    }
    
    public void cekAddListener(ActionListener action){
        this.BCek.addActionListener(action);
    }
    
    public void setData(String data []) throws ParseException{
        this.LJmlhpanen.setText(data[0]);
        this.LJmlhTerjual.setText(data[1]);
        this.LSisa.setText(data[2]);
        this.LPendapatan.setText(data[3]);
    }
    
    public String [] getData(){
        String [] data = new String [2];
        data [0] = this.JCJenisBuah.getSelectedItem().toString();
        data [1] = this.JCGrade.getSelectedItem().toString();
        return data;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPenjualan1 = new komponenTambahan.BackgroundPenjualan();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JCJenisBuah = new javax.swing.JComboBox();
        JCGrade = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        LLokasi = new javax.swing.JLabel();
        LJmlhpanen = new javax.swing.JLabel();
        LJmlhTerjual = new javax.swing.JLabel();
        LSisa = new javax.swing.JLabel();
        LPendapatan = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        label3 = new javax.swing.JLabel();
        BCetak = new javax.swing.JButton();
        BBack = new javax.swing.JButton();
        BCek = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundPenjualan1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Grade");
        backgroundPenjualan1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Jenis Buah Naga");
        backgroundPenjualan1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        JCJenisBuah.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Buah Naga Merah", "Buah Naga Putih" }));
        backgroundPenjualan1.add(JCJenisBuah, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 150, -1));

        JCGrade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Grade A", "Grade B", "Grade C" }));
        backgroundPenjualan1.add(JCGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 140, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Lokasi Tanam");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Jumlah Panen");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Terjual");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Sisa");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Pendapatan");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText(":");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText(":");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText(":");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText(":");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText(":");

        LLokasi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LLokasi.setText("____________________");

        LJmlhpanen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LJmlhpanen.setText("____________________");

        LJmlhTerjual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LJmlhTerjual.setText("____________________");

        LSisa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LSisa.setText("____________________");

        LPendapatan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LPendapatan.setText("____________________");

        label1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label1.setText("kg");

        label2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label2.setText("kg");

        label3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        label3.setText("kg");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(LPendapatan))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(LSisa)
                        .addGap(18, 18, 18)
                        .addComponent(label3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(LJmlhTerjual)
                        .addGap(18, 18, 18)
                        .addComponent(label2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(LJmlhpanen)
                        .addGap(18, 18, 18)
                        .addComponent(label1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(LLokasi)))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(LLokasi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(LJmlhpanen)
                    .addComponent(label1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11)
                    .addComponent(LJmlhTerjual)
                    .addComponent(label2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12)
                    .addComponent(LSisa)
                    .addComponent(label3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel13)
                    .addComponent(LPendapatan))
                .addContainerGap())
        );

        backgroundPenjualan1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 600, 130));

        BCetak.setText("Cetak");
        backgroundPenjualan1.add(BCetak, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 70, -1));

        BBack.setText("Kembali");
        backgroundPenjualan1.add(BBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        BCek.setText("cek");
        backgroundPenjualan1.add(BCek, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPenjualan1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPenjualan1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBack;
    private javax.swing.JButton BCek;
    private javax.swing.JButton BCetak;
    private javax.swing.JComboBox JCGrade;
    private javax.swing.JComboBox JCJenisBuah;
    private javax.swing.JLabel LJmlhTerjual;
    private javax.swing.JLabel LJmlhpanen;
    private javax.swing.JLabel LLokasi;
    private javax.swing.JLabel LPendapatan;
    private javax.swing.JLabel LSisa;
    private komponenTambahan.BackgroundPenjualan backgroundPenjualan1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JLabel label3;
    // End of variables declaration//GEN-END:variables
}
