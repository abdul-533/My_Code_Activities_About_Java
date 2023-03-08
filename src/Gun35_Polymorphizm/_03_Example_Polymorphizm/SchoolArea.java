package Gun35_Polymorphizm._03_Example_Polymorphizm;

public class SchoolArea {
    private String name;
    private String surname;
    private String task;

    public SchoolArea(String name, String surname, String task) {
        setName(name);
        setSurname(surname);
        setTask(task);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public static void writeID(SchoolArea entered) {

        System.out.println("******ID information******");
        System.out.println("Name = " + entered.getName());
        System.out.println("Surname = " + entered.getSurname());
        System.out.println("Task = " + entered.getTask());
        if (entered instanceof Student)
            System.out.println("Branch = " + ((Student) entered).getBranch());
        else if (entered instanceof S_Worker)
            System.out.println("Department = " + ((S_Worker) entered).getDepartament());


    }
}
