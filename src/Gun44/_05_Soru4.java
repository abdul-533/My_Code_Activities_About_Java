package Gun44;

public class _05_Soru4 {
    public static void main(String[] args) {
        String [] strs=new String[2];


        // concat ishleminde NULL un uzerine concat yapilamiyor!
        int idx=0;
        for (String s: strs){
            strs[idx].concat("Element"+idx);
            idx++;
        } //NUL deyer bir sey eklenmezNULLPrinter exception
        for (idx = 0; idx <strs.length ; idx++) {
            System.out.println("strs[idx] = " + strs[idx]);

        }


    }
}
