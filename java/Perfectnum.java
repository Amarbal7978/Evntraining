 import java.util.Scanner;
class Perfectnum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :");
        int n=sc.nextInt();
        int i;
        int sum=0;
        for(i=1;i<n-1;i++)
        {
            while(i>0)
            {
            if(n%i==0)
            sum=sum+i;
            break;
            }
    }
       if(sum==n)
    {
      System.out.println("it is a perfect no.");
    }
    else
    {
        System.out.println("it is not a perfect no.");
    }
}
}