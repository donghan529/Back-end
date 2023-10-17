package exam.exam1011.ex20;

import java.util.Scanner;

public class BankApplication {
    private static Account[] arr = new Account[100];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;

        while (run) {

            System.out.println("--------------------------------------------------------");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
            System.out.println("--------------------------------------------------------");
            System.out.println("선택> ");
            int str = sc.nextInt();
            if (str == 1) {
                createAccount();
            } else if (str == 2) {
                accountList();
            } else if (str == 3) {
                deposit();
            } else if (str == 4) {
                withdraw();
            } else if (str == 5) {
                run = false;
            }
        }
        System.out.println(" 프로그램 종료");
    }

    private static void createAccount() {
        System.out.println("----------");
        System.out.println("계좌생성");
        System.out.println("----------");

        System.out.println("계좌번호: ");
        String accountNumber = sc.next();

        System.out.println("계좌주: ");
        String name = sc.next();

        System.out.println("초기입금액: ");
        int balance = sc.nextInt();

        Account newAcount = new Account(accountNumber, name, balance);
        for (int i = 0; i < arr.length; i++) {
            if(!newAcount.getAccountNumber().equals(arr[i].getAccountNumber())){
                if(arr[i] == null) {
                    arr[i] = newAcount;
                    System.out.println("결과: 계좌가 생성되었습니다.");
                    break;
                } 
            }
            // if(accountNumber.equals(arr[i].getAccountNumber())) {
            //     System.out.println("중복계좌입니다.");
            // }
        }
    }

    private static void accountList() {
        System.out.println("----------");
        System.out.println("계좌목록");
        System.out.println("----------");

        for (int i = 0; i < arr.length; i++) {
            Account account = arr[i];
            if (account != null) {
                System.out.print(account.getAccountNumber());
                System.out.print("  ");
                System.out.print(account.getName());
                System.out.print("  ");
                System.out.print(account.getBlance());
                System.out.println();
            }
        }
    }

    private static void deposit() {
        System.out.println("----------");
        System.out.println("예금");
        System.out.println("----------");
        System.out.println("계좌번호");
        String accountNumber = sc.next();
        System.out.println("예금액: ");
        int accountDeposit = sc.nextInt();

        Account account = findAccount(accountNumber);
        if (account == null) {
            System.out.println("결과: 계좌가 없습니다.");
            return;
        }
        account.setBlance(account.getBlance() + accountDeposit);
        System.out.println("결과: 입금이 성공되었습니다.");

    }

    private static Account findAccount(String accountNumber) {
        Account account = null;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                String dbAccountNumber = arr[i].getAccountNumber();
                if (dbAccountNumber.equals(accountNumber)) {
                    account = arr[i];
                    break;
                }
            }
        }
        return account;
    }

    private static void withdraw() {
        System.out.println("----------");
        System.out.println("출금");
        System.out.println("----------");
        System.out.println("계좌번호");
        String accountNumber = sc.next();
        System.out.println("출금액: ");
        int accountWithdraw = sc.nextInt();

        Account account = findAccount(accountNumber);
        if (account == null) {
            System.out.println("결과: 계좌가 없습니다.");
            return;
        }
        if (account.getBlance() >= accountWithdraw) {
            account.setBlance(account.getBlance() - accountWithdraw);
            System.out.println("결과: 출금이 성공되었습니다.");
        } else {
            System.out.println("결과: 잔액이 부족합니다.");
        }

    }

}
