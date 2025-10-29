import java.util.Scanner;
class Centuryleapyr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a year :");
        int yr=sc.nextInt();
        if ((yr%400==0)||(yr%4==0)&&(yr%100==0))
        {
            System.out.println("it is a centuryleap yr");
        }
        
    }
}