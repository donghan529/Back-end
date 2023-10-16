package exam.exam1011.ex20;

public class Account {
    private String accountNumber;
    private String name;
    private int balance;
    
    public Account(String accountNumber, String name, int balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public String getName() {
        return name;
    }
    public int getBlance() {
        return balance;
    }
    public void setAccountNumber(String accountNumber) {
        if(accountNumber==null || accountNumber.equals("") || accountNumber.length()<0 || accountNumber.length()>8)
            return;
        this.accountNumber = accountNumber;
    }
    public void setName(String name) {
        if(name==null || name.equals("") || name.length()<0)
            return;
        this.name = name;
    }
    public void setBlance(int balance) {
        if(balance<0)
            return;
        this.balance = balance;
    }
}
