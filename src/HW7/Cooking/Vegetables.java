package HW7.Cooking;

public class Vegetables  {

    private String nameOfVegetables;
    private String tasteOfVegetable;
    private double weightOfVegetables;
    private int Vegetable;


    public Vegetables(String nameOfVegetables, String tasteOfVegetable, double weightOfVegetables, int numberOfVegetable) {
        this.nameOfVegetables = nameOfVegetables;
        this.tasteOfVegetable = tasteOfVegetable;
        this.weightOfVegetables = weightOfVegetables;
        this.Vegetable = numberOfVegetable;
    }

    public void howToMakeVegetableSalsa(){
        System.out.println("First, you will need some Vegetable");
        System.out.println("We will take "+tasteOfVegetable+" "+nameOfVegetables);
        System.out.println("One vegetable should be about "+weightOfVegetables+" grams.");
        System.out.println("Cut "+Vegetable+" "+nameOfVegetables+"s"+" into small cubical pieces.");
        System.out.println("Season with salt and black pepper");
        System.out.println("Done");
        System.out.println("");
    }
    void howToMakeVegetableSalsa (String oilType){
        System.out.println("First, you will need some Vegetable");
        System.out.println("We will take "+tasteOfVegetable+" "+nameOfVegetables);
        System.out.println("One vegetable should be about "+weightOfVegetables+" grams.");
        System.out.println("Cut "+Vegetable+" "+nameOfVegetables+"s"+" into small cubical pieces.");
        System.out.println("Season with "+oilType+".");
        System.out.println("Done");
        System.out.println("");
    }

}
