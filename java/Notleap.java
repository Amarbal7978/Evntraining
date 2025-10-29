import java.util.Scanner;
class Notleap
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a yr :");
        int yr=sc.nextInt();
        if((yr%400!=0)||(yr%4!=0)&&(yr%100==0))
        {
            System.out.println("it is a centuryyr but not a leapyr");
        }
        else
        {
          System.out.println("it is a centuryyr  and leapyr");
        }
    }
}