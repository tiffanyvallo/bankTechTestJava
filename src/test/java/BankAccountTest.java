import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
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

    @Nested
    @DisplayName("Deposits")
    class Deposits{
        BankAccount bankAccount;
        @BeforeEach
        void setup(){
            bankAccount = new BankAccount();
        }

        @Test
        @DisplayName("can deposit money into account")
        void testCanDepositMoneyIntoAccount(){
            bankAccount.deposit(1000);
            assertEquals(1000, bankAccount.balance);
        }

        @Test
        @DisplayName("cannot deposit negative amount of money into account")
        void testCannotDepositNegativeMoney(){
            assertThrows(ArithmeticException.class, () -> bankAccount.deposit(-100));
        }
    }


    @Nested
    @DisplayName("Withdrawals")
    class Withdrawals{
        BankAccount bankAccount;

        @BeforeEach
        void setup(){
            bankAccount = new BankAccount();
            bankAccount.deposit(1000);
        }
        @Test
        @DisplayName("can withdraw money from account")
        void testCanWithdrawMoney(){
            bankAccount.withdraw(200);
            assertEquals(800, bankAccount.balance);
        }

        @Test
        @DisplayName("cannot withdraw negative amount of money into account")
        void testCannotWithdrawNegativeAmount(){
            bankAccount.deposit(100);
            assertThrows(ArithmeticException.class, () -> bankAccount.withdraw(-500));
        }
    }
}
