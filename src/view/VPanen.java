package view;

import java.awt.event.ActionListener;

/**
 *
 * @author Danu
 */
public class VPanen extends javax.swing.JFrame {

    /**
     * Creates new form VPanen
     */
    public VPanen() {
        initComponents();
        this.setLocationRelativeTo(this);
    }
    
//    grade a
    public void atkebunA(String[] data){
        this.JCLokasiTanamA.removeAllItems();
        for (int i = 0; i < data.length; i++) {
            this.JCLokasiTanamA.addItem(data[i]);
        }
    }
    
    public String getkebunA(){
        return
        this.JCLokasiTanamA.getSelectedItem().toString();
    }
    
    public void lihatA(ActionListener a){
        this.BLihatA.addActionListener(a);
    }
    
    public void updateA(ActionListener a){
        this.BupdateA.addActionListener(a);
    }
    
    public String hargaA(){
        return this.JhargaA.getText();
    }
        
    public String banyakA(){
        return this.JBanyakPanenA.getText();
    }
    
    public void hasilA(String hasil){
        this.HasilA.setText(hasil);
    }
    
    public void sethargadanstokA(){
        this.labelBanyakA.setText("Stock baru");
        this.labelhargaA.setText("Harga baru");
    }
    
    public void kembaliA(){
        this.labelBanyakA.setText("Banyak Panen");
        this.labelhargaA.setText("Harga perKilo");
        this.JhargaA.setText("");
        this.JBanyakPanenA.setText("");
    }
    
    public void sethasilenableA(boolean enable){
        this.HasilA.setEnabled(enable);
    }
    
    public void updatesetTextA(String text){
        this.BupdateA.setText(text);
    }
    
    public String getupdatetextA(){
        return this.BupdateA.getText();
    }
    
//    grade b
    public void atkebunB(String[] data){
        this.JCLokasiTanamB.removeAllItems();
        for (int i = 0; i < data.length; i++) {
            this.JCLokasiTanamB.addItem(data[i]);
        }
    }
    
    public String getkebunB(){
        return
        this.JCLokasiTanamB.getSelectedItem().toString();
    }
    
    public void lihatB(ActionListener a){
        this.BLihatB.addActionListener(a);
    }
    
    public void updateB(ActionListener a){
        this.BupdateB.addActionListener(a);
    }
    
    public String hargaB(){
        return this.JhargaB.getText();
    }
        
    public String banyakB(){
        return this.JBanyakPanenB.getText();
    }
    
    public void hasilB(String hasil){
        this.HasilB.setText(hasil);
    }
    
    public void sethargadanstokB(){
        this.labelBanyakB.setText("Stock baru");
        this.labelhargaB.setText("Harga baru");
    }
    
    public void kembaliB(){
        this.labelBanyakB.setText("Banyak Panen");
        this.labelhargaB.setText("Harga perKilo");
        this.JhargaB.setText("");
        this.JBanyakPanenB.setText("");
    }
    
    public void sethasilenableB(boolean enable){
        this.HasilB.setEnabled(enable);
    }
    
    public void updatesetTextB(String text){
        this.BupdateB.setText(text);
    }
    
    public String getupdatetextB(){
        return this.BupdateB.getText();
    }
    
    
//    grade c
    public void atkebunC(String[] data){
        this.JCLokasiTanamC.removeAllItems();
        for (int i = 0; i < data.length; i++) {
            this.JCLokasiTanamC.addItem(data[i]);
        }
    }
    
    public String getkebunC(){
        return
        this.JCLokasiTanamC.getSelectedItem().toString();
    }
    
    public void lihatC(ActionListener a){
        this.BLihatC.addActionListener(a);
    }
    
    public void updateC(ActionListener a){
        this.BupdateC.addActionListener(a);
    }
    
    public String hargaC(){
        return this.JhargaC.getText();
    }
        
    public String banyakC(){
        return this.JBanyakPanenC.getText();
    }
    
    public void hasilC(String hasil){
        this.HasilC.setText(hasil);
    }
    
    public void sethargadanstokC(){
        this.labelBanyakC.setText("Stock baru");
        this.labelhargaC.setText("Harga baru");
    }
    
    public void kembaliC(){
        this.labelBanyakC.setText("Banyak Panen");
        this.labelhargaC.setText("Harga perKilo");
        this.JhargaC.setText("");
        this.JBanyakPanenC.setText("");
    }
    
    public void sethasilenableC(boolean enable){
        this.HasilC.setEnabled(enable);
    }
    
    public void updatesetTextC(String text){
        this.BupdateC.setText(text);
    }
    
    public String getupdatetextC(){
        return this.BupdateC.getText();
    }
    
    
    
