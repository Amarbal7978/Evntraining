class Searchelement
{
    public static void main(String args[])
    {
        int arr[]={20,56,7,8,12};
        int length=arr.length;
        int i;
        int key=7;  
        for(i=0;i<length;i++)
        {
            if(arr[i]==key)
            {
                System.out.println(i);
            }
        }
    }
}