package Gun27_Class_Examples._02_Example2;

public class Question {
    //Question:
    // Get 5 of the methods in the Math class
    // write it in a separate class with your own naming,
    // (you can use Math.functions inside your own method)
    // Example to enable direct use without creating objects from main
    // write their usage.


    public static void main(String[] args) {

        int max = MathClass.findMax(6, 9);
        int min = MathClass.findMin(10, 50);
        int rnd = MathClass.Random(10);
        double resultP = MathClass.getPow(2, 3);
        double resultS = MathClass.getSquare(625);

        System.out.println("Square = " + resultS);
        System.out.println("Pow = " + resultP);
        System.out.println("rnd = " + rnd);
        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }
}
