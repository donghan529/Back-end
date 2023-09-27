package a0927;

public class A0927_5 {
    public static void main(String[] args) {
        int score = 85;
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
        System.out.println(score + "점은" + grade + "등급입니다.");

        String result = (!(score > 90)) ? "가" : "나";
        System.out.println(result);

        int value = 356;
        System.out.println(value - 56);

        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;
        double area = (double) ((lengthTop + lengthBottom) * height / 2);
        System.out.println(area);

        int x = 10;
        int y = 5;
        System.out.println((x > 7) && (y <= 5));

        double b = 0.0;
        double c = 5 % b;
        if (Double.isNaN(c)) {
            System.out.println("나눌수 없습니다.");
        } else {
            double result1 = c + 10;
            System.out.println("결과: " + result1);
        }

        int pencils = 534;
        int students = 30;

        int pencilsPerStudent = (pencils/students);
        System.out.println(pencilsPerStudent);
        
        int pencilsLeft = (pencils%students);
        System.out.println(pencilsLeft);

    }
}
