package Gun15_Nested_Loop;

public class _02_JavaNestedLoop {
    public static void main(String[] args) {
        //Questiom:  multiplication table making up to 5.
        // Ex:
        // 2x1=2
        // 2x2=4
        //...

        for (int j = 1; j <= 5; j++) {
            System.out.println("\r");
            for (int i = 1; i <= 10; i++) {
                System.out.println(j + "x" + i + "=" + (j * i));
            }
            System.out.println();
        }


    }
}
