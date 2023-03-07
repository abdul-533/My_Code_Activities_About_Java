package Gun34_Protected_and_Default_access._02_Example_2;

public class firstStudent extends Student {
    private String club;


    public firstStudent(String name, StdType type, String club) {
        super( name, type);
        setClub(club);
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    @Override
    public String toString() {
        return "firstStudent{" +
                "club='" + club + '\'' +
                "} " + super.toString();
    }
}
