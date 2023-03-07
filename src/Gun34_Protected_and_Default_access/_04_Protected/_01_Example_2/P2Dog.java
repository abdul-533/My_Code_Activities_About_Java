package Gun34_Protected_and_Default_access._04_Protected._01_Example_2;

import Gun34_Protected_and_Default_access._04_Protected._01_Example_1.P1Animal;

public class P2Dog extends P1Animal {

    public P2Dog(String name, String genus) {
        this.name= name;
        this.genus = genus;
        // Unlike default, it can be accessed from other package when extended

    }


}
