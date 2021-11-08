package org.project;

public class Assignment4 {
    public static void main(String[] args) {
        int distanceInMeters = 2500;
        float distanceInKilos = 2.5F;
        int inputHour = 5;
        float inputMinutes = 56;
        float inputSeconds = 23;
        float totalSeconds = inputHour * 60 * 60 + inputMinutes * 60 + inputSeconds;
        float totalHours = inputHour + inputMinutes / 60 + inputSeconds / 60 / 60;

        System.out.println("Your speed in meters/second is "+distanceInMeters / totalSeconds); //
        // Your speed in meters/second is 0.11691531
        System.out.println("Your speed in km/h is "+distanceInKilos / totalHours);
        // Your speed in km/h is 0.42089513
    }

}
