/** Written by Ryan D'souza
  * 
  * http://projecteuler.net/problem=4
  * 
  * Output/Answer: 906609 
*/

public class Problem4
{
  public static boolean isPalindrome(final String number)
  {
    char[] word = new char[number.length()];
    
    for(int i = number.length()-1; i > -1; i--)
      word[i] = number.charAt(i);
    
    String backwards = "";
    for(int i = word.length-1; i > -1; i--)
      backwards += String.valueOf(word[i]);
    
    return number.equals(backwards);
  }
    
  public static void main(String[] args)
  {
    long largestStored = 0;
    
    for(int i = 0; i < 1000; i++)
    {
      for(int y = 0; y < 1000; y++)
      {
         long prod = i * y;
         if(largestStored < prod && isPalindrome(String.valueOf(prod)))
           largestStored = prod;
      }
    }
    
    System.out.println(largestStored);
  }
}
    