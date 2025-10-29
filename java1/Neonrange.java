import java.util.Scanner;
class Neonrange
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("display 1 to 1000 all neon num:");
        int i;
        for(i=1;i<=1000;i++)
        {
            int square=i*i;
            int sum=0;
               int t=square;
           while(t!=0)
        {
            sum=sum+(t%10);
            t/=10;
        }
        if (sum==i)
        {
            System.out.println(i);
        }
        }
    }
}