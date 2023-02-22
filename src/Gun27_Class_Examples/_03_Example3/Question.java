package Gun27_Class_Examples._03_Example3;

public class Question {
    public static void main(String[] args) {
        //Questipon:

        // Students will be enrolled in a course at a University.
        // 1- Lesson : fields : name, time (values from 1-10).
        // 2- Student: fields : name, maxTime, a list to hold the list of courses named courses.
        // 3- Create 3 lessons.
        // 4- Define 1 student and let the maxCredit be 10.
        // 5- Add the opened courses to this student's course list.
        // When adding a course, it should not exceed the max. Hours it can take, if it passes
        // warning versi, the max you can get is Timed out.
        // 6- Add a method that prints a 2-item note that prints the university rules.
        // print.

        Student.UniversityRules();

        Lesson les1 = new Lesson();
        les1.name = "Algorithm";
        les1.hour = 4;

        Lesson les2 = new Lesson();
        les2.name = "Java";
        les2.hour = 4;

        Lesson les3 = new Lesson();
        les3.name = "Testing Tools";
        les3.hour = 3;

        Student std = new Student();
        std.name = "Ali";
        std.maxHour = 10;

        std.addLes(les1);
        std.addLes(les2);
        std.addLes(les3);
        std.writeLesson();


    }
}
