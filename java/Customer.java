class Bus implements Runnable
{
    int passenger;
    int available=1;
    Bus(int p)
    {
        passenger=p;
    }
    public synchronized void run()
    {
        String name=Thread.currentThread().getName();
        if(available>=passenger)
        {
            System.out.println( name + " booked the seat successfully! ");
            available=available-passenger;  
        }
        else
        {
            System.out.println("sorry " + name + "! seat is not available");
        }
    }
}
public class Customer
{
    public static void main(String args[])
    {
        Bus bus = new Bus(1);
        Thread t1=new Thread(bus , "Nishikant");
        Thread t2=new Thread(bus , "amar");
        Thread t3=new Thread(bus , "rakesh");
        t1.start();
        t2.start();
        t3.start();
    }
}