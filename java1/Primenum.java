import java.util.Scanner;
class Primenum
{
    public static void main(String atgs[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a number :");
     int n=sc.nextInt();
     int i;
     boolean isprime=true;
     if (n<=1)
     {
        isprime=false;
     }   
     else
    {
        for (i=2;i<=Math.sqrt(n);i++)
    {
        if (n%i==0)
        {
          isprime=false;
          break;
        }
     }
    }
    if(isprime)
    {
        System.out.println(n+"is a prime number.");
    }
    else
    {
        System.out.println(n+"is  not a prime number.");
    }
    sc.close();
}
}