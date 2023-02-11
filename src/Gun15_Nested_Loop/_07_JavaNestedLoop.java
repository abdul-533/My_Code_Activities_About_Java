package Gun15_Nested_Loop;

public class _07_JavaNestedLoop {
    public static void main(String[] args) {
        // Question: Write the program that gives the following image (only with 1 star)
        // Ex:
        //
        //       *
        //      * *
        //     * * *
        //    * * * *
        //   * * * * *

        for (int i = 1; i <= 5; i++) {
            System.out.print("      ");
            for (int a = 0; a < i; a++)
                System.out.print("\b");
            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }

            System.out.println();

        }


    }
}
