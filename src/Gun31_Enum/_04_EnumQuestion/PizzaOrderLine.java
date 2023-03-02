package Gun31_Enum._04_EnumQuestion;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaOrderLine {
    // A pizza order line is requested.
    // User for Pizza 1-Small,2-Medium,3-Large, 4-Show
    // giving the options as a menu, giving the pizzas it gives
    // throw into an ARRAYLIST.
    // When you select Show (4), how many pizzas can you order?
    // print it in a method it gives.
    // TODO : Set the price for each pizza type and print the total price.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Pizza> orders = new ArrayList<>();

        int selection = 0;
        do {
            // menu
            menu();
            selection = scan.nextInt();

            switch (selection) {
                case 1: // small
                    Pizza sp = new Pizza(PizzaSize.SMALL);
                    orders.add(sp);
                    break;
                case 2: // medium
                    Pizza mp = new Pizza(PizzaSize.MEDIUM);
                    orders.add(mp);
                    break;
                case 3: // large
                    Pizza lp = new Pizza(PizzaSize.LARGE);
                    orders.add(lp);
                    break;
                case 4:
                    writeOrder(orders);
                    // send arraylist to a method if it chooses 4
                    // show how many orders of which pizza you have there
                    break;
            }
        } while (selection <= 4);
    }

    public static void menu() {
        System.out.println("******** Pizza Menu *******");
        System.out.println("1 - Small");
        System.out.println("2 - Medium");
        System.out.println("3 - Large");
        System.out.println("4 - Processing-Show Order");
        System.out.println("5 - Exit");
        System.out.print("Your choice=");
    }

    public static void writeOrder(ArrayList<Pizza> order) {
        int s = 0, m = 0, l = 0;

        for (Pizza p : order) {

            if (p.size == PizzaSize.SMALL) s++;
            else if (p.size == PizzaSize.MEDIUM) m++;
            else if (p.size == PizzaSize.LARGE) l++;
        }

        System.out.println("****  Your orders ****");
        System.out.println("Small Pizza Count = " + s);
        System.out.println("Medium Pizza Count = " + m);
        System.out.println("Large Pizza Count = " + l);

    }

}
