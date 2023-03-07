package Gun34_Protected_and_Default_access._04_Protected._01_Example_1;

public class P1main {
    public static void main(String[] args) {
        P1Animal p1h = new P1Animal();
        p1h.name = "Black cat"; // public accessed
        p1h.age = 2;// default accessed;
        p1h.genus = "male";// protected accessed
        //p1h.color could not be accessed because private can only be accessed from its own class


    }
}
