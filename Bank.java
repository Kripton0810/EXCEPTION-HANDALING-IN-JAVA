import java.util.*;
class LessBalanceException extends Exception
{
    public LessBalanceException(double bal)
    {
        System.out.println("Withdrawing "+bal+" is invalid");
    }
}
class Account
{
    int accno;
    double bal;
    String name;
    static int count=0;
    Account(int accno,String name,double bal)
    {
        System.out.println("***New Account Created***");
        System.out.println("Accno :: "+accno);
        this.accno = accno;
        System.out.println("Accno Name:: "+name);
        this.name = name;
        System.out.println("Accno :: "+bal);
        this.bal = bal;
        count++;
        System.out.println("Total Account is:: "+count);
    }
    void diposit(double amt)
    {
        System.out.println("Accno:: "+accno);
        System.out.println("Accno Name:: "+name);
        System.out.println("Old Bal:: "+bal);
        bal=bal+amt;
        System.out.println("New Bal:: "+bal);
        System.out.println("***** Tranx Compleated *****");
    }
    void withdraw(double amt)throws LessBalanceException
    {
        if(bal-amt<500)
        {
            throw new LessBalanceException(amt);
        }
        System.out.println("Accno:: "+accno);
        System.out.println("Accno Name:: "+name);
        System.out.println("Old Bal:: "+bal);
        bal=bal-amt;
        System.out.println("New Bal:: "+bal);
        System.out.println("***** Tranx Compleated *****");
    }
    void balance()
    {
        System.out.println("=============== Account Info ===============");
        System.out.println("Accno:: "+accno);
        System.out.println("Accno Name:: "+name);
        System.out.println("Acc Bal:: "+bal);
        System.out.println("***** Tranx Compleated *****");
        
    }
}
public class Bank
{
    static int i=0;
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        Account obj[] = new Account[10];
        int accno;
        String name="";
        int ch;
        int flag=0;
        double bal;
        int I;
        while(true)
        {
            flag=0;
            System.out.println("Enter option:: \n1)Create Acc \n2)Deposit \n3)Withdraw \n4)Balance \n5)Exit");
            ch=in.nextInt();
            switch(ch)
            {
                case 1:
                System.out.print("Enter the Accno::> ");
                accno = in.nextInt();
                System.out.print("Enter the Accno Holder Name:> ");
                name=in.next();
                System.out.print("Enter the Opening balance:> ");
                bal=in.nextDouble();
                if(bal<500)
                {
                    System.out.println("Cannot create acc less the 500/-");
                }
                else
                {
                    obj[i]=new Account(accno,name,bal);
                    i++;
                }
                break;
                case 2:
                System.out.println("Enter the accno:: ");
                accno = in.nextInt();
                for(I = 0;I<i;I++)
                {
                    if(accno==obj[I].accno)
                    {
                        break;
                    }
                }
                if(I<i)
                {
                    System.out.println("Enter the Deposit Amt:: ");
                    bal =  in.nextDouble();
                    obj[I].diposit(bal);
                }else
                {
                    System.out.println("Invalid Account!!");
                }
                break;
                case 3:
                System.out.println("Enter the accno:: ");
                accno = in.nextInt();
                for(I = 0;I<i;I++)
                {
                    if(accno==obj[I].accno)
                    {
                        break;
                    }
                }
                if(I<i)
                {
                    System.out.println("Enter the Withdraw Amt:: ");
                    bal =  in.nextDouble();
                    try
                    {
                    obj[I].withdraw(bal);
                }catch(LessBalanceException e)
                {
                    
                }
                }else
                {
                    System.out.println("Invalid Account!!");
                }
                break;
                case 4:
                System.out.println("Enter the accno:: ");
                accno = in.nextInt();
                for(I = 0;I<i;I++)
                {
                    if(accno==obj[I].accno)
                    {
                        break;
                    }
                }
                if(I<i)
                {
                    obj[I].balance();
                }else
                {
                    System.out.println("Invalid Account!!");
                }
                break;
                case 5:
                System.exit(1);
                default:
                System.out.println("Error in Choice!!!");
            }
        }
        
    }
}