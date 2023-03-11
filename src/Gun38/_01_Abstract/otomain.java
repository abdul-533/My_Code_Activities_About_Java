package Gun38._01_Abstract;

public class otomain {
    public static void main(String[] args) {

        // referans tip  ...nesne tipi
        Ford fr = new Ford("Mustang", 1995, 4); // ford normal class nesne olusturula bilir
        // IBinekOtu ib=new IBinekOtu();  interfacelerden nesne olushturulamaz sadece referan ola bilir
        BinekOtu binekOtu = new Ford("Mustang", 1995, 4); // boyle tanimlana bilir
        //  BinekOtu bo=new BinekOtu(); // bundan da nesne olushturulamaz icinde icibosh metodlar var sadece referans alabilir


        //Somut Class       Soyut(abstract) Class      Interface
        //tamamı dolu        kısmi dolu                metodlar bos
        //def const var      const olabilir            const olamaz
        //new yapılabilir    new olamaz                new olamaz
        //access modify var  access modify var         public-def
        //tamamen somut      kısmi somut               tamamen soyut

    }
}
