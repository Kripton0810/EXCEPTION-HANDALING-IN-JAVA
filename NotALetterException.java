public class NotALetterException extends Exception {

  static int count=0;
  String msg;
  
  
  public NotALetterException(String s) {
    msg = s;
  }
  

  public static void countLetter(char c) throws NotALetterException {
  

    if (Character.isJavaLetter(c)) {
      count++;
    }
    else {
      throw new NotALetterException(c + " is not a letter"); 
    }
  
  
  }
  public static void main(String as[])throws NotALetterException
  {
      String s="Subhankar0810";
      for (int i =0;i<s.length();i++)
      {
          countLetter(s.charAt(i));
        }
    }
}