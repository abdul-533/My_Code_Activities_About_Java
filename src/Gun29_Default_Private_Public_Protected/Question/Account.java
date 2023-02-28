package Gun29_Default_Private_Public_Protected.Question;

public class Account {
    private int deposited = 0;
    private int withdrawn = 0;
    private int balance = 0;

    void depositMoney(int money) {
        deposited += money;
        balance += money;

    }

    void withdrawMoney(int money) {
        withdrawn = withdrawn + money;
        balance = balance - money;


    }

    void WriteBalance() {

        System.out.println("Balance = " + balance);

    }

    public void TotalDeposited() {
        System.out.println("Deposited = " + deposited);
    }

    public void TotalWithdrawn() {
        System.out.println("Withdrawn = " + withdrawn);
    }

    @Override
    public String toString() {
        return "Account{" +
                "Deposited" + deposited +
                ", Withdrawn=" + withdrawn +
                ", BAlance=" + balance +
                '}';
    }
}
