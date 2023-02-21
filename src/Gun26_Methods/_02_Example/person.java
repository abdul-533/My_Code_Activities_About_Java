package Gun26_Methods._02_Example;

public class person {

    String name;
    String surname;
    int age;
    public void WriteInformation(){
        System.out.println("cal1 = " + name);
        System.out.println("cal1 = " + surname);
        System.out.println("cal1 = " + age);


    }


    public String toString() {

        return name+", "+surname+", "+age+" age";
    }
    public void getBirthYear(){
        
        int bYear=2022-age;
        System.out.println("Birthday year = " + bYear);
        
    }
    public String getBirthday2(){

        return "Birthday year= "+(2022-age);
    }
    public  void getInitials(){

        System.out.println("Abbreviated name: "+ name.charAt(0)+". "+surname.charAt(0)+".");


    }
}
