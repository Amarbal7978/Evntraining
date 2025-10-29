class Arraylist6
{
    public static void main (String args[])
    {
        int arr1[]={10,20,30,40,50};
        int length=arr1.length;
        int[] arr2=new int[length];
        int i;
        int j=0;
        for(i=length-1;i>=0;i--)
        {
        arr2[j]=arr1[i];
        System.out.println(arr2[j]);
        j++;
        }
      
    }
}