import java.util.concurrent.TimeUnit;

public class MyRunnable implements Runnable
{
    public void run()
    {
        go();
    }
    public  void go()
    {
        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }

        System.out.println("This is a test for threadsleep.");
    }

    public static void main(String[] args)
    {
        Runnable s=new MyRunnable();
        Thread thread=new Thread(s);
        thread.start();
        try {
            TimeUnit.SECONDS.sleep(5);
        }
        catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }

        System.out.println("This is a test for mainthreadsleep.");
    }
}
