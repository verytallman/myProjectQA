package HW7.Cooking;

public class Meat  {
    private int weight;
    private String typeOfMeat;

    public Meat(int weight, String typeOfMeat) {
        this.weight = weight;
        this.typeOfMeat = typeOfMeat;
    }
    public void cookingTimeCounter (){
        int timeToCook = weight * 40; // 40 minutes to cook 1 kilo of meat.
        System.out.println("To cook "+weight+" kilos of "+typeOfMeat+" will take "+timeToCook+" minutes ");
    }
    void cookingTimeCounter (String foodPreparation){
        int timeToCook = weight * 90; // 90 minutes to cook 1 kilo of meat using sous-vide method.
        System.out.println("To cook "+weight+" kilos of "+typeOfMeat+" will take "+timeToCook+" minutes using "+foodPreparation+" method.");
    }

}
