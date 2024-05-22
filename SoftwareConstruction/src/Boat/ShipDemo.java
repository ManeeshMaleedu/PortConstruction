/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boat;

import javax.swing.JFrame;

/**
 *
 * @author malee
 */
public class ShipDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java Paint");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panel panel = new Panel();
        frame.add(panel); 

        frame.setSize(1000, 1050);
        frame.setVisible(true);

        // Start ship threads
        for (Ship ship : panel.ships) {
            ship.start();
        }
    }
}