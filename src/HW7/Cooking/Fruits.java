package HW7.Cooking;

public class Fruits  {

  private String nameOfFruit;
  private String tasteOfFruit;
  private double weightOfFruit;
  private String colorOfFruit;
  private int numberOfFruit;

    public Fruits(String nameOfFruit, String tasteOfFruit, double weightOfFruit, String colorOfFruit, int numberOfFruit)
    {
        this.nameOfFruit = nameOfFruit;
        this.tasteOfFruit = tasteOfFruit;
        this.weightOfFruit = weightOfFruit;
        this.colorOfFruit = colorOfFruit;
        this.numberOfFruit = numberOfFruit;
    }

    public void fruitInfo(){
        System.out.println("The info about Fruit "+nameOfFruit);
        System.out.println("Name "+nameOfFruit);
        System.out.println("Taste "+tasteOfFruit);
        System.out.println("Weight "+weightOfFruit+" grams.");
        System.out.println("Color "+ colorOfFruit);
        System.out.println("");

    }

    public void howToMakeFruitSalad(){
        System.out.println("First, you will need some fruits");
        System.out.println("We will take "+tasteOfFruit+" "+nameOfFruit);
        System.out.println("One fruit should be about "+weightOfFruit+" grams.");
        System.out.println("Cut "+numberOfFruit+" "+nameOfFruit+"s"+" into cubical pieces.");
        System.out.println("Season as you like with honey and nuts.");
        System.out.println("Done");
        System.out.println("");
    }

     void howToMakeFruitSalad(String seasoning, String chocolate){
         System.out.println("First, you will need some fruits");
         System.out.println("We will take "+tasteOfFruit+" "+nameOfFruit);
         System.out.println("One fruit should be about "+weightOfFruit+" grams.");
         System.out.println("Cut "+numberOfFruit+" "+nameOfFruit+"s"+" into cubical pieces.");
         System.out.println("Season as you like with "+seasoning+".");
         System.out.println("If you want you may add some "+chocolate+".");
         System.out.println("Done");
         System.out.println("");
    }
}