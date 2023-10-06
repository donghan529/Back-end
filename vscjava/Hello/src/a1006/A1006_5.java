package a1006;

public class A1006_5 {
    public static void main(String[] args) {
        int[] scores = {95,71,84,82,87};
        int sum = 0;
        for(int score : scores) {
            sum = sum + score;
        }
        System.out.println("점수 총함 = " + sum);

        double avg = (double) sum / scores.length;
        System.out.println("점수 평균 = " + avg);
    }
}
