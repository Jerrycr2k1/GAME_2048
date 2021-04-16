/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GAME;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author khain
 */
public class Main {
     public static void main(String[] args) {
    JFrame game = new JFrame();
    game.setTitle("Game 2048");
    game.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    game.setSize(400,450);
    game.setResizable(false);

    game.add(new game2.Game2048());

    game.setLocationRelativeTo(null);
    game.setVisible(true);
  }
    
        
}
