package uzayoyunu;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author Melih
 */
public class OyunEkrani extends JFrame {

    public OyunEkrani(String title) throws HeadlessException {
        super(title);
    }

    public static void main(String[] args) {
        OyunEkrani oyunEkrani = new OyunEkrani("Uzay Oyunu");

        oyunEkrani.setResizable(false);
        oyunEkrani.setFocusable(false);
        oyunEkrani.setSize(800, 600);
        oyunEkrani.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Oyun oyun = new Oyun();
        oyun.requestFocus();
        oyun.addKeyListener(oyun);
        oyun.setFocusable(true);
        oyun.setFocusTraversalKeysEnabled(false);
        oyunEkrani.add(oyun);
        oyunEkrani.setVisible(true);
        
    }
}
