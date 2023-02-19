package Gun24_Java_Map;

import java.util.HashMap;
import java.util.Map;

public class _03_JavaMap {
    public static void main(String[] args) {
        //Example: Make a business card application for 2 people.
        HashMap<String, String> businessCard1 = new HashMap<>();
        businessCard1.put("name", "Ugur Yilmaz");
        businessCard1.put("mail", "ugur.@gmail.com");
        businessCard1.put("address", "Cekmekoy");
        businessCard1.put("number", "050868594594");

        System.out.println("Business cart 1 = " + businessCard1.get("name"));
        System.out.println("Business cart 1.get(\"number\") = " + businessCard1.get("number"));


        HashMap<String, String> businessCard2 = new HashMap<>();
        businessCard2.put("name", "Ayshe Bayrak");
        businessCard2.put("mail", "ayshe.8@gmail.com");
        businessCard2.put("address", "Ankara");
        businessCard2.put("number", "05086845454");
        System.out.println("Business card 2 = " + businessCard2);

        HashMap<String, HashMap<String, String>> allBusinesCarts = new HashMap<>();

        allBusinesCarts.put("ugur", businessCard1);
        allBusinesCarts.put("ayshe", businessCard2);

        System.out.println("Busines Carts.get(\"u\") = " + allBusinesCarts.get("ugur"));
        System.out.println("Busines Carts.get(\"Ayshe\") = " + allBusinesCarts.get("ayshe"));

        System.out.println("kartVizitler.get(\"ayshe\").get(\"adres\") = " + allBusinesCarts.get("ayshe").get("adres"));

        // only print emails...
        for (Map.Entry<String, HashMap<String, String>> kv : allBusinesCarts.entrySet()) {
            System.out.println("kv = " + kv.getValue().get("mail"));

        }


    }
}
