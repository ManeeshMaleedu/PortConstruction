/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Boat;

/**
 *
 * @author malee
 */
class Ship extends Thread {
    int x;
    int y;
    String name = "Ship";
    Port port;

    public Ship(int x, int y, Port port) {
        this.x = x;
        this.y = y;
        this.port = port;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (port) {
                try {
                    port.wait(); // Wait for permission to proceed
                    x += 10; // Move ship
                    if (x >= port.x) {
                        x = port.x;
                        sleep(1000); // Stay at island
                        x = 20; // Move back
                        port.notify(); // Notify other ships that this ship is done
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
