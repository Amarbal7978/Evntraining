import java.util.Scanner;
class Compoundintrest
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
        int ci;
          ci=P*((1+R/100)^T)-P;
        System.out.println("the compound intrest is:" + ci);
    }
}