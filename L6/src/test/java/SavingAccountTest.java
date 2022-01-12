import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class SavingAccountTest {
    private SavingAccount sa;
    private double amount;
    @Before
    public void setUp() throws Exception {
        System.out.print(this.getClass().getCanonicalName()+ ": ");
        sa = new SavingAccount(100);
        amount = 2.0;
    }
    @Test
    public void testCalculateInterestRate() {
        System.out.println("Test Calculate Interest Rate");
        double result = sa.calculateInterestRate();
        double exResult = sa.getBalance() * Math.pow( 1.0 + 0.5/12.0, 12.0 * 1.0);
        assertEquals(exResult,result,0.0);
    }

    @Test
    public void testAddInterest() throws AccountException {
        System.out.println("Test Add Interest Rate");
        double balance = sa.getBalance();
        double interest = sa.calculateInterestRate();
        sa.addInterest();
        double result = sa.getBalance();
        double expResult = balance + interest;
        assertEquals(expResult,result,0);

    }

}