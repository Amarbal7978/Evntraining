import java.util.Scanner;
class Simpleintrest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter P :");
        int P=sc.nextInt();
        System.out.println("enter R :");
        int R=sc.nextInt();
        System.out.println("enter T :");
        int T=sc.nextInt();
        int si;
        {
        si=(P*R*T)/100;
        System.out.println("simpleinrest" + si );
        }
    }
}