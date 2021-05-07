import java.util.*;
class NoMatchFoundException extends Exception
{
    public NoMatchFoundException(String msg)
    {
        super(msg);
    }
}
public class q7 
{
    static void check(String str)throws NoMatchFoundException
    {
        if(str.equals("India"))
        {
            System.out.println("Delhi");
        }else
        if(str.equals("Srilanka"))
        {
            System.out.println("Colombo");
        }else if(str.equals("Pakistan"))
        {
            System.out.println("Ishlamadab");
        }else
        {
            throw new NoMatchFoundException("No capital found");
        }
    }
    public static void main(String asd[])throws NoMatchFoundException
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name of country::");
        String str=in.nextLine();
        check(str);
    }
}