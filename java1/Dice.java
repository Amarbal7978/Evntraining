class Dice
{
    public static void main(String args[])
   {
    int i;
    int j;
    int k;
    int count=0;
      for(i=1;i<=6;i++)
      {
        for(j=1;j<=6;j++)
        {
            for(k=1;k<=6;k++)
            {
             System.out.println(i+" "+ j +" "+ k +" ");
             count++;
            }
        }
      }
      System.out.println("count"+count);
}
}