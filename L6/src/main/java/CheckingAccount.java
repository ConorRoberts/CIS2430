
public class CheckingAccount extends BankAccount {
    private static double transfactionFee = 1.0;

    /**
     * default constructor
     */
    public CheckingAccount(double num) {
        super(num);
    }

    @Override
    public void deposit(double num){
        setBalance(getBalance()+num-transfactionFee);
    }

    @Override
    public void withdraw(double num) throws AccountException{
        validateAmount(num,this.getBalance());
        setBalance(getBalance()-num-transfactionFee);
    }

    public void deductFee() throws AccountException{
        validateAmount(transfactionFee,this.getBalance());
        setBalance(getBalance()-transfactionFee);
    }
}
