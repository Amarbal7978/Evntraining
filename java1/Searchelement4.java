class Searchelement4
{
    public static void main(String args[])
    {
        int arr[]={10,20,20,30,60,60};
        int length=arr.length;
        int i;
         int l=-1;
         int s=-1;
        for(i=0;i<length;i++)
        {
           if(arr[i]>l)
           {
            s=l;
            l=arr[i];
           }
           else if(arr[i]>s && arr[i]!=l)
           {
            s=arr[i];
           } 
    }  
    System.out.println(s);
}
}