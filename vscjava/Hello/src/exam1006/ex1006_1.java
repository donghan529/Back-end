package exam1006;

public class ex1006_1 {
    public static void main(String[] args) {
        /*
         * 문제 1: 배열에서 최대값 찾기
         * 주어진 정수 배열에서 최대값을 찾는 프로그램을 작성하세요.
         * int[] numbers = {5, 10, 3, 7, 2, 8};
         */
        int[] numbers = { 5, 10, 3, 7, 2, 8 };
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(max<numbers[i]){
                max=numbers[i];
            }
        }
        System.out.println("최대값: "+max);
    }
}
