public  class StringBufferExample
{
    public static void main(String args[])
    {
        StringBuffer sb=new StringBuffer ("Hello");
        sb.append(" World");
        System.out.println("after append: " + sb);

        sb.insert(5," Java");
        System.out.println("after insert: " + sb);

        sb.replace(6,10,"programming");
        System.out.println("after replace: " + sb);

        sb.delete(5, 15);
        System.out.println("after delete: " + sb);

        sb.reverse();
        System.out.println("after reverse: " + sb);
    }
}