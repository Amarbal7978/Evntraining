class Searchelement2
{
    public static void main(String args[])
    {
        int arr[]={5,6,7,5,10,11,5,5,9,6,2};
        int length=arr.length;
        int i;
        int count=0;
        int flag=0;
        int key=5;  
        for(i=0;i<length;i++)
        {
            if(arr[i]==key)
            {
                flag=1;
                if(flag==1)
                count=count+1;
            }
            }
            System.out.println("my key value is " + count + " time appears");
    }  
}