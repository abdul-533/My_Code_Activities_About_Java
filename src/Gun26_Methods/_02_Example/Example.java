package Gun26_Methods._02_Example;

public class Example {

    // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
    // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
    // 3- Adım : Bu degerlerı yazıdırınız.
    // 4- Adım : getBirthYear isminde Person a ait bir metod yazınız,
    //           çalıştığında kişinin doğum yılını versin.
    // 5- Adım : getInitials isminde kişinin adının ilk harfi.soyadının ilk harfi
    //           şeklinde (Büyük harf) veren metodu yazınız. örnek ahmet demir : A.D.


    public static void main(String[] args) {
        //1. Way:

        person cal1 = new person();
        cal1.name = "Ali";
        cal1.surname = "Alizada";
        cal1.age = 25;

        person cal2 = new person();
        cal2.name = "Orxan";
        cal2.surname = "Alizada";
        cal2.age = 24;


        System.out.println("cal1 = " + cal1.name);
        System.out.println("cal1 = " + cal1.surname);
        System.out.println("cal1 = " + cal1.age);

        System.out.println("cal2 = " + cal2.name);
        System.out.println("cal2 = " + cal2.surname);
        System.out.println("cal2 = " + cal2.age);

        System.out.println();

        //2 way
        WriteInformation(cal1);
        WriteInformation(cal2);

        System.out.println();

        //3. Way:
        cal1.WriteInformation();
        cal2.WriteInformation();

//        int [] array=new int[5];
//        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));
//
//        ArrayList<Integer> List=new ArrayList<>();
//
//        System.out.println("List = " + List);

        System.out.println("cal1(new)  = " + cal1);

        //4 way:

        cal1.getBirthYear();
        cal2.getBirthYear();

        System.out.println("cal1(way2) = " + cal1.getBirthday2());

        //5 step:
        cal1.getInitials();
        cal2.getInitials();

    }

    public static void WriteInformation(person cal) {

        System.out.println("cal = " + cal.name);
        System.out.println("cal = " + cal.surname);
        System.out.println("cal = " + cal.age);

    }
}
