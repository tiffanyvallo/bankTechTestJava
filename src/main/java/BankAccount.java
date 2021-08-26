public class BankAccount {

    public float balance = 0;

    public void deposit(float amount) {
        if (amount <= 0) {
            throw new ArithmeticException("Invalid Amount: Cannot deposit amount less than £0");
        }
        this.balance += amount;
    }
    public void withdraw(float amount) {

    }
}
