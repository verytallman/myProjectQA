package lesson7.getset;

public class ShopImplementation {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.setSecurity("Orange");
        System.out.println(shop.getSecurity());
    }
}
