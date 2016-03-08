import java.util.*;
import java.math.BigInteger;
public class Euler16{
  public static void main (String[] args){
    BigInteger n = BigInteger.valueOf(2);
    n = n.pow(1000);
    BigInteger sum = BigInteger.valueOf(0);
    sum = sumDigits(n);
    System.out.println(sum);
  }
  
  public static BigInteger sumDigits(BigInteger i){
    BigInteger sum = BigInteger.valueOf(0);
    
    while (i.compareTo(BigInteger.valueOf(1)) == 1){
      sum.add(i.remainder(BigInteger.valueOf(10)));
      i.divide(BigInteger.valueOf(10));
    }
    return sum;
  }
}