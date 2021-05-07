class AuthenticationFailure extends Exception
{
    public AuthenticationFailure(String msg)
    {
        super(msg);
    }
}
public class Username
{
    static void check(String unm,String pass)throws AuthenticationFailure
    {
        if(unm.equals("BinodKumar")&&pass.equals("Sub@2019"))
        {
            System.out.println("Successfully login!!!");
        }
        else
        {
            throw new AuthenticationFailure("username / Password Wrong!!");
        }
    }
    public static void main(String args[])throws AuthenticationFailure
    {
        check(args[0],args[1]);
    }
}