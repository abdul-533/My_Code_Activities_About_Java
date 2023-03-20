package Gun44;

public class _07_Soru6 {
    public static void main(String[] args) {
        int num1[] = {1, 2, 3};
        int num2[] = {1, 2, 3, 4, 5};

        num2 = num1;  // Referans tiplerde num 1 in deyerini gosterir ve num2 bosh hafiza bolgesi olur
        for (int a : num2)
            System.out.print(a + ":");

// dizi esitlemelerinde referans tip olduqu icin artik diyerinin pointini gosterir/
    }
}
