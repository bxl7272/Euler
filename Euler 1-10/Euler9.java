public class Euler9{
  public static void main (String[] args){
    for (int i = 1; i < 334; i++){
      for (int k = 1; k < 500; k++){
          if(k*k + i*i == (1000-(k+i))*((1000-(k+i)))){
              System.out.println(k+i+(1000-(k+i)));
              System.out.println(k*(1000-(k+i))*i);
            
          }
        }
      }
    }
  }
