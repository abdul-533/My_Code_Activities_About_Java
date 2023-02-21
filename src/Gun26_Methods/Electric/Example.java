package Gun26_Methods.Electric;

public class Example {
/*      Example:
        Step 1: Define a class named Customer (fields: name).
        Step 2: Electricity Account named (fields: total Consumption(int), unitPrice(double),
                 Define invoice(double)) class
        Step 3: Add an Electricity Account to the customer.
        Step 4 : Create 1 customer,
        Step 5: Write a method to collect the energy consumed by the customer every month.
                 Let the consumption Add collect every given monthly figure and save it.
        Step 6: Calculate and print the amount to be paid by multiplying the total consumption by the rate (0.7).

        Tip : After creating the account, add 2.3 months of consumption to the Add Consumption method,
                then subtract by sum */

    public static void main(String[] args) {


        Customer cus1 = new Customer();

        cus1.name = "Ali Alizada";

        cus1.electricityAccount = new ElectricityAccount();
        cus1.electricityAccount.addConsumption(50);
        cus1.electricityAccount.addConsumption(60);
        cus1.electricityAccount.addConsumption(70);


        cus1.electricityAccount.writeInvoice(cus1.name);


    }
}
