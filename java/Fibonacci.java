class Fibonacci
{
    public static void main(String args[])
    {
        int n=10;
        int a=0;
        int b=1;
        System.out.println(a +" "+b);
        int temp;
        int sum=0;
         while(true)
        {
         temp=a+b;
          if (temp%2==0)
         sum=sum+temp;
         if (temp>n)
         break;
         a=b;
         b=temp;
         System.out.println(" "+temp);
        }
            System.out.println("the sum of even no. is "+ sum);
    }
}