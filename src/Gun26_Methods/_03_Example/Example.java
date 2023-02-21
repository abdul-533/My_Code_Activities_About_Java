package Gun26_Methods._03_Example;

import java.util.Scanner;

public class Example {

    //Example:
    // Step 1: Write a class in a separate file named Rectangle.
    // (properties, fields, property, element, items) : width, length
    // Step 2: Write a method called Circle to find the circle.
    // Step 3: Write a method named Field that finds the area of the rectangle.
    // Step 4 : Give value to 1 object and print the results of the methods.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Random find = new Random();

        System.out.print("Width =");
        find.width = scan.nextInt();
        System.out.print("Length =");
        find.length = scan.nextInt();
        find.Perimeter();
        find.Area();

    }
}
