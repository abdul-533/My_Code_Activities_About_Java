package Gun47;

import java.util.ArrayList;
import java.util.List;

public class _05_Soru28 {
    public static void main(String[] args) {

        List colors=new ArrayList();
        colors.add("Green");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");
        colors.remove(2);
        colors.add(3,"cyan"); // burda sonun aekleme yapdiqi icin kabul eder amma 4 ve fazla olarsa PATLAR
        System.out.print(colors);




    }
}
