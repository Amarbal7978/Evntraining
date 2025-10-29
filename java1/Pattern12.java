
class Pattern12
{
    public static void main(String args[])
    {
        int n=5;
        int i=0;
        int j=0;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if (i==1||j==1||i==n||j==n)
                {
                    System.out.print("*");
                }
                else
                {
                   System.out.print(" ");
                }
            }
            System.out.println();
        }
}
}