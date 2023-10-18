package a1018.thread;

public class Thread1 {
  public static void main(String[] args) {
    Sample sample = new Sample();
    sample.start(); //star()로 쓰레드를 실행한다.
  }
}

class Sample extends Thread {
  public void run() {
    System.out.println("thread run.");
  }
}
