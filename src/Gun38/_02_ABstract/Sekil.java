package Gun38._02_ABstract;

public abstract class Sekil {
    private  String name;
    abstract double Alan(); //soyut
    abstract double Cevre(); //soyut

    public void Cizm(){
        System.out.println(name+" isimli sekil ciildi");
    }

    @Override
    public String toString() {
        return "Sekil{" +
                "name='" + name + '\'' +
                "alan" +Alan()+" "+
                "cevre"+Cevre()+" "+
                '}';
    }

    public Sekil(String name) {
        setName(name);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
