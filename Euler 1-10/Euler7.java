import java.util.ArrayList;
public class Euler7 {
  static ArrayList<Integer> list = new ArrayList<Integer>();
  public static void main(String[] args) { 
    int isPrime = 0;
    int count = 0;
    //goes through every number
    for (int i = 2; i < 99999999; i++){
      if(count == 10001){
            System.out.println("Prime is " +(i-1));
            System.out.println("This is prime number " +count);
        break;
      }
      //checks each number to see if it's prime
  if (prime(i))  {
      for (int k = 1; k <= i; k++){
          if (i%k == 0){
            isPrime++;
          }
          if (isPrime == 2){
            count++;
            list.add(i); //saves prime to list
    //        System.out.println("Prime is " +i);
    //        System.out.println("This is number " +count);
          }
        }          isPrime = 0;
      }
    }
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
    return true;
  }
}
