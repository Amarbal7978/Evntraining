class A extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}
public class ThreadExample1
{
    public static void main(String args[])
    {
        A t1=new A();
        A t2=new A();
         A t3=new A();
         t1.setName("Thread 1");
         t2.setName("Thread 2");
         t3.setName("Thread 3");

           t1.setPriority(2);
           t2.setPriority(6);
           t3.setPriority(7);
           t1.start();
           t2.start();
           t3.start();
    }
}