package Gun27_Class_Examples._01_Example1;

public class JavaStatic_and_NonStatic_Methods {
    public static void main(String[] args) {
        int number= 345;
        String strNumber = String.valueOf(number);
        int intNumber = Integer.parseInt(strNumber);

        Utility ut = new Utility();

        String strNumber2 = ut.getString(number);


        String strNumber3 = Utility.getString2(number);

        System.out.println("strNumber3 = " + strNumber3);


    }
}
