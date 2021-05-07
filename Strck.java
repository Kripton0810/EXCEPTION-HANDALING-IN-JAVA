import java.util.*;
class StringMismatchException extends Exception
{
    public StringMismatchException(String msg)
    {
        super(msg);
    }
}
public class Strck
{
    public static void main(String asd[])throws StringMismatchException
    {
        Scanner in = new Scanner(System.in);
        String ans;
        System.out.println("Enter The String");
        ans=in.next();
        if(ans.equalsIgnoreCase("Bipin"))
        {
            System.out.println("Successfull !!!! *_*");
        }
        {
            throw new StringMismatchException("Worng String ;__;");
        }
    }
}
