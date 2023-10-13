package exam.exam1011.ex18;

public class ShopService {
    public static ShopService singlecton = new ShopService();

    private ShopService() {}

    public static ShopService getInstance() {
        return singlecton;
    }
}
