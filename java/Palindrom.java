import java.util.Scanner;
class Palindrom
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :");
        int n=sc.nextInt();
        int rev=0;
        int temp=n;
        int palindrom;
        while(n>0)
        {
            rev=rev*10+(n%10);
            n=n/10;
        }
        if (rev==temp)
        {
            System.out.println("the no. is palindrome"  );
        }
        else
        {
            System.out.println("the no. is not a palindrome");
        }
    }
}