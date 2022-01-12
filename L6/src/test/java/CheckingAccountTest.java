
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class CheckingAccountTest {
    private CheckingAccount ca;
    private double amount;

    @Before
    public void setUp() throws Exception {
        System.out.print(this.getClass().getCanonicalName()+ ": ");
        ca = new CheckingAccount(100);
        amount = 2.0;
    }

    @Test
    public void testDeposit() throws AccountException {
        System.out.println("Test Deposit");
        ca.deposit(amount);
        double expResult = 101.0;
        double result = ca.getBalance();
        assertEquals(expResult,result,0);

    }

    @Test
    public void testWithdraw() throws AccountException {
        System.out.println("Test Withdraw");
        ca.withdraw(amount);
        double expResult = 97.0;
        double result = ca.getBalance();
        assertEquals(expResult,result,0);
    }

    @Test
    public void testDeductFee() throws AccountException {
        System.out.println("Test Deduct transaction fee");
        ca.deductFee();
        double exResult = 99;
        double result = ca.getBalance();
        assertEquals(exResult,result,0);
    }
}