package Gun27_Class_Examples._03_Example3;

import java.util.ArrayList;

public class Student {
    String name;
    int maxHour;
    ArrayList<Lesson> les = new ArrayList<>();

    public void addLes(Lesson lesson) {

        int nowTotal = 0;
        for (Lesson d : les)
            nowTotal += d.hour;

        if (nowTotal + lesson.hour <= maxHour)
            les.add(lesson);
        else
            System.out.println(lesson.name + "Credit nerve was noble");

    }

    public void writeLesson() {
        System.out.println("\n*** Transkript ***");
        System.out.println("Mrs " + name + " :");
        System.out.println("Below are the courses you have taken.");
        for (Lesson d : les)
            System.out.println(d.name + " " + d.hour + " hours");

    }

    public static void UniversityRules() {
        System.out.println("Rule1 : Don't come to class without breakfast");
        System.out.println("Rule2 : Get the sleep, go to bed early");
        System.out.println("Rule3 : Always be vigorous and dynamic");
        System.out.println("Rule4 : REMEMBER the decision you made in the beginning!");
        System.out.println("Rule5 : We will overcome impossibilities");

    }

}
