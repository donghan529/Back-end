package a1004;

public class A1004_ex33 {
    public static void main(String[] args) {
        int month = 9;
        switch(month) {
            case 12:
            case 1:
            case 2:
            System.out.printf("winter");
            break;
            case 3: 
            case 4: 
            case 5:
            System.out.printf("spring");
            break;
            case 6:
            case 7:
            case 8:
            System.out.printf("winter");
            break;
            default:
            System.out.printf("fall");
            break;
        }
    }
}
