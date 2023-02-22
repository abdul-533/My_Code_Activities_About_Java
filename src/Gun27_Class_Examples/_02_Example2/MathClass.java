package Gun27_Class_Examples._02_Example2;

public class MathClass {

    public static int Random(int max) {

        return (int) Math.random() * max;
    }

    public static int findMax(int a, int b) {

        return Math.max(a, b);
    }

    public static int findMin(int a, int b) {

        return Math.min(a, b);
    }

    public static double getSquare(int a) {

        return Math.sqrt(a);
    }

    public static double getPow(int a, int b) {

        return Math.pow(a, b);
    }
}
