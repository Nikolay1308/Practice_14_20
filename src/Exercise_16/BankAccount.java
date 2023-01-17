package Exercise_16;

public class BankAccount {
    private String ownerName;
    private double balance;
    private int creditScore;
    private boolean isFrozen;

    public BankAccount(String ownerName, double balance, int creditScore) {
        this.ownerName = ownerName;
        this.balance = balance;
        this.creditScore = creditScore;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public boolean isFrozen() {
        return isFrozen;
    }

    public void setFrozen(boolean frozen) {
        isFrozen = frozen;
    }

    public void withdraw(double amount) {

        this.balance -=amount;
    }

    public void deposit(double amount) {
        this.balance +=amount;
    }

    public void checkBalance() {
        if (this.balance < -10000) {
            this.creditScore = this.creditScore - 10;
            System.out.println(" Your credit score = : " + this.creditScore);
        }
        if (this.balance < -50000) {
            this.isFrozen = true;
            System.out.println("Your account is frozen, your balance is = "+ this.balance);
        }
    }
}





