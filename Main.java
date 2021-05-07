import java.util.*;
class ScoreException extends Exception
{
    public ScoreException(String msg)
    {
        super(msg);
    }
}
class Students
{
    int StuID;
    double score;
    public Students(int StuID,double score)throws ScoreException
    {
        if(score<0 || score>100)
        {
            throw new ScoreException("Invalid Marks");
        }
        else
        {
            this.StuID=StuID;
            this.score=score;
            System.out.println("Student ID:: "+StuID);
            System.out.println("Score "+score);
        }
    }
    void display()
    {
        System.out.println("ID:: "+this.StuID+" marks:: "+this.score);
    }
}
public class Main
{
    static int i=0;
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int ch,sid;
        double score;
        Students obj[] = new Students[10];
        while(true)
        {
            System.out.println("Enter your choice:: \n1)Input New Student \n2)Display all \n3)Exit");
            ch=in.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Enter the Student ID");
                sid= in.nextInt();
                System.out.println("Enter the Score Marks:: ");
                score = in.nextDouble();
                try
                {
                    obj[i]= new Students(sid,score);
                    i++;
                }catch(ScoreException e)
                {
                    System.out.println("Error caught "+e);
                }
                break;
                case 2:
                for(int k = 0;k<i;k++)
                {
                    obj[k].display();
                }
                break;
                case 3:
                System.exit(1);
                default:
                System.out.println("Error Input -_-");
                break;
            }
        }
    }
}