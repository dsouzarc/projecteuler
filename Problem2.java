/** Written by Ryan D'souza
  * 
  * http://projecteuler.net/problem=2
  * 
  * Output/Answer: 4613732 
*/

public class Problem2
{
  public static void main(String[] args)
  {
    int sum = 0; //For sum of even
    
    int firstNum = 1; //First num of sequence
    int secNum = 2;
    
    boolean toContinue = true;
    
    while(toContinue)
    {
      if(firstNum > 4000000)
      {
        toContinue = false;
        break;
      }
      //System.out.println(firstNum);
      
      if(firstNum % 2 == 0)
        sum += firstNum;
      
      
      int temp = firstNum + secNum;
      firstNum = secNum;
      secNum = temp;
      
      
      
    }
    
    System.out.println(sum);
  }
}