class Arrayassending
{
    public static void main(String args[])
    {
        int arr1[]={20,56,7,8,12};
        int length=arr1.length;
        //int[] arr2= new int[length];
        int i;
        int large; 
        int small=20;
        for(i=0;i<length;i++)
        {
            if(arr1[i]<small)
            {
                small=arr1[i];
            }
             while(small==arr1[i])
             {
                if(small>arr1[i])
                {
                    small=arr1[i];
                }
             }
        }
        System.out.println(small);
    }
}