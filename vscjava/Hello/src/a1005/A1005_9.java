package a1005;

public class A1005_9 {
    public static void main(String[] args) {
        String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";

        // 문자열 분리
        String[] toKens = board.split(",");

        // 인덱스별로 읽기
        System.out.println("번호: " + toKens[0]);
        System.out.println("제목: " + toKens[1]);
        System.out.println("내용: " + toKens[2]);
        System.out.println("성명: " + toKens[3]);
        System.out.println();

        // for 문을 이용한 읽기
        for (int i = 0; i < toKens.length; i++) {
            System.out.println(toKens[i]);
        }
    }
}
