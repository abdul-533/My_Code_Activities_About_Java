package Gun20_java_Methods;

public class _05_JavaMethod {
    public static void main(String[] args) {
        int s1 = 4;
        int s2 = 12;
        int s3 = 34;


        int result1 = findTotal(s1, s2);
        System.out.println("Result 1 = " + result1);
        int result2 = findTotal(s1, s2, s3);
        System.out.println("Result 2 = " + result2);

        String name = "Ali";
        String surname = "Alizada";
        String result3 = findTotal(name, surname);
        System.out.println("Result 3 = " + result3);

    }

    public static int findTotal(int s1, int s2) {
        return s1 + s2;


    }

    public static int findTotal(int s1, int s2, int s3) {
        return s1 + s2 + s3;
    }

    public static String findTotal(String name, String surname) {
        return name + " " + surname;
    }
}
