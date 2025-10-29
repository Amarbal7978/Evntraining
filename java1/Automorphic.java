 import java.util.Scanner;
class Automorphic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :");
        int n=sc.nextInt();
        int digit=0;
        int result;
        while(n!=0)
        {
         n=n/10;
         digit++;
        }
         int square=n*n;
          int  temp=(int)Math.pow(10,digit);
          result=square%10;
          if(n==result)
          {
            System.out.println("it is a automorphic no.");
          }
          else 
          {
             System.out.println("it is  not a automorphic no.");
          }
}
}