import java.util.HashMap;

/** Written by Ryan D'souza
  * 
  *  http://projecteuler.net/problem=29
  * 
  *  Output/Answer: 9183 
*/

public class Problem29 {
  public static void main(String[] args) {
    HashMap<String, Double> theValues = new HashMap<String, Double>();
    
    for(int a = 2; a < 101; a++) {
      for(int b = 2; b < 101; b++) {
        double theProduct = Math.pow(a, b);
        theValues.put(String.valueOf(theProduct), theProduct);
      }
    }
    
    System.out.println(theValues.size());
  }
}
        