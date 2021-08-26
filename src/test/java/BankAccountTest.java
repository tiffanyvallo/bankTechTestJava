import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Bank Account")
public class BankAccountTest {
    @Test
    @DisplayName("can create an account with zero balance")
    void testCanCreateABlankAccount(){
        BankAccount bankAccount = new BankAccount();
        assertEquals(0, bankAccount.balance);
    }
}
