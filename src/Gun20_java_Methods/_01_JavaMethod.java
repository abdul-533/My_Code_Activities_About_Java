package Gun20_java_Methods;

public class _01_JavaMethod {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("Hello world");

        printHello();
        printTotal(4, 5);
        int max = Math.max(4, 5);
        double sayi = Math.random();

        printMax(4, 5);
        max = findMax(4, 5);
        System.out.println("Max = " + max);

    }


    public static int findMax(int a, int b) {
        int returned = 0;
        if (a > b)
            returned = a;
        else
            returned = b;

        return returned;
    }

    public static void printMax(int a, int b) {
        if (a > b)
            System.out.println(a);
        else
            System.out.println(b);
    }

    public static void printTotal(int a, int b) {
        System.out.println(a + b);
    }

    public static void printHello() {
        System.out.println("Hello world");
    }

}