package Gun12_Random_And_Switch;

import java.util.Scanner;

public class _05_Switch {
    public static void main(String[] args) {
        // Solve the calculator question you solved before with Switch
        Scanner scan = new Scanner(System.in);

        System.out.println("Write first number=");
        int number1 = scan.nextInt();
        System.out.println("Write second number=");
        int number2 = scan.nextInt();

        System.out.println("If you want to add write A,  to subtract  write S, to multiplicat write M and to division write D= ");
        String text = scan.next();
        switch (text) {
            case "A":
                System.out.println("Total=" + (number1 + number2));
                break;
            case "S":
                System.out.println("Subtract=" + (number1 - number2));
                break;
            case "M":
                System.out.println("Multiplicat=" + (number1 * number2));
                break;
            case "D":
                System.out.println("Division=" + ((double) number1 / number2));
                break;
            default:
                System.out.println("Incorrect choice");


        }

    }
}
