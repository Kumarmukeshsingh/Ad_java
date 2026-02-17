package Facade;
//Provides a simple interface to a complex system.
// Real-life example

// 👉 ATM machine

// Easy to use
// ✅ Hides complexity
 

class BankAccount {
    void checkBalance() {
        System.out.println("Balance checked");
    }

    void withdrawMoney() {
        System.out.println("Money withdrawn");
    }
}

class ATMFacade {
    private BankAccount account = new BankAccount();

    public void withdrawCash() {
        account.checkBalance();
        account.withdrawMoney();
    }
}

public class Main {
    public static void main(String[] args) {
        ATMFacade atm = new ATMFacade();
        atm.withdrawCash();
    }
}
