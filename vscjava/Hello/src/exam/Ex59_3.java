package exam;

public class Ex59_3 {
    public static void main(String[] args) {
        int[] lotto = { 13, 23, 24, 35, 40, 45, };
        int bonus = 7;
        int[] myNumber = { 13, 23, 8, 35, 40, 45, };
        int count = 0;
        int bonusCount = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; i < 6; j++) {
                if (myNumber[i] == lotto[j]) {
                    count++;
                }
            }
        }
        if (count == 6) {
            System.out.println("1등당첨");
        } else if(count==5) {
            for(int i=0;i<5;i++) {
                if(bonus == myNumber[i]) {
                    bonusCount++;
                }
            } 
            if(bonusCount>0) {
                System.out.println("2등당첨");
            } else {
                System.out.println("3등당첨");
            }
        } else if (count == 4) {
            System.out.println("4등당첨");
        }else if (count == 3) {
            System.out.println("5등당첨");
        } else {
            System.out.println("꽝! 다음기회에~");
        }
    }
}
