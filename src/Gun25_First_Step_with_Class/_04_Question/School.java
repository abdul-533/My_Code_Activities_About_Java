package Gun25_First_Step_with_Class._04_Question;

import java.util.ArrayList;
import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        Scanner scanStr = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);

        ArrayList<Student> cls = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            Student std = new Student();

            System.out.print("School No=");
            std.schNo = scanInt.nextInt();
            System.out.print("Full name=");
            std.wholeName = scanStr.nextLine();
            System.out.print("Note or mark =");
            std.note = scanInt.nextInt();

            cls.add(std);
        }

        PrintInformation(cls);
        PrintAverage(cls);
    }

    public static void PrintInformation(ArrayList<Student> class_) {
        for (Student std : class_) {
            System.out.println("School No = " + std.schNo);
            System.out.println("Full name= " + std.wholeName);
            System.out.println("Note = " + std.note);
        }
    }

    public static void PrintAverage(ArrayList<Student> class_) {

        int total = 0;
        for (Student str : class_) {
            total += str.note;
        }

        System.out.println("Average = " + (total / class_.size()));
    }
}
