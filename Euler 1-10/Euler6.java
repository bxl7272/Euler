public class Euler6{
  public static void main (String[] args){
   long squareSum = 0L;
   long sumSquare = 0L;
    for (long i = 1; i < 101; i++){
      squareSum += i*i;
      sumSquare += i;
    }
    sumSquare = sumSquare*sumSquare;
    System.out.println(squareSum - sumSquare);
  }
}