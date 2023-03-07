package Gun34_Protected_and_Default_access._04_Protected._01_Example_1;

public class P1Animal {
    public String name; // accessible from anywhere
    int age;  // can only be accessed from the package it is in. default
    protected String genus;// this one can only be accessed from its own package like default, sometimes
    // it can be accessed from others, it has one open door
    private String color;// can only be accessed in the current class
}
