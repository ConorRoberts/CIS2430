
/**
 * The BankAccount Class is used to represent BankAccount objects.
 */
public class BankAccount {
  
//put instance variables and instance methods here

    private double balance;

    public BankAccount(double num){
        setBalance(num);
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double num){
        balance=num;
    }

    public void deposit(double num){
        setBalance(getBalance()+num);
    }

    public void withdraw(double num) throws AccountException{
        validateAmount(num,getBalance());
        setBalance(getBalance()-num);
    }

    public void transfer(double num, BankAccount account) throws AccountException{
        validateAmount(num,getBalance());
        validateAccount(account);
        this.withdraw(num);
        account.deposit(num);
    }


/* class methods that don't use instance data can be static.  You don't have to use these methods but you may*/

    /**
     * This method is used to validate the amount with the balance
     * to ensure sufficient fund.
     * @param amount - The amount to be validated.
     */
    public static void validateAmount(final double amount, final double balance) throws AccountException{
        if (amount < 0) {
            throw new  AccountException("Invalid amount value: an amount cannot be negative");
        }
        if (amount > balance) {
            throw new  AccountException("Insufficient Funds");
        }
    }

    /**
     * This method is used to validate the account.
     * @param theAccount - The account to be validated.
     */
    public static void validateAccount(final BankAccount theAccount) throws AccountException{
        if (theAccount == null) {
            throw new AccountException("The bank account does not exist!");
        }
    }



}
