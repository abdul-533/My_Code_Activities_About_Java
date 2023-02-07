package Gun11_If_and_Ternary;

public class _06_JavaMath {
    public static void main(String[] args) {
        int a = -12;
        int b = 4;

        System.out.println("absolute value of a=" + Math.abs(-12));// 12
        System.out.println("the greater of a and b=" + Math.max(a, b)); // 4
        System.out.println(" the smaller of a and b=" + Math.min(a, b));  //-12
        System.out.println(" 2 to the 3rd power=" + Math.pow(2, 3));// 8
        System.out.println("square root of 25=" + Math.sqrt(b));   //2
        System.out.println("round 3.1=" + Math.round(3.1)); //3
        System.out.println("round 3.5=" + Math.round(3.5));   //4

        System.out.println("ceil 3.1=" + Math.ceil(3.1));  //the nearest integer greater than this number
        System.out.println("ceil 3.5=" + Math.ceil(3.5));  // the nearest integer greater than this number
        System.out.println("floor 3.1=" + Math.floor(3.1));  // the nearest integer smaller than this number
        System.out.println("floor 3.5=" + Math.floor(3.5)); // the nearest integer smaller than this number

        int MyMax = Gun20._01_JavaMethod.enbBul(a, b);  // I created my own function and called.


    }
}
