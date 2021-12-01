package HW7.PresentationTask;

import HW7.PresentationTask.FractionNumbers;

public class App {
    public static void main(String[] args) {
        FractionNumbers check = new FractionNumbers(25, 5);
        check.plusMethod();
        check.minusMethod();
        check.divideMethod();
        check.multiplyMethod();
        check.toStringMethod();
    }


}