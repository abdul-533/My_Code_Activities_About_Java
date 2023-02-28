package Gun29_Default_Private_Public_Protected.Question;

public class Bank {
    //Question:
    // Account (deposit(int), withdraw(int), balance(int))
    // Customer (accountID(int), first name, last name, CustomerAccount(account type))
    // Define 1 customer for a bank application,
    // deposit 100 TL and 200 TL respectively into the customer's account, then withdraw 50 TL.
    // Print the customer's total deposit, total withdrawal and remaining balance.
    // Check that money cannot be directly assigned to the balance.

    public static void main(String[] args) {

        Customer m1 = new Customer();
        m1.accountId = 1;
        m1.name = "Ali";
        m1.surname = "Alizada";
        m1.CustomerAccount = new Account();
        // m1.CustomerAccount.WriteBalance();
        m1.CustomerAccount.depositMoney(300);
        m1.CustomerAccount.depositMoney(200);

        m1.CustomerAccount.withdrawMoney(200);
        m1.CustomerAccount.withdrawMoney(300);
        m1.CustomerAccount.depositMoney(100);

        System.out.println("Customer Account = " + m1.CustomerAccount);


    }
}
