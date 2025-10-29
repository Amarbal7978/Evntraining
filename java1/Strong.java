 import java.util.Scanner;
  class Strong
  {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number :");
        int n=sc.nextInt();
        int sum=0;
        int i;
        int temp=n;
        int digit;
         while(n>0)
            {
                digit=n%10;
                int fact=1;
        for(i=1;i<=digit;i++)
        {
            fact=fact*i;
        }
             sum=sum+fact;  
             n=n/10; 
    }
    if(sum==temp)
    {
        System.out.println("the no. is strong");
    }
    else
    {
        System.out.println("the no. is not strong");
    }
    sc.close();
    }
}