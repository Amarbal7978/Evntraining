 import java.util.Scanner;
class Automorphicrange
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("display 1 to 1000 all automorphic no.:");
        int i;
        int result;
        int digit=0;
        for(i=1;i<=1000;i++)
        {
            while(i!=0)
        {
         i=i/10;
         digit++;
        }
        int square=i*i;
          int  temp=(int)Math.pow(10, digit);
          result=square%10;
          if(i==result)
          {
            System.out.println(i);
          }
        }
        sc.close();
    }
}