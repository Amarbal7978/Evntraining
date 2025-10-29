import java.util.Scanner;
class Armstrurange
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int sum=0;
        int digit=0;
        int t=n;
        int i;
        int j;
        for(i=100;i<n;i++)
        {
        while(t!=0)
         {
         for(j=101;j<i;j++)
         {
         {
            if(i%j==0)
            t=t/10;
            digit++;
         }
         System.out.println("no. of digit"+ digit);
         t=n;
         while(t!=0)
         {
            int r=t%10;
            sum=sum+ (int)Math.pow(r,digit);
            t=t/10;
         }
        }
    }
    }
         if (sum==n)
         {
            System.out.println("the no. is armstrong");
         }
         else
         {
            System.out.println("the no. is not armstrong");
         }
    }
}