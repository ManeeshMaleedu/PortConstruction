/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task1_2;

/**
 *
 * @author malee
 */
public abstract class Shape {
    protected String shapeName;

    public String getShapeName() {
        return shapeName;
    }

    public abstract double calculateArea();

    public void printInfo() {
        System.out.println("Shape: " + shapeName);
        System.out.println("Area: " + calculateArea());
    }
}