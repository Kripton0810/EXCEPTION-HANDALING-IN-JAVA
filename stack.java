import java.util.*; 
class pushException extends Exception
{
    public pushException(String msg)
    {
        super(msg);
    }
}
class popException extends Exception
{
    public popException(String msg)
    {
        super(msg);
    }
}
public class stack
{
    private static int stack[]=new int[5];//5
    private static int top=-1;//-1
    private static void push(int n)throws pushException
    {
         if(top>=4)//n-1
         {
             throw new pushException("Overflow!!!");
            }else
            {
                top=top+1;
                stack[top]=n;
            }
    }
    private static void pop()throws popException
    {
        if(top==-1)
        {
            throw new popException("stack Underflow");
        }
        else
        {
            int temp=top;
            System.out.println("The value deleted is :"+stack[temp]);
            top=top-1;
        }
    }
    private static void display()
    {
        if(top==-1)
        {
            System.out.println("stack Underflow");
        }
        else
        {
            int temp=top,i=0;
            while(temp>=0)
            {
                System.out.println(stack[temp]);
                temp--;
            }
        }
    }
    private static void garbage()
    {
        int t=top;
        System.out.println("After deletion top+1 display: "+stack[t+1]);
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int ch,num;
        while(true)
        {
            System.out.println("Enter your choice\n1)push\t2)pop\t3)display\t4)exit");
            ch=in.nextInt();
            if(ch==1)
            {
               System.out.println("Enter the number to been pushed:");
               num=in.nextInt();
               try
               {
               push(num);
            }catch(pushException e)
            {
                System.out.println("Exception found!! "+e);
            }
            
            }
            else if(ch==2)
            {
                try
               {
               pop();
            }catch(popException e)
            {
                System.out.println("Exception found!! "+e);
            }
            }
            else if(ch==3)
            {
                display();
            }
            else if(ch==4)
            {
                break;
            }
            else
            {
                System.out.println("Wrong input");
            }
        }
    }
}
