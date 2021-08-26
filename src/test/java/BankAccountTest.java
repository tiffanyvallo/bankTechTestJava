import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Bank Account")
public class BankAccountTest {
    BankAccount bankAccount;

    @BeforeEach
    void setup(){
        bankAccount = new BankAccount();
    }

    @Test
    @DisplayName("can create an account with zero balance")
    void testCanCreateABlankAccount(){
        assertEquals(0, bankAccount.balance);
    }

    @Test
    @DisplayName("can deposit money into account")
    void testCanDepositMoneyIntoAccount(){
        bankAccount.deposit(1000);
        assertEquals(1000, bankAccount.balance);
    }

    @Test
    @DisplayName("cannot deposit negative values of money into account")
    void testCannotDepositNegativeMoney(){
        assertThrows(ArithmeticException.class, () -> bankAccount.deposit(-100));
    }


}
