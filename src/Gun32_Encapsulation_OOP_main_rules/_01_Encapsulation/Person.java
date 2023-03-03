package Gun32_Encapsulation_OOP_main_rules._01_Encapsulation;

public class Person {
   private String name;
    private String surname;
    private int age;
   void  addAge(int age){

       if (age>0 && age<150)
           this.age=age;
       else
           System.out.println("Wrong age");


   }
   int giveAge()
   {
       return this.age;
   }


   void  setSurname(String surname){
       if (surname.length()<25)
           this.surname=surname;
       else
           System.out.println("Wrong surname");


   }
   String getSurname(){

       return this.surname;
   }



    void  setName(String name){
        if (name.length()<25)
            this.name=name;
        else
            System.out.println("Wrong name");


    }
   String getName(){
       return this.name;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
