package Gun43;

public class _07_JavaCheckedveuncheckedException {
    public static void main(String[] args) {

        // Checked ve Unchecked Exception
        // Java derki yani yazılımcı bıraktığı hatalara UnChecked exception
        // Ama öyle komutlar var ki bana ait: bunları hata kontrolü yapmadan
        // yani try-catch e almadan kullanmana izin VERMEM. bu gibi hat durumlarına
        // CHECKED yani kontrol ettiğim hatalar denir.   

        String str="";
        char ilkharf=str.charAt(0); // sen bilirsin ister kulllan (try-catch)
        // bunlar :Unchecked Exception
        //amma bazi komutlar var ki try catch mutlak kullanmalisin

        try {
            Thread.sleep(1000); // bunlara try-catch mecbur:Checked Exception
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
