import java.util.Scanner;
class Nestedif
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in)
System.out.println("enter a number :");
int num=sc.nextInt();
if(num%3==0)
{  
  if(num%6==0)
{
  if(num%9==0)
{
System.out.println("the number is divisible by 9 ");
System.out.println("the number is divisible by 6 ");
}
else
{
System.out.println("the number is divisible by 6");
}
else if (num%9==0)
{
System.out.println("the number is divisible by 9");
}
System.out.println("the number is divisible by 3");
}
else if((num%3!=0)&&(num%6!=0)&&(num%9!=0))
{
System.out.println("the number is  not divisible by 3,6 and 9 ");
}
}
}
}










	

