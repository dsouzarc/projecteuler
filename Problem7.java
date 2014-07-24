/** Written by Ryan D'souza
  * 
  * http://projecteuler.net/problem=7
  * 
  * Output/Answer: 104743 
  */

public class Problem7 {
  public static boolean isPrime(final long number) { 
    if(number == 2)
      return true;
    if(number % 2 == 0)
      return false;
    
    //Start off at 3 and only test odd numbers
    for(int i = 3; i < (int) Math.sqrt(number) + 1; i+= 2)
      if(number % i == 0)
      return false;
    return true;
  }
  
  public static void main(String[] args) { 
    int counter = 0;
    long num = 1;
    
    while(counter < 10001) {
      num++;
      if(isPrime(num))
        counter++;
    }
    System.out.println(num);
  }
}
