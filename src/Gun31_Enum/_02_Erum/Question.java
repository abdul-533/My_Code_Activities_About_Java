package Gun31_Enum._02_Erum;

public class Question {
    // A User authorization module is requested.
    // USER ROLE : ADMIN, MAN, SALES, STAFF
    // USER STATUS : ACTIVE, INACTIVE
    // Define a USER(username) class as above
    // 2 users with different authorization and status and an ADMIN
    // define the user.
    // Send these users to the function named UserDelete.
    // Let's warn the ADMIN user that this user cannot be deleted

//    enum Role {
//       ADMIN, Boss, SALES, EMPLOYEE,TESTER
//    }
//
//    enum Statu {
//        ACTIVE, PASSIVE
//    }

    public static void main(String[] args) {
        User user1 = new User("Ali", Role.ADMIN, Status.AKTIF);
        User user2 = new User("Ismet", Role.Boss, Status.PASSIF);
        User user3 = new User("Ayshe", Role.SALES, Status.AKTIF);

        deletUser(user1);
        deletUser(user2);
        deletUser(user3);
        System.out.println("User1 = " + user1);


    }

    public static void deletUser(User user) {

        if (user.role == Role.ADMIN)
            System.out.println(user.username + " Admin cannot be deleted");
    }
}
