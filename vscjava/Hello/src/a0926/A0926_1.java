package a0926;

public class A0926_1 {
    public static void main(String[] args) {
        //자동 타입 변환
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println(intValue);

        char charValue = '가';
        intValue = charValue;
        System.out.println(intValue);

        intValue = 50;
        long longValue = intValue;
        System.out.println(longValue);

        longValue = 100;
        float floatValue = longValue;
        System.out.println(floatValue);

        floatValue = 100.5F;
        double doubleValue = floatValue;
        System.out.println(doubleValue);
    }
}
