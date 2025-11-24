import java.util.Scanner;
class Matrixmul
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    System.out.println("enter row1 of 1st matrix");
    int row1=sc.nextInt();
    System.out.println("enter col1 of 1st matrix");
     int col1=sc.nextInt();
     System.out.println("enter row2 of 2nd matrix");
     int row2=sc.nextInt();
     System.out.println("enter col2 of 2nd matrix");
     int col2=sc.nextInt();
     int [][] m1=new int[row1][col1];
     int [][] m2=new int[row2][col2];
     int [][] m3=new int[col1][row2];
     if(col1==row2)
     {
       System.out.println("enter the element in 1st matrix");
       for(int i=0;i<row1;i++)
       {
        for(int j=0;j<col1;j++)
        {
            m1[i][j]=sc.nextInt();
        }
       }
        System.out.println("enter the element in 2nd matrix");
       for(int i=0;i<row2;i++)
       {
        for(int j=0;j<col2;j++)
        {
            m2[i][j]=sc.nextInt();
        }
       }
       System.out.println("matrix multiplication process");
       for( int i=0;i<row1;i++)
       {
        for(int j=0;j<col2;j++)
        {
          for(int k=0;k<col1;k++)
          {
            m3[i][j]=m3[i][j]+m1[i][k]*m2[k][j];
          }
        }
       }
       System.out.println(" resultant matrix is :");
       for(int i=0;i<row1;i++)
       {
        for(int j=0;j<col2;j++)
        {
            System.out.print(" " + m3[i][j]);
        }
        System.out.println();
       }
     }
     else
     {
      System.out.println("can't multiply");
     }
}
}