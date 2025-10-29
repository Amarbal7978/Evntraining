class Pattern11
{
    public static void main(String args[])
    {
        int i;
        int star;
        int space=1;
        for(i=1;i<=5;i++)
        {
          for(space=1;space<=5-i;space++)  
          {
             System.out.print(" ");
          }
            for(star=1;star<=(2*i-1);star++)
             {
                System.out.print("*");
             }
          System.out.println(" ");
        }
 }
}
