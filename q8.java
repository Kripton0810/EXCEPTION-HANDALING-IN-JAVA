class IllegalArgumentException extends Exception
{
    public IllegalArgumentException(String msg)
    {
        super(msg);
    }
}
public class q8
{
    static int fact(int n)throws IllegalArgumentException
    {
        if(n<0)
         throw new IllegalArgumentException("Error");
         else
        if(n==0)
         return 1;
         else
         return(n*fact(n-1));
    }
    
    public static void main(String a[])
    {
        try
        {
            int x = Integer.parseInt(a[0]);
            System.out.println(x +"! = "+fact(x));
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You must specify an argument");
        }
        catch (NumberFormatException e) {
            System.out.println("The argument you specify must be an integer");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Bad argument: " + e.getMessage( ));
        }
    }
    
}