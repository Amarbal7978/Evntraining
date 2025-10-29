class Sum
{
     public static void main(String[] args)
  {
     int n;
      int sumE=0;
     int even;
    for(n=0;n<=10;n++)
    {
    if(n%2==0)
    {
       sumE=sumE+n;
    }
   }
      System.out.println("addition of even number "+ sumE);
  }
}