package exam;

import java.util.Scanner;

public class Ex43 {

    static String[] unit = { "", "십", "백", "천", "만", "십만", "백만", "천만", "억", "십업", "백억", "천억" };

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String stringNum = Integer.toString(num);

        int j = stringNum.length() - 1;

        for (int i = 0; i < stringNum.length(); i++) {
            int n = stringNum.charAt(i) - '0'; 
            if (readNum(n) != null) { 
                System.out.print(readNum(n)); 
                System.out.print(unit[j]); 
            }
            j--;
        }
        System.out.println();
    }

    public static String readNum(int num) {
        switch (num) {
            case 1:
                return "일";
            case 2:
                return "이";
            case 3:
                return "삼";
            case 4:
                return "사";
            case 5:
                return "오";
            case 6:
                return "육";
            case 7:
                return "칠";
            case 8:
                return "팔";
            case 9:
                return "구";
        }
        return null;
    }

}
