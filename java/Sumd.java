import java.util.Scanner;
class Sumd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a  no. :");
        int n=sc.nextInt();
        int sum=0;
        while(n>0)
        {
            sum=sum+(n%10);
            n=n/10;
        }
        System.out.println("the addition of digit is :" + sum);
    }
}