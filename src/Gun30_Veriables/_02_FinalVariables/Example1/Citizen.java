package Gun30_Veriables._02_FinalVariables.Example1;

public class Citizen {

    String name;
    final int IDCartNum;
    // cannot be changed
    // so there is only one chance to assign data.

    static int IDCNCounter = 1;

    public Citizen(String name) {
        this.name = name;
        this.IDCartNum = IDCNCounter++;
        // final variables can only be assigned data once
        // while it is being defined or in the Constructor.
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "Name='" + name + '\'' +
                ", IDCArtNum=" + IDCartNum +
                '}';
    }
}
