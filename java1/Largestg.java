import java.util.Scanner;
class Largestg
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter one number");
        int n1=sc.nextInt();
        System.out.println("enter 2nd number");
        int n2=sc.nextInt();
        System.out.println("enter 3rd number");
        int n3=sc.nextInt();
        if((n1>n3)&&(n1>n2))
        {
            System.out.println("the largest is n1"+ n1);
        }
        else if((n2>n3)&&(n2>n1))
        {
            System.out.println("the largest is n2"+ n2);
        }
        else
        {
            System.out.println("the largest is n3"+ n3);
        }
    }
}