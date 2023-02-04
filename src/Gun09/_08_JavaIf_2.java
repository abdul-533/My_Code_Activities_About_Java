package Gun09;

import java.util.Scanner;

public class _08_JavaIf_2 {
    public static void main(String[] args) {

        //Question repeat, Different way: Confirm that the user has the same password to be entered 2 times
        // Answer as SAME or NOT. (confirm new password)

        String password = "hello1";
        String repeatPassword = "hello1";

        System.out.println("Password = " + password);
        System.out.println("RepeatPassword= " + repeatPassword);
        System.out.println("RepeatPassword.length() = " + repeatPassword.length());
        System.out.println("Password.length() = " + password.length());

        if (password == repeatPassword)
            System.out.println("AYNI");

        if (password != repeatPassword)
        System.out.println("DEĞİL");

    }
}
