class Nextpermutation3
{
    public static void main(String atgs[])
    {
        int arr[]={4,3,2,1};
        int length=arr.length;
        int pivot=-1;
        for(int i=length-2;i>=0;i--)
        {
         if(arr[i]<arr[i+1])
         {
            pivot=i;
            break;
         }
        }
        System.out.println("pivot index is" + pivot);
        for( int i=length-1;i>=pivot;i--)
        {
            if(arr[pivot]<arr[i])
            {
                int temp=arr[i];
                arr[i]=arr[pivot];
                arr[pivot]=temp;
                break;
            }
        }
        //reverse
        int start=pivot+1;
        int end=length-1;
        while(start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
            
        }
        for(int i=0;i<length;i++)
        {
            System.out.print(" " + arr[i]);
        }
    }
}