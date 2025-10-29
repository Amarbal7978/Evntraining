import java.util.Scanner;
class Prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int i;
        int flag=0;
        for(i=2;i<=n;i++)
        {
              if (n%i==0)
            {
                flag=1;
                break;
            }
        }
         if (flag==0)
         {
            System.out.println(" the no. is prime");
         }
         else
         {
           System.out.println(" the no. is not prime"  );
         }
    }
}