import java .util.Scanner;
class Factorial
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :");
        int n=sc.nextInt();
        int fact=1;
        int i;
        for (i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("the factorial is : "+ fact);
    }
}