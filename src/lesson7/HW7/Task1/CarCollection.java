package lesson7.HW7.Task1;

public class CarCollection {
    public static void main(String[] args) {
        Car VolvoV70 = new Car();
        VolvoV70.id = 1;
        VolvoV70.engine = 2.0;
        VolvoV70.carColor = "Blue";
        VolvoV70.carModel = "V70";
        VolvoV70.carName = "Volvo";
        VolvoV70.typeOfBody = "Sedan";
        VolvoV70.manufactureYear = 2010;
        VolvoV70.fuelInTank = 35;

        Car VolvoXC90 = new Car();
        VolvoXC90.typeOfBody = "SUV";
        VolvoXC90.carName = "Volvo";
        VolvoXC90.id = 2;
        VolvoXC90.carColor = "Black";
        VolvoXC90.manufactureYear = 2019;
        VolvoXC90.carModel = "XC90";
        VolvoXC90.engine = 2.5;
        VolvoXC90.fuelInTank = 16.8;

        System.out.println(VolvoV70.printSedanCarInfo());
        System.out.println(VolvoXC90.printSedanCarInfo());
        System.out.println(VolvoV70.carName.concat(" "+VolvoV70.carModel)+" is "+VolvoV70.fuelCounter(0)+" liters.");
        System.out.println(VolvoV70.carName.concat(" "+VolvoXC90.carModel)+" is "+VolvoXC90.fuelCounter(6)+" liters.");

    }


}
