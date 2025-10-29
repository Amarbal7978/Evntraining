 import java.util.Scanner;
class Disarium
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :");
        int n=sc.nextInt();
        int r;
        int temp=n;
        int count=0;
              while(temp!=0)
              {
                temp=temp/10;
                count++;
              }
              temp=n;
              int rem,sum=0;
              while(temp!=0)
              {
                rem=temp%10;
                sum+=(int)Math.pow(rem,count);
                count--;
                temp/=10;
              }
        if(sum==n)
        {
            System.out.println("the no. is disarium");
        }
        else 
        {
             System.out.println("the no. is  not disarium");
        }
    }
}