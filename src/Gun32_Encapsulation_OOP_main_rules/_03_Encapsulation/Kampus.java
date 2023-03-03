package Gun32_Encapsulation_OOP_main_rules._03_Encapsulation;

import java.util.Scanner;

public class Kampus {
    // 1- Define a Student class whose fields are name, surname, age.
    // 2- Define a consructor consisting of name, surname and age for the student class.
    // 3- Apply encapsulation for all fields.
    // 4- Define a class named school, its fields are schoolName, quota,
    // Get Students in ArrayList.
    // 5- Create a class named OkulMain with main method.
    // 6- creating a school object and taking it from the user until it reaches the maximum number of students for this school
    // add student. However, the age of the students you will create should not exceed 15.
    // If a student over this age is wanted to be added, ask for another student instead.
    // 7- Assign a unique ID to all students.
    public static void main(String[] args) {
        Scanner scInt = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);

        School newSc = new School("Kabataş School", 3);

        do {
            System.out.println("Name=");
            String name = scStr.nextLine();
            System.out.println("Surname=");
            String surname = scStr.nextLine();
            System.out.println("Age=");
            int age = scInt.nextInt();

            if (age < 15) {
                Student std1 = new Student(name, surname, age);
                newSc.getStudents().add(std1);


            } else
                System.out.println("Your age is not suitable");


        } while (newSc.getStudents().size() < newSc.getQuota());
        System.out.println("Students = " + newSc.getStudents());


    }
}
