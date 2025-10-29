import java.util.Scanner;
 class  Square
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
double d = sc.nextDouble();
double s = d/Math.sqrt(2);
double area = s*s;
double p = 4*s;
System.out.println("area:"+ area);
System.out.println("perimeter:"+ p);
}
}