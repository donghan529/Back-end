package a1025;


import java.io.IOException;
import java.io.PrintWriter;

public class Samplew4 {
  public static void main(String[] args) throws IOException {
    PrintWriter pw = new PrintWriter("c:/Temp/out.txt");
    for (int i = 1; i < 11; i++) {
      String data = i + " 번째 줄입니다.\r\n"; // 줄바꿈
      pw.println(data);
    }
    pw.close();
  }
}
