package exam.exam1016.ex05;

public class TV implements Remocon {
    public void powerOn() {
        System.out.println("Tv를 켰습니다.");
    }
    public static void main(String[] args) {
        Remocon r = new TV();
        r.powerOn();
    }
}
