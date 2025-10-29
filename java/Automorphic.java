 import java.util.Scanner;
class Automorphic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :");
        int n=sc.nextInt();
        int square;
        while(n>0)
        {
        n=(Int) Math.square(n);
         square=n/10;
         square++;
         break;
        }
       System.out.println("square" + square);
}
}