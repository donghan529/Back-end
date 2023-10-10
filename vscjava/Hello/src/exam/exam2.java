package exam;

import java.util.Scanner;

public class exam2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean score = true;
        int student = 0;
        int[] scores = null;
        while (score) {
            System.out.println("--------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("--------------------------------------");
            System.out.print("선택> ");

            int strNum = Integer.parseInt(sc.nextLine());

            switch (strNum) {
                case 1:
                    System.out.print("학생수> ");
                    student = Integer.parseInt(sc.nextLine());
                    scores = new int[student];
                    break;
                case 2:
                    for (int i = 0; i < student; i++) {
                        System.out.print("socores[" + i + "] : ");
                        int scores1 = Integer.parseInt(sc.nextLine());
                        scores[i] = scores1;
                    }
                    break;
                case 3:
                    for (int i = 0; i < student; i++) {
                        System.out.print("socores[" + i + "] :"+ scores[i]+ "     ");
                    }
                    break;
                case 4:
                    int max = 0;
                    int sum = 0;
                    for (int i = 0; i < scores.length; i++) {
                        sum += scores[i];
                        if (max < scores[i]) {
                            max = scores[i];
                        }
                    }
                    System.out.println("최고 점수: " + max);
                    System.out.print("평균 점수: " + sum / scores.length+"\n");
                    break;
                case 5:
                    System.out.println("프로그램 종료");

            }
            if (strNum == 5) {
                break;
            }
        }
    }
}
