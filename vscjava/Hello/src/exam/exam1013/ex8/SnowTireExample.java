package exam.exam1013.ex8;

public class SnowTireExample {
    public static void main(String[] args) {
        SnowTire snowTire = new SnowTire();
        Tire tire =snowTire;

        snowTire.run();
        tire.run();
    }
}
