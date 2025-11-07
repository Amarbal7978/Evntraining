import java.util.Scanner;
public class Todarr8
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("what is the row size:");
        int row=sc.nextInt();
        System.out.println("what is the col size:");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        int tmp;
       for(int i=0;i<row;i++)
    {
        for(int j=0;j<col;j++)
        {
            arr[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<arr.length;i++)
        {
        int  temp=arr[i][0];
        arr[i][0]=arr[i][arr.length-1];
        arr[i][arr.length-1]=temp;
        }
    
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<col;j++)
        {
             System.out.print(arr[i][j]);
        }
        System.out.println();
    }
}
}
