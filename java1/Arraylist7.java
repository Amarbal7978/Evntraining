class Arraylist7
{
    public static void main (String args[])
    {
        int arr1[]={10,20,30,40,50};
        int length=arr1.length;
      int left=0;
      int temp;
      int right=length-1;
      while(left<right)
      {
       temp=arr1[left];
       arr1[left]=arr1[right];
       arr1[right]=temp;
       left++;
       right--;
      }
      for(int i=0;i<length;i++)
      {
        System.out.println(arr1[i]);
      }
    }
}