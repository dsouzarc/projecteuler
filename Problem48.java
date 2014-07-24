import java.math.BigInteger;

/** Written by Ryan D'souza
  *  
  * http://projecteuler.net/problem=48
  * 
  * Output/Answer: 9110846700 
  */
public class Problem48 {
  public static void main(String[] args) {
   
    BigInteger theSum = new BigInteger(String.valueOf("0"));
    
    for(int i = 1; i < 1001; i++)
      theSum = theSum.add(new BigInteger(String.valueOf(i)).pow(i));
    
    final String theResult = theSum.toString();
    System.out.println(theResult.substring(theResult.length()-10));
  }
}