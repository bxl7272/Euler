public class Euler5{
  public static void main (String[] args){
    int count = 0;
    for(long i = 19; i<500000000L; i+=19){
      for (int k = 2; k <21; k++){
        if (i%k == 0){
          count++;
            if (count == 19){
            System.out.println(i);
          }        
        }
      }
      count = 0;
    }
  }
}
