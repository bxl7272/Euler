import java.util.ArrayList; import java.util.Collections;
public class Euler4 {
  public static void main (String[] args) {
    int palin = 0;
    int a = 0;
    int reverse = 0;
    int bigPalin = 0;
    for (int i = 999; i > 850; i--){
      for (int k = 999; k > 850; k--){
        palin = i*k;
        if (isPalindrome(palin)){
          if (palin > bigPalin){
            bigPalin = palin;
          }
        }
      }
    }
    System.out.println(bigPalin);
  }
  public static boolean isPalindrome(int palin)
  {
    boolean isPalindrome=false;
    StringBuilder temp = new StringBuilder(Integer.toString(palin)).reverse();
    if(temp.toString().equals(Integer.toString(palin)))
    {
      isPalindrome=true;
    }
    return isPalindrome;
  }
}

