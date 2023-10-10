package a1010.animal;

public class AnimalExam {
    public static void main(String[] args) {
        Animal myAni1 = new Animal("코코","말티즈",19);
        Animal myAni2 = new Animal("해피","진돗개",2);

        System.out.println("이름: " + myAni1.name);
        System.out.println("품종: " + myAni1.breeds);
        System.out.println("나이: " + myAni1.age);
        System.out.println();
        System.out.println("이름: " + myAni2.name);
        System.out.println("품종: " + myAni2.breeds);
        System.out.println("나이: " + myAni2.age);
    }
}
