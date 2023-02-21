package Gun26_Methods.Electric;

public class ElectricityAccount {
    int totalConsumption = 0;
    double unitPrice = 0.7;
    double invoice = 0;

    public void addConsumption(int monthlyConsumption) {

        totalConsumption += monthlyConsumption;
    }

    public void WriteTotalConsumption() {

        System.out.println("Total Consumption = " + totalConsumption);
    }

    public void writeInvoice(String name) {

        invoice = totalConsumption * unitPrice;

        System.out.println("*****************************");
        System.out.println("          Your Prices       ");
        System.out.println("*****************************");
        System.out.println("Customer: " + name);
        System.out.println("Total Consumption= " + totalConsumption);
        System.out.println("Total invoice= " + Math.round(invoice));
        System.out.println("******************************");
    }


}
