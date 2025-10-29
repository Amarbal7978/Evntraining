import java.util.Scanner;
class Voting
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter your age"); 
      int age=sc.nextInt();    
      if(age>=18) 
      {
        System.out.println("this person is alligible for votting");
      }                                                            
      else
      {
         System.out.println("this person is not alligible for votting");
      }
      sc.close();           
    }
}