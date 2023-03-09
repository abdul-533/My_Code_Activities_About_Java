package Gun36._03_Interface;

// birane implamenti birden fazla klas aliyor

public class GeometriMain {
    public static void main(String[] args) {

        Cember c = new Cember();
        c.ciz(); // cember cizildi

        DikDortken d = new DikDortken();
        d.ciz(); // dikdortken cizildi

        ICizdirir c2=new Cember();
        c2.ciz(); // cember cixdiri ayni polimorfizimdeki gibi yapdi

        // Interface lerden nesne uretilme fakat referans tipi
        //olushturulabilir, bu bize Polymorfizm saqladi.

        System.out.println("*********************************");

        cizdirmeIshlemi(c);
        cizdirmeIshlemi(d);
        //direk olarak sadece Interface deki
        // ismi verilmish olanlar metodlarla erishenirsin

    }
    public static void cizdirmeIshlemi(ICizdirir cizi){
        cizi.ciz();


    }
}
