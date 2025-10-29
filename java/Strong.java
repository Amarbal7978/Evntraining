 import java.util.Scanner;
class Strong
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :");
        int n=sc.nextInt();
        int fact=1;
        int sum=0;
        int i;
        int count;
        for(i=1;i<=n;i++)
        {
            while(n>0)
            {
                sum=sum+(n%10);
                count=n/10;
                count++;
                 fact=fact*i;
               break;
            }
             sum=sum+fact;
        }
    if(sum==n)
    {
        System.out.println("the no. is strong");
    }
    else
    {
        System.out.println("the no. is not strong");
    }
    }
}