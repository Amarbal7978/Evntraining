import java.io.Bufferedreader;
import java.io.inputstreamreader;
import java.io.IOException;
public class Bufferedreaderex
{
    public static void main (String args[])throwsIOException
    {
        Bufferdreader br=new(new inputstreamreader(System.in))
        System.out.println("enter your name");
        String name=br.readline();
        System.out.println("enter your age");
        int age=integer.parseint(br.readline());
        System.out.println("hello"+name+"you are "+ age + "years old");
        br.close();
    }
}