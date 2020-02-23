import java.util.concurrent.TimeUnit;

/*class BankAccount
{
    public int balance= 50;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance()
    {
        return balance;
    }
    public void withDraw(int amount)
    {
        balance = balance-amount;
    }
}*/

public class RyanAndMonicaJob  implements Runnable
{
    private int balance=0;
    RyanAndMonicaJob account = new RyanAndMonicaJob();

    public static void main(String[] args)
    {
        RyanAndMonicaJob theJob = new RyanAndMonicaJob();
        Thread one =new Thread(theJob);
        Thread two =new Thread(theJob);
        one.setName("Ryan");
        two.setName("Monica");
        one.start();
        two.start();
    }
    public void run()
    {
        for (int x=0;x<50;x++)
        {
            /*makeWithDraw(10);
            if (account.getBalance()<0)
                System.out.println("OverWithDraw!");*/
            increasement();
        }
        System.out.println("The balance is: "+ balance);
    }

    public synchronized void increasement()
    {
        int i=balance;
        balance=i+1;
    }

    /*private synchronized void makeWithDraw(int amount)
    {
        if (account.getBalance()>=amount)
        {
            System.out.println(Thread.currentThread().getName() + " is about to withdraw.");
            try
            {
                System.out.println(Thread.currentThread().getName() + " is about to sleep.");
                Thread.sleep(1000);
            }
            catch (InterruptedException ex)
            {
                ex.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " is about to work up.");
            account.withDraw(amount);
            System.out.println(Thread.currentThread().getName() + " have withdraw the balance.");
        }
        else
        {
            System.out.println("The balance is not enough for " + Thread.currentThread().getName());
        }
    }*/
}
