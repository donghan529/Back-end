package a1011.aven;

public class AcountTest {
    public static void main(String[] args) {
        Acount acc = new Acount();
        // acc.balance = 1000; //private 필드는 외부에서 사용불가
        acc.setBalance(1000);
        System.out.printf("잔액: %d", acc.getBalance());
    }
}

class Acount{
    private int balance;

    //게터(Getter) balance 값을 호출담당
    public int getBalance() {
        return balance;
    }
    //세터(Setter) balace 값을 지정담당
    public void setBalance(int b) {
        balance = b;
    }
}