package Gun30_Veriables;

public class QuestionForDay {
    int a;
    static int b = 0;
    // we called it one, so it has only one value
    // is the last value =0;

    void increase() {
        a++;
        b++;
    }


    public static void main(String[] args) {
        QuestionForDay gs1 = new QuestionForDay();
        gs1.a = 5;

        QuestionForDay gs2 = new QuestionForDay();
        gs1.a = 7;

        // What is the value of a right now: The answer to be given here must be which value of a are you asking for
        // Here, every object has a and gs1 has 5 and gs2 has 7 values

        System.out.println("gs1 = " + gs1.a);  //5
        System.out.println("gs2.a = " + gs2.a);  //7

        // Question What is the value of b? It has only one value, it is the last value
        System.out.println("Value of b=" + QuestionForDay.b);

        gs1.increase(); // gs1.a->6, b->1;
        gs2.increase(); // gs2.a->8, b->2;
        // then the final values of a and b are matched
        System.out.println("gs2.a = " + gs2.a);
        System.out.println("gs2.a = " + gs2.a);
        System.out.println("Soru b=" + QuestionForDay.b);


    }
}
