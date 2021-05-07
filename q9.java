class CheckArgumentexception extends Exception
{
    public CheckArgumentexception(String msg)
    {
        super(msg);
    }
}
public class q9
{
    static void check(String arr[])throws CheckArgumentexception
    {
        if(arr.length!=5)
        {
            throw new CheckArgumentexception("CheckArgumentexception error not =5"+arr.length);
        }
        else
        {
            int i,sum=0;
            for(i=0;i<5;i++)
            {
                sum+=Integer.parseInt(arr[i]) ;
            }
            System.out.println(sum);
        }
        
    }
    public static void main(String args[])throws CheckArgumentexception
    {
        check(args);
    }
}