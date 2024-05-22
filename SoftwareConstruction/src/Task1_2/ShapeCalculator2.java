/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task1_2;

/**
 *
 * @author malee
 */
import java.util.Scanner;

public class ShapeCalculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please select:");
        System.out.println("(1) Rectangle");
        System.out.println("(2) Circle");
        System.out.println("(3) Square");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(width, length);
                rectangle.printInfo();
                break;

            case 2:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);
                circle.printInfo();
                break;

            case 3:
                System.out.print("Enter the side length of the square: ");
                double sideLength = scanner.nextDouble();
                Square square = new Square(sideLength);
                square.printInfo();
                break;

            default:
                System.out.println("Wrong input");
                break;
        }

        scanner.close();
    }
}