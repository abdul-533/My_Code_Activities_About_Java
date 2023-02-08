package Gun12_Random_And_Switch;

public class _01_1_JavaRandom {
    public static void main(String[] args) {
        //Math.Random()- Generates Double numbers. Produces 0 - .0.999999999/

        double rndNo = Math.random();
        System.out.println("sandSayi=" + rndNo);

        // produce between 0-6 then  multiplied by  6 Example 0-5.999999999 //convert int to 0-5
        int rndNum = (int) (Math.random() * 6);
        System.out.println("rndTamSayi = " + rndNum);

    }
}
