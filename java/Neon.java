import java.util.Scanner;
class Neon
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :");
        int n=sc.nextInt();
        int square=n*n;
        int sum=0;
        while(square>0)
        {
            sum=sum+(square%10);
            square=square/10;
        }
        if (sum==n)
        {
           System.out.println("the number is neon"); 
        }
        else
        {
          System.out.println("the number is not neon");
        }
    }
}