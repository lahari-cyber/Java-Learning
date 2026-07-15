class ATM {

    public static void main(String args[]) {

        int balance = 5000;
        int withdraw = 7000;

        try {

            if (withdraw > balance) {
                throw new ArithmeticException("Insufficient Balance!");
            }

            balance = balance - withdraw;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance = " + balance);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Thank you for using the ATM.");
    }
}
/*balance → Stores the available account balance (₹5000).
withdraw → Stores the amount to withdraw (₹7000).
try → Contains the code that may cause an exception.
if → Checks if the withdrawal amount is greater than the balance.
throw → Throws an exception with the message "Insufficient Balance!".
catch → Handles the exception and displays the error message.
getMessage() → Prints the exception message.
Last statement → Prints "Thank you for using the ATM."

Short Scenario:
The customer has ₹5000 in the account but tries to withdraw ₹7000. 
Since the balance is not enough, the program throws an exception.
 The catch block handles it and prints "Insufficient Balance!". 
 Finally, the program prints "Thank you for using the ATM."*/