
class Account {
    private int accountId;                      // Private ID: can't be changed directly
    private double balance;                     // Private Balance: protected from errors

    public Account(int accountId, double balance) {
        this.accountId = accountId;             // Sets ID when created
        this.balance = balance;                 // Sets Balance when created
    }

    public int getAccountId() {                 // Getter: lets others read the ID
        return accountId;
    }

    public double getBalance() {                // Getter: lets others see the balance
        return balance;
    }

    public void setBalance(double balance) {    // Setter: lets others update the balance
        this.balance = balance;
    }

    public double calculateServiceFee() {       // Default fee is 0
        return 0;
    }

    public void display() {                     // Prints account details clearly
        System.out.println("ID: " + getAccountId() + ", Balance: " + getBalance());
    }
}

// 2. Child Classes (They inherit from Account)
class CheckingAccount extends Account {
    public CheckingAccount(int id, double bal) { super(id, bal); }

    @Override
    public double calculateServiceFee() {       // Checking always costs 50
        return 50;
    }
}

class SavingAccount extends Account {
    public SavingAccount(int id, double bal) { super(id, bal); }

    @Override
    public double calculateServiceFee() {       // Free if over 10k, otherwise 10
        return (getBalance() > 10000) ? 0 : 10;
    }
}

class InvestmentAccount extends Account {
    public InvestmentAccount(int id, double bal) { super(id, bal); }

    @Override
    public double calculateServiceFee() {       // Fee is 2% of the balance
        return getBalance() * 0.02;
    }
}

// 3. Main Program Class
public class Main {
    public static void main(String[] args) {
        // Create an array to hold 6 different accounts
        Account[] accounts = new Account[6];
        accounts[0] = new CheckingAccount(101, 5000);
        accounts[1] = new SavingAccount(102, 12000);
        accounts[2] = new InvestmentAccount(103, 7000);
        accounts[3] = new CheckingAccount(104, 3000);
        accounts[4] = new SavingAccount(105, 8000);
        accounts[5] = new InvestmentAccount(106, 15000);

        // Run the math methods
        double total = calculateTotal(accounts);
        int maxId = findMaxBalanceAccountId(accounts);
        int minId = findMinBalanceAccountId(accounts);
        double average = calculateAverageBalance(accounts);

        // Print the results to the screen
        System.out.println("Total Balance is: " + total);
        System.out.println("Max Account ID: " + maxId);
        System.out.println("Min Account ID: " + minId);
        System.out.println("Average Balance is: " + average);

        // Count how many of each type we have
        System.out.println("Checking Accounts: " + countAccountTypes(accounts, "Checking"));
        System.out.println("Saving Accounts: " + countAccountTypes(accounts, "Saving"));
        System.out.println("Investment Accounts: " + countAccountTypes(accounts, "Investment"));
    }

    // MATH METHODS:
    public static double calculateTotal(Account[] accounts) {
        double total = 0;
        for (Account a : accounts) total += a.getBalance(); // Adds up every balance
        return total;
    }

    public static int findMaxBalanceAccountId(Account[] accounts) {
        Account max = accounts[0];
        for (Account a : accounts) {
            if (a.getBalance() > max.getBalance()) max = a; // Finds the highest balance
        }
        return max.getAccountId();
    }

    public static int findMinBalanceAccountId(Account[] accounts) {
        Account min = accounts[0];
        for (Account a : accounts) {
            if (a.getBalance() < min.getBalance()) min = a; // Finds the lowest balance
        }
        return min.getAccountId();
    }

    public static double calculateAverageBalance(Account[] accounts) {
        return calculateTotal(accounts) / accounts.length; // Math for average
    }

    public static int countAccountTypes(Account[] accounts, String type) {
        int count = 0;
        for (Account a : accounts) {
            // Uses 'instanceof' to see what kind of account it is
            if (type.equals("Checking") && a instanceof CheckingAccount) count++;
            if (type.equals("Saving") && a instanceof SavingAccount) count++;
            if (type.equals("Investment") && a instanceof InvestmentAccount) count++;
        }
        return count;
    }
}