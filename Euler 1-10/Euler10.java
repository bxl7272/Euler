import java.util.ArrayList;
public class Euler10 {
  static ArrayList<Integer> list = new ArrayList<Integer>();
  public static void main(String[] args) { 
    int isPrime = 0;
    int count = 0;
    long sum = 0L;
    //goes through every number
    for (int i = 2; i < 2000000; i++){
      /* if(count == 10001){
       System.out.println("Prime is " +(i-1));
       System.out.println("This is prime number " +count);
       break;
       }*/
      //checks each number to see if it's prime
      if (prime(i))  {
        list.add(i); //saves prime to list
        sum += (long)i;
      }       
    }
    System.out.println(sum);
  }
  public static boolean prime(int a){
    if (a == 2){
      return true;
    }
    if (a == 3){
      return true;
    }
    if (a%2 == 0){
      return false;
    }
    if (a%3 == 0){
      return false;
    }
    for(int n:list){//quick checks if number is prime using learned prime numbers
      if (a%n == 0){
        return false;
      }
    }
    for (int k = 3; k <= Math.sqrt(a)+1; k+=2){
      if (a%k == 0){
        return false;
      }
    }
    return true;}
}
