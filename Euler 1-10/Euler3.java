public class Euler3 {
  public static void main (String[] args){
    long a = 0L;
    long num = 600851475143L;
    long finish = 0L;
    for (long i = 2L; i < num; i++){
      if (num % i == 0){
        num = num/i;
    System.out.println(i);
        }
      }
    System.out.println(num);
    }
  }
