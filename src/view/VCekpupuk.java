package view;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Danu
 */
public class VCekpupuk extends javax.swing.JFrame {

    /**
     * Creates new form VCekpupuk
     */
    public VCekpupuk() {
        initComponents();
        this.setLocationRelativeTo(this);
    }
    
    public void setcekEnable(boolean enable){
        this.BCek.setEnabled(enable);
    }
    
    public void back_action(ActionListener a){
        this.BBack.addActionListener(a);
    }
    public void cek_action(ActionListener a){
        this.BCek.addActionListener(a);
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
    
    public String getvalueat(int kolom){
        return this.jTable1.getValueAt(this.jTable1.getSelectedRow(), kolom).toString();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundCekpupuk1 = new komponenTambahan.BackgroundCekpupuk();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BBack = new javax.swing.JButton();
        BCek = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Daftar Kebun");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        BBack.setText("Kembali");

        BCek.setText("Cek");
        BCek.setEnabled(false);

        javax.swing.GroupLayout backgroundCekpupuk1Layout = new javax.swing.GroupLayout(backgroundCekpupuk1);
        backgroundCekpupuk1.setLayout(backgroundCekpupuk1Layout);
        backgroundCekpupuk1Layout.setHorizontalGroup(
            backgroundCekpupuk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundCekpupuk1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(backgroundCekpupuk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundCekpupuk1Layout.createSequentialGroup()
                        .addComponent(BBack)
                        .addGap(471, 471, 471)
                        .addComponent(BCek))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        backgroundCekpupuk1Layout.setVerticalGroup(
            backgroundCekpupuk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundCekpupuk1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(backgroundCekpupuk1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BBack)
                    .addComponent(BCek))
                .addContainerGap(61, Short.MAX_VALUE))
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
    private javax.swing.JButton BCek;
    private komponenTambahan.BackgroundCekpupuk backgroundCekpupuk1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
