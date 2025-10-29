import java.util.Scanner;
class Sumodd
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a no.");
      int n=sc.nextInt();
      int sumO=0;
      while(n>0)
      {
        if (n%2!=0)
        sumO=sumO+(n%10);
        n=n/10;
      }
      System.out.println("the sum of odd digit is :"+ sumO);
    }
}