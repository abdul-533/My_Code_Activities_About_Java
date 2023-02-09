package Gun13_While_Loop_and_Do_While;

public class _05_WhileLoop {
    public static void main(String[] args) {
        // Prints the sum of numbers up to 100
        int counter = 1;
        int total = 0;
        while (counter <= 100) {
            total = total + counter;
            counter++;
        }
        System.out.println("Total=" + total);

    }
}
