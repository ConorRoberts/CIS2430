
/**
 * The SavingAccount is used to represent saving accounts.
 */
public class SavingAccount extends BankAccount {
    private static double interestRate = 0.5;

    public SavingAccount(double num) {
        super(num);
    }

    public double calculateInterestRate(){
        return getBalance() * Math.pow( 1.0 + interestRate/12.0, 12.0 * 1.0);
    }

    public void addInterest(){
        setBalance(getBalance()+calculateInterestRate());
    }
 
}
