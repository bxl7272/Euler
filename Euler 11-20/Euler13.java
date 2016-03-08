import java.util.*;
import java.io.*;
public class Euler13{
  public static void main (String[] args){
    double sum = 0;
ArrayList<Double> list = new ArrayList<Double>();
File file = new File("Euler13.txt");
BufferedReader reader = null;

try {
    reader = new BufferedReader(new FileReader(file));
    String text = null;

    while ((text = reader.readLine()) != null) {
        list.add(Double.parseDouble(text));
    }
} catch (FileNotFoundException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
} finally {
    try {
        if (reader != null) {
            reader.close();
        }
    } catch (IOException e) {
    }
}

//print out the list
    for(double x:list){
      sum += x;
    }
    System.out.println(sum);
  }
}