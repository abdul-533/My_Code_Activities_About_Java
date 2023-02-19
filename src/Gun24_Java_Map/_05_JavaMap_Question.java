package Gun24_Java_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _05_JavaMap_Question {
    public static void main(String[] args) {
        // Canlı Sözlük yapılmak isteniyor.
        //  Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        //  1- Ekleme (Bu secekte kelimenin kendisi ve manasını  yazınız)
        //  2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz.)
        //  3- Listeleme
        //  4- Arama (Bu secekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        //  5- Silme
        //  6- Çıkış

        // Question: A Live Dictionary is requested.
        // Bring a menu to the user as follows.
        // 1- Addition (In this section, write the word itself and its meaning)
        // 2- Correction (In this option, the user can correct the meaning of the word.)
        // 3- Listing
        // 4- Search (Meanings of all words starting with a given word in this section)
        // 5- Delete
        // 6- Exit
        Map<String, String> tm = new HashMap<>();
        Scanner reder = new Scanner(System.in);
        Scanner rederStr = new Scanner(System.in);
        int election = 0;

        do {
            System.out.println("Menu: 1- Adding; 2- Correction: 3-Listing: 4-Serch: 5-Deletion: 6-Exit ");

            election = reder.nextInt();

            switch (election) {
                case 1:
                    System.out.println("Write word = ");
                    String word = rederStr.nextLine();
                    System.out.println("Write the meaning of the word=");
                    String meaning = rederStr.nextLine();
                    tm.put(word, meaning);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Which  word do you want to correct? Please write: ");
                    String wordC = rederStr.nextLine();
                    System.out.println("Please write correct meaning this word: ");
                    String meaningC = rederStr.nextLine();
                    if (tm.containsKey(wordC)) {
                        tm.remove(wordC);
                        tm.put(wordC, meaningC);
                        break;
                    }
                case 3:
                    for (Map.Entry<String, String> list : tm.entrySet()) {
                        System.out.println(list.getKey() + ": " + list.getValue() + ". ");
                    }
                    if (tm.isEmpty() == true)
                        System.out.println("There is nothing...");
                    break;
                case 4:
                    System.out.println("Which word do you serch now write pleace: ");
                    String serched = rederStr.nextLine();
                    if (tm.containsKey(serched)) {
                        System.out.println(tm.get(serched));
                        break;
                    }
                case 5:
                    System.out.println("This is a deleting area, if you want to delete all write 1 and if you want to delete word then write 2= ");
                    int selection2 = reder.nextInt();
                    switch (selection2) {
                        case 1:
                            tm.clear();
                            System.out.println("All words has been deleted...");
                            break;
                        case 2:
                            System.out.println("Which word do you want to delete?");
                            String wordD = rederStr.nextLine();
                            if (tm.containsKey(wordD)) {
                                tm.remove(wordD);
                                break;
                            }


                    }
                    break;

            }

        }
        while (election != 6); //cikish olduqu surece
        //TODO geri kalan menu ellerinizden oper
        //TODO ikinci ashamada yapilicak olan ishlemleri metodla yapiniz.


    }
}
