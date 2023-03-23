package Gun47._07_Soru30;

public class _01_MAin {
    public static void main(String[] args) {

        _02_MarkList obj1=new _02_MarkList(); // sadece burda yeni nesne olushur
        _02_MarkList obj2=obj1; // obj 1 in olduqu yeri gosterir, olushmaz
        _02_MarkList obj3=null; // olushmaz null deyer olan yeri gosterir
        obj3.num=60;
        _02_MarkList.graceMarks(obj2);
    }
}
