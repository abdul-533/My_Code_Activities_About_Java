package Gun30_Veriables._01_StaticVariables.Example1;

public class School {
    public static void main(String[] args) {
//        Oyrenci ogr1=new Oyrenci("ISemt","Timur","Yildirim okulu");
//        Oyrenci ogr2=new Oyrenci("Ali","Alizada","Yildirim okulu");
//        Oyrenci ogr3=new Oyrenci("Orxan","Alizada","Yildirim okulu");

        //...
        //..

//        Oyrenci ogr499=new Oyrenci("Ayshe","Boran","Yildirim okulu");
//        Oyrenci ogr500=new Oyrenci("Cagla,"Cavush","Yildirim okulu");


        Student std1 = new Student("Burak", "Craiser");
        System.out.println("STD1 = " + std1);
        Student.schoolName = "Ataturk ilkokulu";
        System.out.println("STD1 = " + std1);

        //Entry of the same data too many times is denied
        // Repeating separate data as many times as the number of OBJECTS in the memory is prevented
        Student std2 = new Student("Ali", "Yildirim");
        System.out.println("STD2 = " + std2);

    }
}
