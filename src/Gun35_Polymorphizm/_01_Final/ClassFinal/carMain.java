package Gun35_Polymorphizm._01_Final.ClassFinal;

public class carMain {
    public static void main(String[] args) {

        Transportation t1 = new Transportation();
        t1.model = "opel";

        Transportation t2 = new Transportation();
        t2.model = "opel";


        //If class is final, it can call more than in the main,
        // but it is not extended to another class.

    }
}
