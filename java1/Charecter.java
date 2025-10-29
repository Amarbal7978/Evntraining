import java.util.Scanner;
class Charecter
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System .out.println("enter 1st number");
        int a=sc.nextInt();
        System .out.println("enter 2nd number");
        int b=sc.nextInt();
        System .out.println("enter 3rd number");
        int c=sc.nextInt();
        System .out.println("enter sum cheracter");
        int s=sc.nextInt();
        System .out.println("enter  product chearcter");
        int p=sc.nextInt();
        if(s)
        {
        s=a+b+c;
        System.out.println("s" + s);
        if(product=p)
        {
        p=a*b*c;
        System .out.println("p" + p);
        }
    }
    else
    {
        System .out.println("the user is undefined");
    }
    }
}