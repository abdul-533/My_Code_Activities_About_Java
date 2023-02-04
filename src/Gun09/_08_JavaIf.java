package Gun09;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {
        //Question:  Confirm that the user has the same password to be entered 2 times
        // Answer as SAME or NOT. (confirm new password)
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, write the password=");
        String password = scan.nextLine();

        System.out.print("Repeat password = ");
        String passwordRepeat = scan.nextLine();

        boolean isThere = password.equals(passwordRepeat);

        if (isThere == true)
            System.out.println("Same");

        if (isThere == false)
            System.out.println("Not same");

        //Second way
        if (password.equals(passwordRepeat) == true)
            System.out.println("The same");

        if (password.equals(passwordRepeat) == false)
            System.out.println("Not the same");

    }
}
