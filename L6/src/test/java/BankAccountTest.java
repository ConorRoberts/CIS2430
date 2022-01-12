
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankAccountTest {
    private BankAccount theAccount;
    private BankAccount anotherAccount;
    private double amount;

    @Before
    public void setUp() throws Exception {
        System.out.print(this.getClass().getCanonicalName()+ ": ");
        theAccount = new BankAccount(100.0);
        anotherAccount = new BankAccount(100.0);
        amount = 2.0;
    }

    @Test
    public void testDeposit() throws AccountException {
        System.out.println("Test Deposit");
        theAccount.deposit(amount);
        double expResult = 102.0;
        double result = theAccount.getBalance();
        assertEquals("Test Deposit",expResult,result,0);
    }

    @Test
    public void testWithdrawOne() throws AccountException {

        System.out.println("Test Withdraw");
        theAccount.withdraw(amount);
        double expResult = 98.0;
        double result = theAccount.getBalance();
        assertEquals("Test Withdraw",expResult,result,0);
    }

    @Test(expected = AccountException.class)
    public void testWithdrawTwo() throws AccountException {

        System.out.println("Test Withdraw");
        theAccount.withdraw(amount * 100);
        double expResult = 98.0;
        double result = theAccount.getBalance();
        assertEquals("Test Withdraw",expResult,result,0);
    }


    @Test
    public void testGetBalance() {

        System.out.println("Test getBalance");
        double expResult = 100.0;
        double result = theAccount.getBalance();
        assertEquals("Test Get Balance",expResult,result,0);
    }

    @Test
    public void testTransfer() throws AccountException {

        System.out.println("Test Transfer");
        this.theAccount.transfer(100.0, this.anotherAccount);
        double result1 = theAccount.getBalance();
        double expResult1 = 0.0;
        double result2 = anotherAccount.getBalance();
        double expResult2 = 200;
        assertEquals("Test Transfer",expResult1,result1,0);
        assertEquals("Test Transfer",expResult2,result2,0);

    }

}