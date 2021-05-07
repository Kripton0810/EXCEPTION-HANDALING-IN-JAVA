class error
{
    error(char c)throws Exception
    {
        if((c>='a' && c<='z' )||(c>='A' && c<='Z' ))
        {
            System.out.println(c);
        }
        else
        {
            throw new Exception("not a charecter");
        }
    }
}
public class q4
{
    public static void main(String args[])throws Exception
    {
        String str ="Binod12kumar";
        char ch;
        int len=str.length();
        for(int i = 0;i<len;i++)
        {
            ch = str.charAt(i);
            error obj = new error(ch);
        }
    }
}