package Gun34_Protected_and_Default_access._04_Protected._01_Example_2;

import Gun34_Protected_and_Default_access._04_Protected._01_Example_1.P1Animal;

public class P2Main {
    public static void main(String[] args) {
        P1Animal p2h = new P1Animal();
        p2h.name = "kopek"; // from the second class, only the island was accessed because it became private
        // says p1h.yash defaul cannot be accessed from the package
        // it says p1h.gensi protected, not directly accessible from the package

        // The protected object from the extended classes can be accessed by default. This is the difference with the default
// public P2Cat() {
// super.species
// }
        // as it sounds, when the extension is made,
        // the super is accessed at the moment the point is pressed
    }
}
