package lesson7.HW7.Task1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Car {
    int id;
    int manufactureYear;
    double engine;
    double fuelInTank;
    String carName;
    String carModel;
    String carColor;
    String typeOfBody;
    Scanner scanner = new Scanner(System.in);
    int distance = scanner.nextInt();

    Car(){
        System.out.println("Please, enter your distance to drive: ");
    }


    public String printSedanCarInfo () {

        System.out.println("Your car is: " + carName + " and your car's model is: " + carModel);
        System.out.println("Info About your car: ");
        System.out.println("Id: "+id);
        System.out.println("Manufacture year : "+manufactureYear);
        System.out.println("Engine: "+String.valueOf(engine)+"T");
        System.out.println("Car color: "+carColor);
        System.out.println("Body type : "+typeOfBody);
        System.out.println("Distance to drive: "+distance+" km.");
        return "";
    }
    public double fuelCounter (double fuel){

        fuelInTank = fuelInTank + fuel;
        System.out.print("Current fuel level on "+carName+" "+carModel+" is about ");
        return fuelInTank;
    }

    public double fuelConsumption () {

        return 0;
    }


}
