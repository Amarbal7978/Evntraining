import java.util.Scanner;
class Armstrurange
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("armstrung no. from 1 to 1000");
       int i;
       int j;
        for(i=1;i<=1000;i++)
        {
         int sum=0;
        int digit=0;
         int t=i;
        while(t!=0)
         {
            t/=10;
            digit++;
         }
         t=i;
         while(t!=0)
         {
            int r=t%10;
            sum += Math.pow(r,digit);
            t=t/10;
         }
         if(sum==i)
         System.out.println(i);
      }    
    }
}