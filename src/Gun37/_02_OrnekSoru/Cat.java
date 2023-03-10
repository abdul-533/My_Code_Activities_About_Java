package Gun37._02_OrnekSoru;

public class Cat extends TemelHayvan implements IAnimal{


    public Cat(String turu, String mizach, String genelRengi, double genelKilosu) {
        super(turu, mizach, genelRengi, genelKilosu);
    }

    @Override
    public String food() {
        return "Kis-Kis Yiyor";
    }
}
