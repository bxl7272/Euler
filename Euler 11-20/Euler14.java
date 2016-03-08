public class Euler14{
  public static void main (String[] args){
    int length = 0;
    int number = 0;
    int longestLength = 0;
    for (int i = 2; i < 1000001; i++){
      length = getLength(i);
      if (length > longestLength){
        number = i;
        longestLength = length;
      }
    }
    System.out.println(number);
  }
  
  public static int getLength(int i){
    long Number = i;
    int counter = 0;
        while(Number > 1){
                if(Number % 2 == 0){
                    Number = Number / 2;
                } else{
                    Number = (Number * 3) + 1;
                }
                counter += 1;
            }
    return counter;
  }
}
  