    public void back_action(ActionListener a){
        this.BBack.addActionListener(a);
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanen1 = new komponenTambahan.BackgroundPanen();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        JBanyakPanenA = new javax.swing.JTextField();
        labelBanyakA = new javax.swing.JLabel();
        HasilA = new javax.swing.JTextField();
        BLihatA = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        JhargaA = new javax.swing.JTextField();
        labelhargaA = new javax.swing.JLabel();
        BupdateA = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        JCLokasiTanamA = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        JBanyakPanenB = new javax.swing.JTextField();
        labelhargaB = new javax.swing.JLabel();
        HasilB = new javax.swing.JTextField();
        BLihatB = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        JhargaB = new javax.swing.JTextField();
        labelBanyakB = new javax.swing.JLabel();
        BupdateB = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        JCLokasiTanamB = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        JhargaC = new javax.swing.JTextField();
        labelBanyakC = new javax.swing.JLabel();
        BupdateC = new javax.swing.JButton();
        JBanyakPanenC = new javax.swing.JTextField();
        labelhargaC = new javax.swing.JLabel();
        HasilC = new javax.swing.JTextField();
        BLihatC = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JCLokasiTanamC = new javax.swing.JComboBox();
        BBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundPanen1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelBanyakA.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelBanyakA.setText("Banyak Panen");

        BLihatA.setText("Lihat");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel20.setText("Grade A");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Hasil");

        labelhargaA.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelhargaA.setText("Harga perKilo");

        BupdateA.setText("Update");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Lokasi Tanam");

        JCLokasiTanamA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kebun 1", "Kebun 2" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(JCLokasiTanamA, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JBanyakPanenA, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelBanyakA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelhargaA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JhargaA))
                        .addGap(304, 304, 304))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(240, 240, 240))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(HasilA, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BupdateA, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BLihatA, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(8, 8, 8)
                        .addComponent(JCLokasiTanamA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelBanyakA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBanyakPanenA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addComponent(HasilA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelhargaA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JhargaA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BLihatA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BupdateA)))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Grade A", jPanel1);

        labelhargaB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelhargaB.setText("Banyak Panen");

        BLihatB.setText("Lihat");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("Grade B");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Hasil");

        labelBanyakB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelBanyakB.setText("Harga perKilo");

        BupdateB.setText("Update");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Lokasi Tanam");

        JCLokasiTanamB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kebun 1", "Kebun 2" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelhargaB, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                        .addGap(268, 268, 268))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(HasilB, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BLihatB, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BupdateB, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(labelBanyakB)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(JBanyakPanenB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(JhargaB, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(JCLokasiTanamB, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addComponent(JCLokasiTanamB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelhargaB)
                    .addComponent(labelBanyakB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBanyakPanenB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JhargaB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(HasilB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(76, 76, 76))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BLihatB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BupdateB)
                .addGap(56, 56, 56))
        );

        jTabbedPane2.addTab("Grade B", jPanel2);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Grade C");

        labelBanyakC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelBanyakC.setText("Harga perKilo");

        BupdateC.setText("Update");

        labelhargaC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelhargaC.setText("Banyak Panen");

        BLihatC.setText("Lihat");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Hasil");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Lokasi Tanam");

        JCLokasiTanamC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kebun 1", "Kebun 2" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(JCLokasiTanamC, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JBanyakPanenC, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelhargaC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(labelBanyakC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JhargaC))
                                .addGap(39, 39, 39))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(HasilC, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BupdateC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BLihatC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(159, 159, 159))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(8, 8, 8)
                .addComponent(JCLokasiTanamC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JhargaC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelhargaC)
                            .addComponent(labelBanyakC))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBanyakPanenC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(BLihatC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HasilC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BupdateC))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Grade C", jPanel3);

        backgroundPanen1.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 600, 320));

        BBack.setText("Kembali");
        backgroundPanen1.add(BBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanen1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanen1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBack;
    private javax.swing.JButton BLihatA;
    private javax.swing.JButton BLihatB;
    private javax.swing.JButton BLihatC;
    private javax.swing.JButton BupdateA;
    private javax.swing.JButton BupdateB;
    private javax.swing.JButton BupdateC;
    private javax.swing.JTextField HasilA;
    private javax.swing.JTextField HasilB;
    private javax.swing.JTextField HasilC;
    private javax.swing.JTextField JBanyakPanenA;
    private javax.swing.JTextField JBanyakPanenB;
    private javax.swing.JTextField JBanyakPanenC;
    private javax.swing.JComboBox JCLokasiTanamA;
    private javax.swing.JComboBox JCLokasiTanamB;
    private javax.swing.JComboBox JCLokasiTanamC;
    private javax.swing.JTextField JhargaA;
    private javax.swing.JTextField JhargaB;
    private javax.swing.JTextField JhargaC;
    private komponenTambahan.BackgroundPanen backgroundPanen1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel labelBanyakA;
    private javax.swing.JLabel labelBanyakB;
    private javax.swing.JLabel labelBanyakC;
    private javax.swing.JLabel labelhargaA;
    private javax.swing.JLabel labelhargaB;
    private javax.swing.JLabel labelhargaC;
    // End of variables declaration//GEN-END:variables
}
