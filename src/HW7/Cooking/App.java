package HW7.Cooking;

public class App  {
    public static void main(String[] args) {
        //Class Fruits

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

        //Class Meat

        Meat NewMeat = new Meat(2,"Chicken");
        NewMeat.cookingTimeCounter();
        NewMeat.cookingTimeCounter("sous-vide");

        //Class Vegetables

        Vegetables NewVegetable = new Vegetables("Pepper","Hot",50,5);
        NewVegetable.howToMakeVegetableSalsa();
        NewVegetable.howToMakeVegetableSalsa("olive oil or green oil");

        Vegetables NewVegetable2 = new Vegetables("Tomato","watery sweet",100,
                3);
        NewVegetable2.howToMakeVegetableSalsa();
        NewVegetable2.howToMakeVegetableSalsa("green oil");

    }
}
