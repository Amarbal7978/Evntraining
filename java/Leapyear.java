 import java .util.Scanner;
 class Leapyear
 {
    public static void main(String args[])
    {
     Scanner sc=new Scanner (System.in);
     System.out.println("enter a year :");
     int yr=sc.nextInt();
     if ((yr%4==0)||(yr%400==0)&&(yr%100!=0))
     {
        System.out.println("the year is Leap year");
     }
      else 
    {
        System.out.println("the year is not a Leap year");
    }
    }
}
