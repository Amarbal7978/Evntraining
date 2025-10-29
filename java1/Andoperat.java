import java.util.Scanner;
class Andoperat
{
    public static void main (String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        if((n%3==0) && (n%5==0) )
        {
            System.out.println("the no. is divisible by 3 and 5");
        }
        else if ((n%3==0) || (n%5!=0))
        {
             System.out.println("the no. is  divisible by 3 but not by 5");
        }
        else if ((n%3!=0) || (n%5==0))
        {
             System.out.println("the no. is  not divisible by 5 but not by 3");
        }
        else
        {
            System.out.println("the no. is  not divisible by 3 and 5");
        }
        sc.close();
    }
}