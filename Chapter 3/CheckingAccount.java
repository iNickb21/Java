public class CheckingAccount
{
    private int accId; 
    private double bal;
    private double minBal;
     public CheckingAccount()
    {
        accId = 0;
        bal = 0;
        minBal = 200.00;
    }
    
    public CheckingAccount(int a, double b, double m)
    {
        accId = a;
        bal = b;
        minBal = m;
    }
    
    public int getAccountId()
    {
       return accId;    
    }
    public void setAccountIdId(int a)
    {
       accId = a;
    }
    public double getBalance()
    {
       return bal;    
    }
    public void setBalance(double b)
    {
       bal = b;
    }
    public double getMinBalance()
    {
       return minBal;    
    }
    public void setMinBalance(double b)
    {
       minBal = b;
    }
    
}
