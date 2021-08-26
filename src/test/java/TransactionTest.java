import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Transaction")
public class TransactionTest {

    @Test
    @DisplayName("has attributes when initialized")
    void testHasAttributesWhenInitialized() {
        Transaction transaction = new Transaction(LocalDate.now(),  0,0,0);
        assertEquals(0, transaction.currentBalance);
        assertEquals(0, transaction.credit);
        assertEquals(0, transaction.debit);
        assertEquals(LocalDate.now(), transaction.date);
    }
}
