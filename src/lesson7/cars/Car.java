package lesson7.cars;

public class Car {
    String color;
    String form;
    double fuelConsumption;
    String id;
    double fuelInTank;

    void fillTank(int fuelV) {

        fuelInTank = fuelInTank + fuelV;
    }

    void drive(double distance) {

        fuelInTank = fuelInTank - distance / 100 * fuelConsumption;
    }

    void formFactor() {

        System.out.println("Car with id: " + id + " has color: " + color + " with form: " + form);
    }
}
