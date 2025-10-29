class Arraylist4
{
    public static void main (String args[])
    {
        int arr[]={10,20,30,40,50};
        int length=arr.length;
        int i;
        int large=arr[0];
        for(i=1;i<length;i++)
        {
          if(arr[i]>large)
          {
        large=arr[i];
          }
        }
        System.out.println(large);
    }
}