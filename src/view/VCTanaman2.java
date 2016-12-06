package view;

import java.awt.event.ActionListener;

/**
 *
 * @author Danu
 */
public class VCTanaman2 extends javax.swing.JFrame {

    /**
     * Creates new form VCTanaman1
     */
    public VCTanaman2() {
        initComponents();
        this.setLocationRelativeTo(this);
    }
    
    public void tdksehat_action(ActionListener a){
        this.Btdksehat.addActionListener(a);
    } 
    
    public void back_action(ActionListener a){
        this.BBack.addActionListener(a);
    } 
    
    public void cek(ActionListener a){
        this.Cek.addActionListener(a);
    }
    
    public void setsaran(String saran){
        this.JSaran.setText(saran);
    }
    
    public String getCuaca(){
        return this.JCCuaca.getSelectedItem().toString();
    }
    
    public String getSuhu(){
        return this.JSuhu.getText();
    }
    
    public void setData(String [] data){
        this.JLHari.setText(data [0]);
        this.JLTinggi.setText(data [1]);
    }
    public String getTanah(){
        return this.JCKondisitanah.getSelectedItem().toString();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundCtanaman1 = new komponenTambahan.BackgroundCtanaman();
        JLKebun = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JLHari = new javax.swing.JLabel();
        JLTinggi = new javax.swing.JLabel();
        JLHari1 = new javax.swing.JLabel();
        JLTinggi1 = new javax.swing.JLabel();
        JLKebun1 = new javax.swing.JLabel();
        JCCuaca = new javax.swing.JComboBox();
        JLKebun2 = new javax.swing.JLabel();
        JSuhu = new javax.swing.JTextField();
        JLKebun3 = new javax.swing.JLabel();
        JCKondisitanah = new javax.swing.JComboBox();
        Cek = new javax.swing.JButton();
        JLKebun4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JSaran = new javax.swing.JTextArea();
        Btdksehat = new javax.swing.JButton();
        BBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLKebun.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JLKebun.setText("Kebun a");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Umur Tanaman");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Tinggi Normal");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText(":");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText(":");

        JLHari.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JLHari.setText("100 hari");

        JLTinggi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JLTinggi.setText("100 cm");

        JLHari1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JLHari1.setText("Hari");

        JLTinggi1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JLTinggi1.setText("Cm");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLTinggi)
                    .addComponent(JLHari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLTinggi1)
                    .addComponent(JLHari1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JLHari1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JLTinggi1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(JLHari))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(JLTinggi))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        JLKebun1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JLKebun1.setText("Cuaca");

        JCCuaca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kering", "Hujan", "Mendung", " " }));

        JLKebun2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JLKebun2.setText("Suhu");

        JLKebun3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JLKebun3.setText("Kondisi Tanah");

        JCKondisitanah.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Lembab", "Kering", "Rapuh" }));

        Cek.setText("Cek");

        JLKebun4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JLKebun4.setText("Saran");

        JSaran.setColumns(20);
        JSaran.setRows(5);
        jScrollPane1.setViewportView(JSaran);

        Btdksehat.setText("Tanaman Tidak Sehat");

        BBack.setText("Kembali");

        javax.swing.GroupLayout backgroundCtanaman1Layout = new javax.swing.GroupLayout(backgroundCtanaman1);
        backgroundCtanaman1.setLayout(backgroundCtanaman1Layout);
        backgroundCtanaman1Layout.setHorizontalGroup(
            backgroundCtanaman1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundCtanaman1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(backgroundCtanaman1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(backgroundCtanaman1Layout.createSequentialGroup()
                        .addComponent(BBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btdksehat))
                    .addComponent(JLKebun4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLKebun, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundCtanaman1Layout.createSequentialGroup()
                        .addGroup(backgroundCtanaman1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLKebun1)
                            .addComponent(JCCuaca, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80)
                        .addGroup(backgroundCtanaman1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLKebun2)
                            .addComponent(JSuhu, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(backgroundCtanaman1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JLKebun3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JCKondisitanah, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(Cek, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        backgroundCtanaman1Layout.setVerticalGroup(
            backgroundCtanaman1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundCtanaman1Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(JLKebun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(backgroundCtanaman1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLKebun1)
                    .addComponent(JLKebun2)
                    .addComponent(JLKebun3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundCtanaman1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCCuaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JSuhu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCKondisitanah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cek))
                .addGap(18, 18, 18)
                .addComponent(JLKebun4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundCtanaman1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btdksehat)
                    .addComponent(BBack))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundCtanaman1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundCtanaman1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBack;
    private javax.swing.JButton Btdksehat;
    private javax.swing.JButton Cek;
    private javax.swing.JComboBox JCCuaca;
    private javax.swing.JComboBox JCKondisitanah;
    private javax.swing.JLabel JLHari;
    private javax.swing.JLabel JLHari1;
    private javax.swing.JLabel JLKebun;
    private javax.swing.JLabel JLKebun1;
    private javax.swing.JLabel JLKebun2;
    private javax.swing.JLabel JLKebun3;
    private javax.swing.JLabel JLKebun4;
    private javax.swing.JLabel JLTinggi;
    private javax.swing.JLabel JLTinggi1;
    private javax.swing.JTextArea JSaran;
    private javax.swing.JTextField JSuhu;
    private komponenTambahan.BackgroundCtanaman backgroundCtanaman1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
