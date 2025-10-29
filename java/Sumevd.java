import java.util.Scanner;
class Sumevd
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a no.");
      int n=sc.nextInt();
      int sumE=0;
      while(n>0)
      {
        if (n%2==0)
        sumE=sumE+(n%10);
        n=n/10;
      }
      System.out.println("the sum of even digit is :"+ sumE);
    }
}