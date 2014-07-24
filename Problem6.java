/** Written by Ryan D'souza
  * 
  * http://projecteuler.net/problem=6
  * 
  * Output/Answer: 25164150 
*/

public class Problem6 {
  public static void main(String[] args) {
    long sumSquares = 0;
    long squareSums = 0;
    
    for(int i = 0; i < 101; i++) {
      sumSquares += Math.pow(i, 2);
      squareSums += i;
    }
    
    squareSums = (long) Math.pow(squareSums, 2);
    
    System.out.println(squareSums - sumSquares);
  }
}