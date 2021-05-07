class RangeException extends Exception
{
    public RangeException(String msg)
    {
        super(msg);
    }
}
public class Student
{
    static void marks(String str[])throws RangeException
    {
        int i=0,sum=0;
        String name="";
        for(String st : str)
        {
           if(i>=1)
           {
               int I = Integer.parseInt(st);
               if(I>50||I<0)
               {
                   throw new RangeException("Error in range <50 and >0");
                }
                else
                {
                    sum+=I;
                }
            }
            else
            {
               name=st;
            }
            i++;
        }
        System.out.println("Your name:: "+name);
        System.out.println("Your full marks is:: "+sum);
        float per = sum*100/300;
        System.out.println("The %age is:: "+per);
    }
    public static void main(String args[])throws RangeException
    {
        marks(args);
    }
}