package exam;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        // 실수(float) 한 개를 입력받아 소수점 이하 3째 자리에서 반올림 하여 2째 자리까지 출력하시오.
        // 1.59254 -> 1.59
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        float num1 = scanner.nextFloat();
        num1 = (num1 + 0.005f)*100;
        // System.out.printf("%.2f", num1);
        int i = (int)num1;
        System.out.println(i);
        num1 = (float) i/100;
        System.out.println(num1);

        scanner.close();
        /*
         * %c 하나의 문자
         * %s 문자열
         * %d 부호 있는 10진 정수
         * %i 부호 있는 10진 정수 (%d와 동일)
         * %f 고정 소수점으로 표현한 실수 (소수점 이하 6자리까지 표현)
         * %o 부호 없는 8진 정수
         * %u 부호 없는 10진 정수
         * %x 부호 없는 16진 정수 (소문자 사용)
         * %X 부호 없는 16진 정수 (대문자 사용)
         * %e 부동 소수점으로 표현한 실수 (e-표기법)
         * %E 부동 소수점으로 표현한 실수 (E-표기법)
         * %g 값에 따라 %f나 %e를 사용함.
         * %G 값에 따라 %f나 %E를 사용함.
         * %% 퍼센트(%) 기호 출력
         */
    }
}
