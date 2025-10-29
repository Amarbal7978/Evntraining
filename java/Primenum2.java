import java.util.Scanner;
class Primenum2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int i;
        int sum=0;
        int j;
        
        for(i=1;i<n;i++)
        {
            int flag=0;
            for( j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=1;
                    break;
                }
            }
        if(flag==0)
        {
        System.out.println(i);
        sum=sum+i;
        }
     }
     System.out.println("sum"+ sum);
}
}