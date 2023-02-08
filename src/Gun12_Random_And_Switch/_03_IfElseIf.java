package Gun12_Random_And_Switch;

import java.util.Scanner;

public class _03_IfElseIf {
    public static void main(String[] args) {
        // Question : Get the note information in the form of Physics: 90 from the user.
        // for 90 >=A
        // for 80 >=B
        // for 70 >=C
        // for 60 >=D
        //for 40 >=E
        // print F for  40 <.
        Scanner oku = new Scanner(System.in);
        System.out.println("Example: Physica:90");
        System.out.print("Write subject name and your mark=");
        String text = oku.nextLine();
        int number = Integer.parseInt(text.substring(text.indexOf(":") + 1));  // Second way  //int not=Integer.parseInt(text.replaceAll("[^0-9]",""));


        if (number >= 90)
            System.out.print("Congratulations, you get A");
        else if (number >= 80)
            System.out.print("Congratulations, you get B");
        else if (number >= 70)
            System.out.print("Congratulations, you get C");
        else if (number >= 60)
            System.out.print("Congratulations, you get D");
        else if (number >= 40)
            System.out.print("Congratulations, you get E, thats isn't good mark  you should study more");
        else
            System.out.print("Sorry you didn't get a good mark, your mark is F");


    }
}
