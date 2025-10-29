class MyRunnable implements Runnable
{
    public void run()
    {
        for (int i=1; i<=4; i++)
        {
            System.out.println("child thread " + i);
        }
    }
}
public class B
{
    public static void main (String args[])
    {
        MyRunnable t=new MyRunnable();
        Thread r=new Thread(t);
        r.start();
        System.out.println("Main thread is done");
    }
}