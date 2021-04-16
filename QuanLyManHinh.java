/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
public class QuanLyManHinh {
    public int mg = 3;
    public int widthMH = 400+3*mg;
    public int heightMH = 400 +3*mg;
    VeManHinh vMH;
    QuanLyData qlDT;

    
    public QuanLyManHinh(VeManHinh vMH,QuanLyData qlDT, JFrame frame) {
        this.vMH = vMH;
        this.vMH = new VeManHinh();
        this.qlDT = new QuanLyData();
        this.vMH.veCacNut(frame, widthMH, heightMH, mg);        
    }
    
    public void setUp(JFrame frame){
        frame.setSize(widthMH +10*2+mg, heightMH+21*2+mg);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setFocusable(true);
        frame.getContentPane().setBackground(Game2048.hex2Rgb("#000000"));
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        qlDT.moveLeft();
                        break;
                    case KeyEvent.VK_RIGHT:
                        qlDT.moveRight();
                        break;
                    case KeyEvent.VK_UP:
                        qlDT.moveTop();
                        break;
                    default:
                        qlDT.moveBt();
                        break;
                }
                vMH.upDate();
            }
        });
    }
    
}
