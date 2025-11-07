import java.util.Scanner;
public class Todarray2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("what is the row size:");
        int row=sc.nextInt();
        System.out.println("what is the col size:");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
       for(int i=0;i<row;i++)
    {
        for(int j=0;j<col;j++)
        {
            arr[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<col;j++)
        {
            if(i==0 || i==arr.length-1)
             System.out.print(" "+arr[i][j]);
             else
             {
               System.out.print(" " + "x"); 
             }
        }
        System.out.println();
    }
}
}