public class Euler12{
  public static void main (String[] args){
    int triangle = 0;
    int count = 1;
    while (divisors(triangle) < 500){
      triangle += count;
      count++;
    }
    System.out.println(triangle);
  }
  
  
  public static int divisors(int n){
    int a = 0;
    int sqrt = (int)Math.sqrt(n);
    
    for (int j = 1; j <= sqrt; j++){
      if (n % j == 0){
        a +=2;
      }
    }
    if (sqrt * sqrt == n){
      a--;
    }
    return a;
  }
}
