import java.util.Scanner;
class Armstru
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int sum=0;
        int digit=0;
        int t=n;
        while(t!=0)
         {
            t=t/10;
            digit++;
         }
         System.out.println("no. of digit"+ digit);
    }
}