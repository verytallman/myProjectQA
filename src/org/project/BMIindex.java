package org.project;

public class BMIindex {
    public static void main(String[] args) {
        int pounds = 452;
        int inches = 72;
        float kgIndex = 2.2046226218F;
        float kilos = (float) (pounds / kgIndex);
        float meterIndex = 39.3700787F;
        float meters = (float) (inches / meterIndex);


        System.out.println("Body Mass Index is "+kilos / Math.pow(meters, 2));
    }
}
