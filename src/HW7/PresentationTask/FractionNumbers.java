package HW7.PresentationTask;

//Write class to represent FractionNumbers
//This class should contain two fields.
//This class should contain methods to perform basic math operations:
//plus, minus, multiply, divide
//Also, this class should have toString method to print numbers into standard output
//Create additional class like App to check functionality of FractionNumber class


public class FractionNumbers {
    private int fieldOne;
    private int fieldTwo;

    public FractionNumbers(int fieldOne, int fieldTwo) {
        this.fieldOne = fieldOne;
        this.fieldTwo = fieldTwo;
    }

    public void plusMethod() {
        if (fieldOne > 0 || fieldTwo > 0) {
            int result = fieldOne + fieldTwo;
            System.out.println(result);
        }
    }

    public void minusMethod() {
        if (fieldOne > 0 || fieldTwo > 0) {
            int result = fieldOne - fieldTwo;
            System.out.println(result);
        }
    }

    public void multiplyMethod() {
        if (fieldOne > 0 || fieldTwo > 0) {
            int result = fieldOne * fieldTwo;
            System.out.println(result);
        }
    }

    public void divideMethod() {
        if (fieldOne > 0 && fieldTwo > 0) {
            int result = fieldOne / fieldTwo;
            System.out.println(result);
        } else {
            System.out.println("You can't divide by zero.");
        }
    }

    public String toStringMethod() {
        String str1 = Integer.toString(fieldOne) + " and " +Integer.toString(fieldTwo);
        System.out.println("The value for String is " + str1);
    return "";
    }


}


//Write class to represent FractionNumbers
//This class should contain two fields.
//This class should contain methods to perform basic math operations:
//plus, minus, multiply, divide
//Also, this class should have toString method to print numbers into standard output
//Create additional class like App to check functionality of FractionNumber class


