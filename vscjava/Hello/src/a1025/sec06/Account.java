package a1025.sec06;

import javax.naming.InsufficientResourcesException;

public class Account {
  private long balance;

  public long getBalance() {
    return balance;
  }

  public Account() { }
  public void deposit(int money) {
    balance += money;
  }
  public void withdraw(int money) throws InsufficientResourcesException {
    if(balance<money) {
      throw new InsufficientResourcesException("잔고 부족: "+(money-balance)+" 모자람");
    }
    balance -= money;
  }
}
