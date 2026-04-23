package org.example.homework5.taskBankAcc;

public class Main {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("UA111", 1000);
        SavingsAccount acc2 = new SavingsAccount("UA222", 500, 0.10);

        BankService service = new BankService();

        service.transfer(acc1, acc2, 300);
        service.printBalance(acc1);
        service.printBalance(acc2);

        acc2.addInterest();

        System.out.println("Після відсотків:");
        service.printBalance(acc2);
    }
}
