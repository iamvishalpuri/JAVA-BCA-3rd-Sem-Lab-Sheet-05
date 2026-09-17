/** Q8: Bank Account — Encapsulation, this and Local Variable */
public class BankAccountMain {
    static class BankAccount {
        private String accountNo;
        private String accountHolderName;
        private double balance;

        BankAccount(String accountNo, String accountHolderName, double balance) {
            this.accountNo = accountNo;
            this.accountHolderName = accountHolderName;
            this.balance = balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        public boolean withdraw(double amount) {
            boolean success = false;
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                success = true;
            }
            return success;
        }

        public double getBalance() {
            return balance;
        }

        public void displayAccount() {
            System.out.println(accountNo + " | " + accountHolderName + " | Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("AC1001", "Vishal", 1000.0);
        account.deposit(500.0);
        boolean withdrawn = account.withdraw(2000.0);
        System.out.println("Withdraw successful: " + withdrawn);
        System.out.println("Current Balance: " + account.getBalance());
        account.displayAccount();
    }
}
