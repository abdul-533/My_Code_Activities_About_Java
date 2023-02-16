package Gun20_java_Methods;

import java.util.Scanner;

public class _02_JAvaMethod {
    public static void main(String[] args) {
        //Question:  After finding the largest of the 2 numbers entered by the user in a method  print it in main.
        Scanner scan = new Scanner(System.in);
        System.out.println("Write number=");
        int number1 = scan.nextInt();
        System.out.println("Write number=");
        int number2 = scan.nextInt();
        int max = findMax(number1, number2);
        System.out.println("Max number = " + max);


    }

    public static int findMax(int s1, int s2) {
        // First way;
        int comneback = 0;
        if (s1 > s2)
            comneback = s1;
        else
            comneback = s2;
        return comneback;

        // Second way
        // return  s1>s2? s1:s2;

        //3Third way
        //  if (s1>s2)
        //      return s1;
        //  else
        //      return s2;


    }

}
