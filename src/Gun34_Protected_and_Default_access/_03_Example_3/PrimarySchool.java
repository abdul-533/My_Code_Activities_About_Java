package Gun34_Protected_and_Default_access._03_Example_3;

public class PrimarySchool extends Student {
    private static int primarySchoolIdcount = 1; // sayac kedisine has
    private String club;


    public PrimarySchool(String name, StdType type, String club) {
        super(primarySchoolIdcount++, name, type);
        setClub(club);
    }

    public static int getPrimarySchoolIdcount() {
        return primarySchoolIdcount;
    }



    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    @Override
    public String toString() {
        return "PrimarySchool{" +
                "club='" + club + '\'' +
                "} " + super.toString();
    }
}
