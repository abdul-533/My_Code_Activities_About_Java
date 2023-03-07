package Gun34_Protected_and_Default_access._03_Example_3;

public class School {
    public static void main(String[] args) {

        HighSchool high1 = new HighSchool("Ali Alizada", StdType.HIGHSCHOOL, "Sayisal");
        HighSchool high2 = new HighSchool("Mehmet Yilaz", StdType.HIGHSCHOOL, "Soz");
        PrimarySchool primary1 = new PrimarySchool("Ayseh Bayrak", StdType.PRIMARY, "Satranc");

        System.out.println("H1 = " + high1);
        System.out.println("H2 = " + high2);
        System.out.println("P1 = " + primary1);

        //if we wanted to get the ID of both, we would put a separate counter in each calc
        // here we give the counter to both of them separately and print the ID

    }

}
