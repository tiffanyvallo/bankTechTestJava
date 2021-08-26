import java.util.ArrayList;

public class BankAccount {
    private ArrayList<Float> transactionHistory = new ArrayList<>();

    public float balance = 0;

    public void deposit(float amount) {
        if (amount <= 0) {
            throw new ArithmeticException("Invalid Amount: Cannot deposit amount less than £0");
        }
        float depositedAmount = this.balance += amount;
        transactionHistory.add(depositedAmount);
    }
    public void withdraw(float amount) {
        if (amount <= 0) {
            throw new ArithmeticException("Invalid Amount: Cannot withdraw amount less than £0");
        } else if (amount > this.balance) {
            throw new ArithmeticException("Insufficient Funds: Cannot withdraw money");
        }
        float withdrawnAmount = this.balance -= amount;
        transactionHistory.add(withdrawnAmount);
    }

    ArrayList<Float> getTransactions() {
        return transactionHistory;
    }
}
