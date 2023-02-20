package Gun25_First_Step_with_Class._02_Question;

import java.util.ArrayList;
import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        Scanner scanInt=new Scanner(System.in);
        Scanner scanStr=new Scanner(System.in);
        ArrayList<Student> cls=new ArrayList<>();

        for (int i = 0; i <3 ; i++) {

            Student std = new Student();
            System.out.print("Student's name=");  std.name = scanStr.nextLine();
            System.out.print("Student's surname=");  std.surname= scanStr.nextLine();
            System.out.print("Student's class=");  std.class_ = scanInt.nextInt();
            System.out.print("Student's address=");  std.address = scanStr.nextLine();

            cls.add(std);
        }

        for(Student std : cls)
        {
            System.out.println("Student's name = " + std.name);
            System.out.println("Student's surname = " + std.surname);
            System.out.println("Student's class = " + std.class_);
            System.out.println("Student's address " + std.address);
        }

    }
}


class Student{
    // properties, field, property
    String name;
    String surname;
    int class_;
    String address;
}
