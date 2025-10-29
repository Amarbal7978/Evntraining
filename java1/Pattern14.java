class Pattern14
{
public static void main(String args[])
{
    int i;
    int j;
    for(i=1;i<=3;i++)
    {
        for(j=1;j<=3-i;j++)
        {
            System.out.print(" ");
        }
        if (i==1)
        {
            System.out.println("*");
        }
        else if(i==3)
        {
             for(j=1;j<=2*3-1;j++)
             {
                System.out.print("*");
             }
             System.out.println();
        }
        else
        {
            System.out.print("*");
            for(j=1;j<=2*i-3;j++)
            {
                 System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
}
