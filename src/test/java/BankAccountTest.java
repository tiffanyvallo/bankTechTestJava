import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Bank Account")
public class BankAccountTest {
    @Test
    @DisplayName("can create an account with zero balance")
    void testCanCreateABlankAccount(){
        BankAccount bankAccount = new BankAccount();
        assertEquals(0, bankAccount.balance);
    }

    @Test
    @DisplayName("can deposit money into account")
    void testCanDepositMoneyIntoAccount(){
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(1000);
        assertEquals(1000, bankAccount.balance);
    }

    @Test
    @DisplayName("cannot deposit negative values of money into account")
    void testCannotDepositNegativeMoney(){
        BankAccount bankAccount = new BankAccount();
        assertThrows(ArithmeticException.class, () -> bankAccount.deposit(-100));
    }
}
