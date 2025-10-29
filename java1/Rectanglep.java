import java.util.Scanner;
class Rectanglep
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length :");
        int ln=sc.nextInt();
        System.out.println("enter width :");
        int wd=sc.nextInt();
        int per;
        {
            per=2*(ln + wd);
        }
        System.out.println("the perimiter of a rectangle is :"+ per);
    }
}