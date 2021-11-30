package HW7.Fruits;

public class App {
    public static void main(String[] args) {
        Fruits NewFruitOrange = new Fruits("Orange", "sour-sweet", 120,
                "Orange,Red-Orange", 2);

        NewFruitOrange.fruitInfo();

        NewFruitOrange.howToMakeFruitSalad();
        NewFruitOrange.howToMakeFruitSalad("sour cream", "milk chocolate drops");

        Fruits NewFruitApple = new Fruits("Apple", "sweet", 70, "Red",
                4);

        NewFruitApple.fruitInfo();

        NewFruitApple.howToMakeFruitSalad();
        NewFruitApple.howToMakeFruitSalad("sweet liquor", "white chocolate");
    }
}
