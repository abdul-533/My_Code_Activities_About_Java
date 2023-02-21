package Gun26_Methods._01_Example;

public class Kampus {
    public static void main(String[] args) {
        //Example:
        // For a campus program, the following information
        // write the classes in which it will be saved.
        // School : name, managerName, price(double) -> type
        // Student : schoolID, fullName, school -> Type

        // this way you can define 1 student and all the information yourself
        // assign and print.


        student std = new student();

        std.schoolNo = 1;
        std.wholeName = "Abdul Alizada";

        //First way
        std.school = new school();
        std.school.name = "Orta Internat Mektebi";
        std.school.bossName = "Musa Badalov";
        std.school.fee = 6000;

        //Second way

        school sc = new school();

        sc.name = "Orta Internat Mektebi";
        sc.bossName = "Musa Badalov";
        sc.fee = 6000;
        std.school = sc;

        System.out.println("School No = " + std.schoolNo);
        System.out.println("Whole name = " + std.wholeName);
        System.out.println("School name = " + std.school.name);
        System.out.println("Boss name = " + std.school.bossName);
        System.out.println("Fee = " + std.school.fee);


    }
}
