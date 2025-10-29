class Arraylist5
{
    public static void main (String args[])
    {
        int arr[]={10,2,30,40,50};
        int length=arr.length;
        int i;
        int small=arr[0];
        for(i=1;i<length;i++)
        {
          if(arr[i]<small)
          {
        small=arr[i];
          }
        }
        System.out.println(small);
    }
}