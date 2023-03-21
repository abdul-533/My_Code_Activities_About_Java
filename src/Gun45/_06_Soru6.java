package Gun45;

public class _06_Soru6 {
    public static void main(String[] args) {
        int data[]={2010,2013,2014,2015,2014};
        int key=2014;
        int count=0;
        for (int a:data)
        {
            if (a!=key)
            {
                continue;
                //count++; // count burda olunca compile error vericek
            }
            count++; // burda ise caloishicak

        }
        System.out.println(count+" Found");
    }
}
