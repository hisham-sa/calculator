package calculator;

import java.util.*;

/**
 * The {@code operations} class provides methods for basic mathematical
 * operations,
 * Supports addition, subtraction, multiplication, division, percentage,
 * exponentiation, factorial, odd/even checks, absolute values, and average
 * calculations.
 * 
 * @param val1 the first value for calculations
 * @param val2 the second value for calculations
 * @param res  the result of calculations
 * 
 */
public class operations {

    private double val1;
    private double val2;
    private double res;

    /**
     * @return the first value
     */
    public double getVal1() {
        return val1;
    }

    /**
     * Sets the first value.
     */
    public void setVal1(double val1) {
        this.val1 = val1;
    }

    /**
     * @return the second value
     */
    public double getVal2() {
        return val2;
    }

    /**
     * Sets the second value.
     */
    public void setVal2(double val2) {
        this.val2 = val2;
    }

    /**
     * @return the result
     */
    public double getRes() {
        return res;
    }

    /**
     * Sets the result of the calculation.
     */
    public void setRes(double res) {
        this.res = res;
    }

    /**
     * Performs a simple arithmetic operation based on user input.
     * 
     * @param userInput the operation to perform (1: add, 2: subtract, 3: multiply,
     *                  4: divide)
     * @return the result of the operation, or NaN if division by zero is attempted
     */

    public double simplePorcess(int userInput, double val1, double val2) {

        if (userInput == 1) {
            res = val1 + val2;
            return res;
        } else if (userInput == 2) {
            res = val1 - val2;
            return res;
        } else if (userInput == 3) {
            if (val1 * val2 == 0) { // without this if condition if your input is like -3 and 0 will return -0.0 so
                                    // you cant return negative zero
                return 0;
            }
            res = val1 * val2;
            return res;
        } else if (userInput == 4) {
            if (val2 == 0) {
                System.out.println("Division by zero is not allowed");
                return Double.NaN;
            } else {
                res = val1 / val2;
                return res;
            }
        } else {
            System.out.println("invaild input");
        }
        return res;
    }

    /**
     * Calculates the percentage of a value relative to a total.
     * 
     * @param val1 the part
     * @param val2 the total
     * @return the result of dividing {@code val1} by {@code val2} multiplied by a
     *         hundred , or NaN if division by zero is attempted
     */
    public double percentage(double val1, double val2) {
        if (val2 == 0) {
            System.out.println("The total can't be zero ");
            return Double.NaN;
        }
        res = (val1 / val2) * 100;
        return res;
    }

    /**
     * Calculates the exponentiation of a number.
     *
     * @param val1 the base
     * @param val2 the exponent
     * @return the result of raising {@code val1} to the power of {@code val2}
     */
    public double exponents(double val1, double val2) {
        res = Math.pow(val1, val2);
        return res;
    }

    /**
     * Calculates the factorial of a non-negative integer.
     *
     * @param val1 the number to calculate the factorial of
     * @return the factorial of {@code val1}
     */
    public double Factorial(double val1) {
        // To check that the number is not negative
        if (val1 < 0) {

            System.out.println("Factorial is not defined for negative numbers.");
            return -1;

        } else {
            res = 1.0;
            int pointer = (int) Math.round(val1);
            while (pointer != 0) {

                res = res * pointer;

                pointer--;

            }
            return res;
        }

    }

    /**
     * Checks whether each number in the array is even or odd.
     *
     * @param numbers an array of integers to check
     */
    public void checkNumber(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                System.out.println("the number " + numbers[i] + " is even");

            } else {
                System.out.println("the number " + numbers[i] + " is odd");
            }

        }
    }

    /**
     * Calculates the absolute value of a number.
     *
     * @param val1 the number to calculate the absolute value of
     * @return the absolute value of {@code val1}
     */
    public double Absolute(double val1) {
        int val = (int) Math.round(val1);
        return Math.abs(val);
    }

    /**
     * Calculates the average of a numbers entered by the user.
     * 
     * @param s1 the input from user
     *           The user can stop entering numbers by typing "stop".
     */
    public void AVG(Scanner s1) {

        double sum = 0;
        String input;
        double count = 0;

        while (true) {

            System.out.println("Enter the " + (int) (count + 1) + " number or enter 'stop' to finish");

            input = s1.next();

            if (input.equalsIgnoreCase("stop")) {

                break;
            }

            try {

                // convert the input from String type to double
                double number = Double.parseDouble(input);
                sum += number;
                count++;

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'stop' to finish.");
            }

        }

        if (count > 0) {
            res = sum / count;
            System.out.println("the AVG is: " + res);
        } else {
            System.out.println("No numbers were entered");
        }

    }

}
