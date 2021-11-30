package HW7.Cars;

import lesson7.HW7.Cars.Car;

public class CarCollection {
    public static void main(String[] args) {

        lesson7.HW7.Cars.Car VolvoV70 = new lesson7.HW7.Cars.Car();
        VolvoV70.setCarColor("Black");
        VolvoV70.setCarName("Volvo");
        VolvoV70.setCarModel("V70");
        VolvoV70.setEngine(2.0);
        VolvoV70.setId(226);
        VolvoV70.setFuelInTank(4.0);
        VolvoV70.setTypeOfBody("SUV");

        VolvoV70.hatchBackChecker("HatchBack");
        VolvoV70.checkManufactureYear(2014);

        VolvoV70.printCarInfo();
        VolvoV70.fuelCounter(3.0);
        VolvoV70.fuelCounter(2.0, "A-95");


        lesson7.HW7.Cars.Car VolvoXC90 = new Car();
        VolvoXC90.setCarColor("Red");
        VolvoXC90.setCarModel("XC90");
        VolvoXC90.setCarName("Volvo");
        VolvoXC90.setId(1488);
        VolvoXC90.setFuelInTank(11);
        VolvoXC90.setEngine(2.5);

        VolvoXC90.checkManufactureYear(2019);
        VolvoXC90.SUVChecker("SUV");

        VolvoXC90.printCarInfo();
        VolvoXC90.fuelCounter(5.0);
        VolvoXC90.fuelCounter(1.0, "A-98");


    }


}
package HW7.Cars;

public class CarCollection {
    public static void main(String[] args) {

        Car VolvoV70 = new Car();
        VolvoV70.setCarColor("Black");
        VolvoV70.setCarName("Volvo");
        VolvoV70.setCarModel("V70");
        VolvoV70.setEngine(2.0);
        VolvoV70.setId(226);
        VolvoV70.setFuelInTank(4.0);
        VolvoV70.setTypeOfBody("SUV");

        VolvoV70.hatchBackChecker("HatchBack");
        VolvoV70.checkManufactureYear(2014);

        VolvoV70.printCarInfo();
        VolvoV70.fuelCounter(3.0);
        VolvoV70.fuelCounter(2.0, "A-95");


        Car VolvoXC90 = new Car();
        VolvoXC90.setCarColor("Red");
        VolvoXC90.setCarModel("XC90");
        VolvoXC90.setCarName("Volvo");
        VolvoXC90.setId(1488);
        VolvoXC90.setFuelInTank(11);
        VolvoXC90.setEngine(2.5);

        VolvoXC90.checkManufactureYear(2019);
        VolvoXC90.SUVChecker("SUV");

        VolvoXC90.printCarInfo();
        VolvoXC90.fuelCounter(5.0);
        VolvoXC90.fuelCounter(1.0, "A-98");


    }


}
