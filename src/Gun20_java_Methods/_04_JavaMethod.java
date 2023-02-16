package Gun20_java_Methods;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        //Question: Find the sum of 2 numbers entered by the user in a function and print the result in main.
        Scanner scan = new Scanner(System.in);
        System.out.print("Write first number=");
        int a = scan.nextInt();
        System.out.print("Write second number=");
        int b = scan.nextInt();
        int sum = total(a, b);
        System.out.print("Total = " + sum);

    }

    public static int total(int a, int b) {
        return (a + b);

    }

}
