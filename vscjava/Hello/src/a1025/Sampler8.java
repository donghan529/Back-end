package a1025;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sampler8 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("c:/Temp/out.txt"));
    while(true) {
      String line = br.readLine();
      if(line==null) break;
      System.out.println(line);
    }
    br.close();
  }
}
