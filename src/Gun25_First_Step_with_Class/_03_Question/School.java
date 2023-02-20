package Gun25_First_Step_with_Class._03_Question;

import java.util.ArrayList;
import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        ArrayList<Student> cls = new ArrayList<>();
        Scanner scanStr = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {

            Student std = new Student();
            System.out.print("Student's name=");
            std.name = scanInt.nextLine();
            System.out.print("Student's surname=");
            std.surname = scanStr.nextLine();
            System.out.print("Student's class=");
            std.class_ = scanInt.nextInt();
            System.out.print("Student's address=");
            std.address = scanStr.nextLine();

            cls.add(std);
        }

        for (Student std : cls) {
            System.out.println("name = " + std.name);
            System.out.println("surname = " + std.surname);
            System.out.println("class= " + std.class_);
            System.out.println("address = " + std.address);
        }

    }
}
