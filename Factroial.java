class IllegalArgumentException extends Exception
{
    public IllegalArgumentException(String msg)
    {
        super(msg);
    }
}
public class Factroial
{
    static long range=20;
    static long check(int i)throws IllegalArgumentException
    {
        
        if(i<0)
        {
            throw new IllegalArgumentException("Value of x must be positive");
        }else
        if(i>range)
        {
            throw new IllegalArgumentException("Result will overflow");
        }else
        {
            int k;long fu=1;
            for(k=1;k<=i;k++)
            {
                fu=fu*k;
            }
            return fu;
        }
        
    }
    public static void main(String args[])throws Exception
    {
         long arr[]=new long[5];
         int k=0;
             for (int i=-3;i<=40;i=i+5)
             {
                 arr[k]=check(i);
                 k++;
                }
    for(int i=0;i<5;i++)
        System.out.println(arr[i]);
}
}