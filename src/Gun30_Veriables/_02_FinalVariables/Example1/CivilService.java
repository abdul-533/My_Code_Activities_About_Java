package Gun30_Veriables._02_FinalVariables.Example1;

public class CivilService {
    public static void main(String[] args) {

        Citizen c1 = new Citizen("Ali");
        Citizen c2 = new Citizen("Nazmiyye");
        Citizen c3 = new Citizen("Orxan");
        System.out.println("v1 = " + c1);
        System.out.println("v2 = " + c2);
        System.out.println("v3 = " + c3);

    }
}
//final:prevents you from being changed after taking the value
// If a static counter: every time a new object is created
// gets new incremental value/
// Final both for constants and after
// used for statements that we do not want to be said
