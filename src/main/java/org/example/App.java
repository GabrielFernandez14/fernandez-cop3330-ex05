/* Gabriel Fernandez
 * COP3330 - Summer CV01
 * "Motivated" Practice Exercises
 * Exercise 05 - Simple Math
 */

package org.example;
import java.util.Scanner;

public class App 
{
    // Main function
    public static void main( String[] args )
    {
        // Prompt user for the first input, and convert datatype to int
        System.out.println("What is the first number?");
        Scanner firstNumInput = new Scanner(System.in);
        int firstNum = firstNumInput.nextInt();

        // Repeat for second number
        System.out.println("What is the second number?");
        Scanner secondNumInput = new Scanner(System.in);
        int secondNum = secondNumInput.nextInt();

        // Do the math operations and store in their respective variables
        int sum = firstNum + secondNum;
        int difference = firstNum - secondNum;
        int product = firstNum * secondNum;
        int quotient = firstNum / secondNum;

        // Disgusting print statement that definitely could have been simplified using
        // a function or something
        System.out.println(firstNum + " + " + secondNum + " = " + sum + "\n"
                + firstNum + " - " + secondNum + " = " + difference + "\n"
                + firstNum + " * " + secondNum + " = " + product + "\n"
                + firstNum + " / " + secondNum + " = " + quotient);
    }
}
