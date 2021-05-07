class AgeException extends Exception
{
    public AgeException(String msg)
    {
        super(msg);
    }
}
public class q11
{
    static void Age(String nm,int age)throws AgeException
    {
        if(age<20)
        {
            throw new AgeException("Too Young");
        }else if(age>45)
        {
            throw new AgeException("Too Older");
        }else
        {
            System.out.println("Eligible");
            System.out.println("Name:: > "+nm);
        }
    }
    public static void main(String args[])throws AgeException
    {
        Age(args[0],Integer.parseInt(args[1]));
    }
}