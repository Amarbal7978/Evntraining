 import java.util.Scanner;
class Harshad
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :");
        int n=sc.nextInt();
        int sum=0;
        int count;
        while(n>0)
        {
            count=n/10;
            count++;         
            sum=sum+count;
         System.out.println("sum"+sum);
         break;
        }
       if(n%sum==0)
       {
        System.out.println("the no. is harshad");
       }
       else
       {
        System.out.println("the no. is not harshad");
       }
}
}