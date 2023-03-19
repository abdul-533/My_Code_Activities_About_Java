package Gun43;

public class _01_JavaException {
    public static void main(String[] args) {

        System.out.println("Program calishmaya bashladi");
        String kelime="";  // once ; koymadik bu Compile error
        char harf=kelime.charAt(3); // bu satiri en son ekledik, bu RUNTIME error
        //calishirken olushan hatalara ise Runtime deyilir

        System.out.println("Program bitdi");
        //calishmadan once olan hatalara Compiler hatalari deyilir
        // (Compile error, exception) editor (yazi) ortaminda olushur genelde
//hocam notlari:
// daha çalışmadan önce oluşmuş eksikliklerden kaynaklı hatalara
// Derleme zamanı yani COMPILE ERROR, Exception diyoruz.

//program çalıştıktan sonra çalışma zamanı içerisindeki hatalara
//çalışma zamanı yani RUNTIME ERROR, Exception diyoruz.


    }
}
