package calculator;

import java.util.*;

/**
 * A simple calculator program that performs various mathematical operations.
 * Supports addition, subtraction, multiplication, division, percentage,
 * exponentiation, factorial, odd/even checks, absolute values, and average
 * calculations.
 */

public class App {
    public static void main(String[] args) {

        double res;

        boolean keep = true; // Control variable for the while loop

        Scanner s1 = new Scanner(System.in);

        operations p1 = new operations(); // object from class operations

        System.out.println("Welcome user, this program is simple calculator ");
        System.out.println("Choose a process to perform");

        while (keep) {

            System.out.println(
                    " \n 0-for end \n 1-sum \n 2-Subtract \n 3-Multiply \n 4-Divide \n 5-percentage \n 6-exponents\n 7-Factorial\n 8-Determine the number as odd or even\n 9-Absolute value\n 10-AVG ");
            try {
                int inp = s1.nextInt(); // User input

                if (inp == 0) {
                    keep = false; // Exit the loop
                } else {
                    switch (inp) {
                        case 1: // Addition
                        case 2: // Subtraction
                        case 3: // Multiplication
                        case 4: // Division
                            System.out.println("Write 1st number");
                            p1.setVal1(s1.nextDouble());
                            System.out.println("Write 2nd number");
                            p1.setVal2(s1.nextDouble());
                            res = p1.simplePorcess(inp, p1.getVal1(), p1.getVal2());
                            System.out.println("The result is: " + res);
                            break;

                        case 5: // Percentage
                            System.out.println("Write part number");
                            p1.setVal1(s1.nextDouble());
                            System.out.println("Write total number");
                            p1.setVal2(s1.nextDouble());
                            res = p1.percentage(p1.getVal1(), p1.getVal2());
                            System.out.println("The Percentage is: " + res);
                            break;

                        case 6:// Exponentiation

                            System.out.println("Write the base value");
                            p1.setVal1(s1.nextDouble());
                            System.out.println("Write the exponent value");
                            p1.setVal2(s1.nextDouble());
                            res = p1.exponents(p1.getVal1(), p1.getVal2());
                            System.out.println("the result is: " + res);
                            break;

                        case 7:// Factorial
                            System.out.println("Write the number 'Note that this process accepts just integer'");
                            p1.setVal1(s1.nextDouble());
                            res = p1.Factorial(p1.getVal1());
                            System.out.println("the result is: " + res);
                            break;

                        case 8:// Check Even or Odd

                            System.out.println("Enter the numbers ");
                            int dig = s1.nextInt();
                            if (dig <= 0) {
                                System.out.println("you enter a nigative or zero try agin");
                            } else {
                                int[] num = new int[dig]; // the user input is the array size

                                for (int i = 0; i < num.length; i++) {

                                    System.out.println("Enter the " + (i + 1) + " number:");
                                    num[i] = s1.nextInt();
                                }

                                p1.checkNumber(num);
                            }
                            break;

                        case 9:// Absolute Value
                            System.out.println("Enter the number, whether positive or negative ");

                            p1.setVal1(s1.nextDouble());
                            double absRes = p1.Absolute(p1.getVal1());
                            System.out.println("The absolute value is: " + absRes);

                            break;

                        case 10:// Calculate Average

                            p1.AVG(s1);
                            break;

                        default:
                            break;
                    }
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number next time .");
                s1.next(); // Clear the invalid input
            }
        }
        s1.close();

    }

}
