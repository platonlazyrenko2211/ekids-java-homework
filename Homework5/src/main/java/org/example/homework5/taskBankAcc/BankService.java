package org.example.homework5.taskBankAcc;

public class BankService {
    public void transfer(BankAccount from, BankAccount to, double amount) {
        if (from.withdraw(amount)) {
            to.deposit(amount);
            System.out.println("Переказ успішний: " + amount);
        } else {
            System.out.println("Недостатньо коштів для переказу");
        }
    }

    public void printBalance(BankAccount account) {
        System.out.println("Рахунок " + account.getAccountNumber()
                + " баланс: " + account.getBalance());
    }
}
