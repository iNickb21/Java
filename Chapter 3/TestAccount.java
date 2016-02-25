public class TestAccount
{
    public static void main(String[] args)
    {
        CheckingAccount acc1 = new CheckingAccount(1,410.43,200);
        System.out.println("Account ID: " + acc1.getAccountId() + " Balance: " + acc1.getBalance() + " Minimum Balance: " + acc1.getMinBalance() + ".");
        CheckingAccount acc2 = new CheckingAccount(2,9123.13,200);
        System.out.println("Account ID: " + acc2.getAccountId() + " Balance: " + acc2.getBalance() + " Minimum Balance: " + acc2.getMinBalance() + ".");
    }
}