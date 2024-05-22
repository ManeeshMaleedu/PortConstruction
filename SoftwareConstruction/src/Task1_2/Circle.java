/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task1_2;

/**
 *
 * @author malee
 */
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.shapeName = "Circle";
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
