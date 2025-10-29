class pattern14
{
public static void main(String args[])
{
    int i;
    int j;
    for(i=1;i<=3;i++)
    {
        for(j=1;j<=3-i;j++)
        {
            if(i==1||i==2||i==3)
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