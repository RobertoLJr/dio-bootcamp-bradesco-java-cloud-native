package bootcamp.project2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Print new BankAccount's details
        BankAccount newBankAccount = createNewBankAccount(sc);
        System.out.println();
        System.out.println(
                "Hello, " + newBankAccount.getAccOwner() + "! Thank you for creating your account with us. " +
                        "Your Agency Number is " + newBankAccount.getAccAgency() + ". Your Account" +
                        "Number is #" + newBankAccount.getAccNumber() + " and your current balance of $"
                        + newBankAccount.getAccBalance() + " is already available for withdraw."
        );
    }

    /**
     * Prompt the user for an Account Number, an Agency Number, a Full Legal Name and an Initial Deposit (optional),
     * then return a new instance of BankAccount.
     * @param sc The Scanner object used to read input from user.
     * @return A new BankAccount object with the user's provided data.
     */
    private static BankAccount createNewBankAccount(Scanner sc) {
        System.out.println("***** Welcome to the Hello World Bank's Account Creation System *****");

        // Get user data
        System.out.print("Please, enter your agency number: ");
        String agencyNumber = sc.nextLine();

        System.out.print("Please, enter your full legal name: ");
        String customerName = sc.nextLine();

        System.out.print("Please, enter an initial deposit amount (optional): ");
        double initialDeposit = sc.nextDouble();
        sc.nextLine();

        // Create new instance of BankAccount
        return new BankAccount(agencyNumber, customerName, initialDeposit);
    }
}
