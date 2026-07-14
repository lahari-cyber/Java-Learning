class BankAccount {
    private double balance;
//instance variable is balance
    public void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }

        this.balance = balance;
        System.out.println("Balance updated to: " + this.balance);
    }

    public double getBalance() {
        return this.balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setBalance(5000);
        System.out.println("Current Balance: " + account.getBalance());

        // account.setBalance(-1000); // Uncomment to test exception
    }
}