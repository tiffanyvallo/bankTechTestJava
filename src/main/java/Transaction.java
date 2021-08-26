import java.time.LocalDate;

public class Transaction {

    public LocalDate date = LocalDate.now();
    public float credit = 0;
    public float debit = 0;
    public float currentBalance = 0;

    public Transaction(LocalDate date, float credit, float debit, float currentBalance) {
        this.date = date;
        this.credit = credit;
        this.debit = debit;
        this.currentBalance = currentBalance;
    }
}
