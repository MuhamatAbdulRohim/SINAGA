/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komponenTambahan;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 *
 * @author Danu
 */
public class BackgroundCekpupuk extends JPanel{
    
    private final Image gambar; // deklarasi variabel gambar

    public BackgroundCekpupuk() {
        gambar = new ImageIcon(this.getClass().getResource("/gbr/cekpupuk.jpg")).getImage(); // memanggil lokasi gambar
    }

    @Override
    protected void paintComponent(Graphics a) {
        super.paintComponent(a);
        Graphics gbr = a.create();
        gbr.drawImage(gambar, 0, 0, getWidth(), getHeight(), this);
    }
}
