class MyThread extends Thread
{
public void run()
{
    for(int i=1; i<=5; i++)
    {
        System.out.println("child Thread");
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException ie)
        {
          System.out.println("thread is excuting");   
        }
    }
}
public static void main(String args[]) throws InterruptedException
{
    MyThread t1=new MyThread();
    t1.start();
    t1.join();
    for(int i=1; i<=3; i++)
    {
        System.out.println("Main Thread");
    }
}
}