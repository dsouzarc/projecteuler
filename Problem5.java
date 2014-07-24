/** Written by Ryan D'souza
  * 
  * http://projecteuler.net/problem=5
  * 
  * Output/Answer: 232792560 
*/

public class Problem5 {
  public static boolean isDivisible(long number) {
    for(int i = 1; i < 21; i++) {
      if(number % i != 0)
        return false;
    }
    return true;
  }
  
  public static void main(String[] args) {
    int counter = 20;
    boolean toContinue = true;
    
    while(toContinue) {
      if(isDivisible(counter))  {
        System.out.println(counter);
        toContinue = false;
      }
      counter++;
    }
  }
}