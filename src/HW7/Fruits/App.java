package HW7.Fruits;

import lesson7.HW7.Fruits.Fruits;

public class App {
    public static void main(String[] args) {
        lesson7.HW7.Fruits.Fruits NewFruitOrange = new lesson7.HW7.Fruits.Fruits("Orange", "sour-sweet", 120,
                "Orange,Red-Orange", 2);

        NewFruitOrange.fruitInfo();

        NewFruitOrange.howToMakeFruitSalad();
        NewFruitOrange.howToMakeFruitSalad("sour cream", "milk chocolate drops");

        lesson7.HW7.Fruits.Fruits NewFruitApple = new Fruits("Apple", "sweet", 70, "Red",
                4);

        NewFruitApple.fruitInfo();

        NewFruitApple.howToMakeFruitSalad();
        NewFruitApple.howToMakeFruitSalad("sweet liquor", "white chocolate");
    }
}
