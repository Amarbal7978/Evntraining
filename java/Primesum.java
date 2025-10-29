import java.util.Scanner;
class Primesum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :");
        int n=sc.nextInt();
        int sumP=0;
        while(n>0)
    {
            for(int i=0;i<=9;i++)
        {
            if ((n%n==0)&&(n%i!=0))
            sumP=sumP+(n%10);
            n=n/10;
        }
    }
        System.out.println("the sum of prime no. is"+ sumP);
    }
}