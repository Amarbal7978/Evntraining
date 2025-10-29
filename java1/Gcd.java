import java.util.Scanner;
class Gcd
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter one number");
      int a=sc.nextInt();
      System.out.println("enter another number");
      int b=sc.nextInt();
      int temp;
      while(b!=0)
      {
        temp=b;
        b=a%b;
        a=temp;
      }
      System.out.println("the gcd number is :" + a );
    }
}