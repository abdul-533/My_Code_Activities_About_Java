package Gun20_java_Methods;

public class _06_JavaMethod {
    public static void main(String[] args) {
        int s1 = 45;
        int s2 = 4;
        int s3 = 67;
        int s4 = 23;

        int result1 = findTotal("Abdul", s1, s2);
        int result2 = findTotal("Ahmet", s1, s2, s3);
        int result3 = findTotal("Ali", s1, s2, s3, s4);


        System.out.println("Result 1= " + result1);
        System.out.println("Result 2= " + result2);
        System.out.println("Result 3= " + result3);


    }

    public static int findTotal(String name, int... numbers) {
        int total = 0;
        System.out.println("Name= " + name);

        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        return total;
    }




}