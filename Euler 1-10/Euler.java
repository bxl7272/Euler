public class Euler {
  public static void main (String[] args){
    int sum = 0;
    for(int i = 3; i<1000; i+=3){
      if (i%5 == 0){
        sum = sum;
      }
      else{
        sum += i;
      }
    }
    for(int k = 5; k < 1000; k+=5){
      sum += k;
    }
    System.out.println(sum);
  }
}