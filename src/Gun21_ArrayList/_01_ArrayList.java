package Gun21_ArrayList;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {
        int[] array = new int[5]; //Ex:
        ArrayList<Integer> integerl_List = new ArrayList<>();
        ArrayList<String> string_List = new ArrayList<>();
        ArrayList<Double> double_List = new ArrayList<>();

        ArrayList<String> names = new ArrayList<>();
        System.out.println("Names = " + names);

        names.add("Ahmet");
        names.add("Metin");
        names.add("Hacer");
        names.add("Aynur");
        System.out.println("Names = " + names);
        System.out.println("names.size() = " + names.size());
        names.add(1, "Muhammed");
        System.out.println("Nammes = " + names);

        names.set(1, "Zafer");
        System.out.println("Names = " + names);

        boolean have = names.contains("Metin");
        System.out.println("isThere = " + have);

        names.remove("Metin");
        System.out.println("isimler = " + names);

        names.remove(1);
        System.out.println("isimler = " + names);

        int indexofAynur = names.indexOf("Aynur");
        System.out.println("IndexofAynur = " + indexofAynur);

        String firstElement = names.get(0);
        System.out.println("ilkEleman = " + firstElement);

        names.clear();
        System.out.println("Names = " + names);


    }
}
