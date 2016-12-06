package view;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Danu
 */
public class VCTanaman1 extends javax.swing.JFrame {

    /**
     * Creates new form VCTanaman
     */
    public VCTanaman1() {
        initComponents();
        this.setLocationRelativeTo(this);
    }
    
    public void back_action(ActionListener a){
        this.BBack.addActionListener(a);
    }
    
    public void cek_action(ActionListener a){
        this.BCek.addActionListener(a);
    }
    
    public void setcekEnable(boolean enable){
        this.BCek.setEnabled(enable);
    }
    
    public void tableaction(MouseListener action){
        this.jTable1.addMouseListener(action);
    }
    
    public void setTablemodel(DefaultTableModel model){
        this.jTable1.setModel(model);
    }
    
    public TableModel getTablemodel(){
        return this.jTable1.getModel();
    }
    
    public String getNamaKebun(){
        return this.jTable1.getValueAt(this.jTable1.getSelectedRow(), 1).toString();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundCtanaman1 = new komponenTambahan.BackgroundCtanaman();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BCek = new javax.swing.JButton();
        BBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundCtanaman1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama Kebun", "Lokasi", "Jumlah Tanaman", "Prakiraan Panen"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(50);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        backgroundCtanaman1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 560, 230));

        BCek.setBackground(new java.awt.Color(116, 254, 91));
        BCek.setText("Cek");
        BCek.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BCek.setEnabled(false);
        backgroundCtanaman1.add(BCek, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, 100, 40));

        BBack.setBackground(new java.awt.Color(253, 223, 53));
        BBack.setText("Batal");
        BBack.setBorder(null);
        BBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backgroundCtanaman1.add(BBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 100, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Daftar Kebun");
        backgroundCtanaman1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundCtanaman1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundCtanaman1, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBack;
    private javax.swing.JButton BCek;
    private komponenTambahan.BackgroundCtanaman backgroundCtanaman1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
