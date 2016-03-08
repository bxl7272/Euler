public class Euler2 {
  public static void main (String[] args){
    int fib1 = 1;
    int fib2 = 2;
    int temp = 0;
    int sum = 0;
    while (fib1 < 4000000) {
      if (fib2 % 2 == 0){
        sum += fib2;
      }
      temp = fib1;
    fib1 = fib2;
    fib2 = temp+fib1;
    }
    System.out.println(sum);
  }
}