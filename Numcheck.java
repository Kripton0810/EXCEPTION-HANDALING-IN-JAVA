import java.util.*;
 
class NegitiveException extends Exception {
 
 public NegitiveException(String msg) {
  
  super(msg);
 }
}
 
public class Numcheck {
 
 public static void main(String[] args) {
 
  Scanner in = new Scanner(System.in);
  System.out.print("Enter your Number :: ");
  int num = in.nextInt();
  
  try {
   if(num < 0)
    throw new NegitiveException(" can't be (-)ve !! -_-");
   else
    System.out.println("Valid number !!!");
  }
  catch (NegitiveException e) {
   System.out.println("Caught an exception");
   System.out.println(e.getMessage());
  }
 }
 
}