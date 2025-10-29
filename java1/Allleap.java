import java.util.Scanner;
class Allleap
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a yr :");
        int yr=sc.nextInt();
        if((yr%400==0)&&(yr%4!=0))
        System.out.println("it is a century yr but not a leap yr")
        System.out.println("it is a leap yr and century yr");
    }
}