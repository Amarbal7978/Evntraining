public  class StringBuilderExample
{
    public static void main(String args[])
    {
        StringBuilder sb=new StringBuilder ("Hello");
        sb.append(" World");
        System.out.println("after append: " + sb);

        sb.insert(5," Java");
        System.out.println("after insert: " + sb);

        sb.delete(0, 6);
        System.out.println("after delete: " + sb);

        sb.reverse();
        System.out.println("after reverse: " + sb);

        int length=sb.length();
        System.out.println("length of the string"+ length);
        char a=sb.charAt(8);
        System.out.println("length "+ a);

        
    } 
}