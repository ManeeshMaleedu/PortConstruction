/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boat;

/**
 *
 * @author malee
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Panel extends JPanel {

    int number_ship = 20;
    boolean program_starts = false;
    Ship[] ships = new Ship[number_ship];
    Port port;

    Image ship_image;
    Image island_image;
    Image boat_island_image;

    public Panel() {
        this.setFocusable(true);
        this.setBackground(Color.WHITE);
        port = new Port(900, 500);

        for (int i = 0; i < number_ship; i++) {
            ships[i] = new Ship(20, i * 50, port);
        }
        ship_image = new ImageIcon("boat.png").getImage();
        island_image = new ImageIcon("land.png").getImage();
        boat_island_image = new ImageIcon("boat_land.png").getImage();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Monospaced", Font.BOLD, 20));

        for (int i = 0; i < ships.length; i++) {
            g.drawImage(ship_image, ships[i].x, ships[i].y, this);
        }

        g.drawImage(island_image, port.x, port.y, this);
    }
}
