package Gun19_Methods_Firs_Step;

public class _03_JavaMethod {
    public static void main(String[] args) {
        writeHello();
        writeHellotoName("Abdul");
        writeManyHello(5);

    }

    public static void writeHello() {
        System.out.println("Hello world");
        System.out.println("Hello world");

    }


    public static void writeHellotoName(String name) {
        System.out.println("Hello " + name);
    }

    public static void writeManyHello(int count) {
        int counter = 1;
        for (int i = 0; i < count; i++) {
            System.out.println(counter + ":" + " Hello");
            counter++;

        }

    }

}
