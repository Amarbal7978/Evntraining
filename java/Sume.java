import java.util.Scanner;
class Sume
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter start no. :");
        int n1=sc.nextInt();
        System.out.println("enter end number :");
        int n2=sc.nextInt();
        int sumE=0;
        int i;
    for(i=n1;i<=n2;i++)
        {
          if(i%2==0)
        {
            System.out.println("even no. is "+ i );
            sumE=sumE+i;
        }
    }
        System.out.println("the sum of even no. is :" + sumE);
    }
}