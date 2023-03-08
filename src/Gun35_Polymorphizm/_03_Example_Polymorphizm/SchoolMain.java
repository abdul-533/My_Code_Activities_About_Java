package Gun35_Polymorphizm._03_Example_Polymorphizm;

public class SchoolMain {
    public static void main(String[] args) {

        SchoolArea student1 = new Student("Ali", "Alizada", "Master", "5.ci sube");
        SchoolArea worker1 = new S_Worker("Murat", "Boz", "sanatci", "Muzikden");

        IdentityDocumentForm(student1);
        IdentityDocumentForm(worker1);


        System.out.println("*************************************************");

        Student student2 = new Student("Orxan", "Alizada", "Fizik", "8A");
        S_Worker worker2 = new S_Worker("Alim", "Aliyev", "Muzikci", "10C");

        SchoolArea.writeID(student2);
        SchoolArea.writeID(worker2);


    }

    public static void IdentityDocumentForm(SchoolArea schoolArea) {
        System.out.println("Information: ");
        System.out.println(schoolArea);
        if (schoolArea instanceof Student)
            System.out.println(((Student) schoolArea).getBranch());
        if (schoolArea instanceof S_Worker)
            System.out.println(((S_Worker) schoolArea).getDepartament());


    }

}
