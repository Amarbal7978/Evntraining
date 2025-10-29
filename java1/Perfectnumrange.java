import java.util.Scanner;
class Perfectnumrange
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("display 1 to 1000 all perfect number:");
        int i;
        int j;
        for(i=1;i<=1000;i++)
        {
            int sum=0;
          for(j=1;j<=i/2;j++)
          {
            if(i%j==0)
            {
            sum += j;
          }
        }
          if((sum==i)&&(i!=0))
          {
            System.out.println(i);
          }
        }
    }
}
