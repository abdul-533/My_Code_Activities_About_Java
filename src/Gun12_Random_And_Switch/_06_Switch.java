package Gun12_Random_And_Switch;

import java.util.Scanner;

public class _06_Switch {
    public static void main(String[] args) {
        // Write the value of the ones digit of an entered number
        // 234-> the ones digit ->4 print the four .

        Scanner scan = new Scanner(System.in);
        System.out.println("Write number=");
        int number = scan.nextInt();
        int onersDigit = number % 10;
        switch (onersDigit) {
            case 0: System.out.println("Ones digit: " + "zero"); break;
            case 1: System.out.println("Ones digit: " + "one");break;
            case 2: System.out.println("Ones digit: " + "two");break;
            case 3: System.out.println("Ones digit: " + "three");break;
            case 4: System.out.println("Ones digit: " + "four");break;
            case 5: System.out.println("Ones digit: " + "five");break;
            case 6: System.out.println("Ones digit: " + "six");break;
            case 7: System.out.println("Ones digit: " + "seven");break;
            case 8: System.out.println("Ones digit: " + "eight");break;
            case 9: System.out.println("Ones digit: " + "nine");


        }


    }
}
