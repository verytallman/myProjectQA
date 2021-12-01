package HW7.Cars;

import java.time.LocalDate;

public class Car {
    private int id;
    private String manufactureYear;
    private double engine;
    private double fuelInTank;
    private String carName;
    private String carModel;
    private String carColor;
    private String typeOfBody;

    public void checkManufactureYear(int manufactureYear) {
        int current_year = LocalDate.now().getYear();
        if (manufactureYear <= 2001 || manufactureYear > current_year) {
            this.manufactureYear = "Wrong year";
        } else {
            this.manufactureYear = String.valueOf(manufactureYear);
        }
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public void setFuelInTank(double fuelInTank) {
        this.fuelInTank = fuelInTank;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public void setTypeOfBody(String typeOfBody) {
        this.typeOfBody = typeOfBody;
    }


    public String printCarInfo() {

        System.out.println("Your car is: " + carName + " and your car's model is: " + carModel);
        System.out.println("Info About your car: ");
        System.out.println("Id: " + id);
        System.out.println("Manufacture year : " + manufactureYear);
        System.out.println("Engine: " + String.valueOf(engine) + "T");
        System.out.println("Car color: " + carColor);
        System.out.println("Body type : " + typeOfBody);
        return "";
    }

    public double fuelCounter(double fuelToAdd) {

        fuelInTank = fuelInTank + fuelToAdd;
        System.out.print("Current fuel level on " + carName + " " + carModel + " is about " + fuelInTank + " liters.");
        return fuelInTank;
    }

    void fuelCounter(double fuelToAdd, String typeOfGas) {
        fuelInTank = fuelInTank + fuelToAdd;
        System.out.println("");
        System.out.print("Current fuel level on " + carName + " " + carModel + " is about " + fuelInTank + " liters "
                + typeOfGas + ".");
        System.out.println("");
    }

    public  String hatchBackChecker (String typeOfBody){

        if (typeOfBody == "HatchBack"){
            this.typeOfBody = "HatchBack";
        }else {
            this.typeOfBody = "Other Body";
        }return typeOfBody;
    }

    public  String SUVChecker (String typeOfBody){
        if (typeOfBody == "SUV"){
            this.typeOfBody = "SUV";
        }else {
            this.typeOfBody = "Other Body";
        }return typeOfBody;
    }
}