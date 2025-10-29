import java.util.Scanner;
class Ifstatement
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
int num=sc.nextInt();
if (num<0)
{
 System.out.println("the number is negative");
}
if (num>0)
{
 System.out.println("the number is positive");
}
if (num==0)
{
  System.out.println("the number is equal");
}
}
}

