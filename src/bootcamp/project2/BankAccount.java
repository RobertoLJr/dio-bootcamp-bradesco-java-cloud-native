package bootcamp.project2;

public class BankAccount {
    private final int accNumber;
    private String accAgency;
    private String accOwner;
    private double accBalance;


    public BankAccount(String accAgency, String accOwner, double accBalance) {
        this.accNumber = 0;
        this.accAgency = accAgency;
        this.accOwner = accOwner;
        this.accBalance = accBalance;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public String getAccAgency() {
        return accAgency;
    }

    public void setAccAgency(String accAgency) {
        this.accAgency = accAgency;
    }

    public String getAccOwner() {
        return accOwner;
    }

    public void setAccOwner(String accOwner) {
        this.accOwner = accOwner;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public void makeDeposit(double amount) {
        this.accBalance =+ amount;
    }

    public void withdrawAmount(double amount) {
        if (this.accBalance >= amount) {
            this.accBalance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}
