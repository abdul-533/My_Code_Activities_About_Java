package Gun34_Protected_and_Default_access._02_Example_2;

public class School {
    public static void main(String[] args) {

        HighSchoolStd High1 = new HighSchoolStd("Ali Alizada", StdType.HIGHSCHOOL, "Sayisal");
        HighSchoolStd High2 = new HighSchoolStd("Mehmet Yilaz", StdType.HIGHSCHOOL, "Soz");
        firstStudent Pr = new firstStudent("Ayseh Bayrak", StdType.PRIMARY, "Satranc");

        System.out.println("High 1 = " + High1);
        System.out.println("High 2= " + High2);
        System.out.println("Primary = " + Pr);

        //if we wanted to get the IDs of both, we would put a separate counter in each cal.


    }

}
