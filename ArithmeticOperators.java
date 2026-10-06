Arithmetic Operators in Java

Aim:
To write and execute a Java program to perform different arithmetic operations such as addition, subtraction, multiplication, division, and modulus on two numbers using a menu-driven approach.

Algorithm:
Import the Scanner class to read input from the user.
Create a Scanner object.
Read two numbers from the user.
Display the list of arithmetic operations.
Read the user's choice.
Use a switch statement to perform the selected operation.
Perform addition when the choice is 1.
Perform subtraction when the choice is 2.
Perform multiplication when the choice is 3.
Perform division when the choice is 4 and check whether the second number is zero.
Perform modulus when the choice is 5 and check whether the second number is zero.
If the choice is 6, exit the program.
Display an error message for an invalid choice.
Repeat the process until the user chooses to exit.

program:
import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        while (true) {

            System.out.println();
            System.out.println("Enter the two numbers to perform operations");

            System.out.print("Enter the first number: ");
            int x = s.nextInt();

            System.out.print("Enter the second number: ");
            int y = s.nextInt();

            System.out.println("Choose the operation you want to perform");
            System.out.println("1. ADDITION");
            System.out.println("2. SUBTRACTION");
            System.out.println("3. MULTIPLICATION");
            System.out.println("4. DIVISION");
            System.out.println("5. MODULUS");
            System.out.println("6. EXIT");

            int n = s.nextInt();

            switch (n) {

                case 1:
                    System.out.println("Result: " + (x + y));
                    break;

                case 2:
                    System.out.println("Result: " + (x - y));
                    break;

                case 3:
                    System.out.println("Result: " + (x * y));
                    break;

                case 4:
                    if (y != 0) {
                        float div = (float) x / y;
                        System.out.println("Result: " + div);
                    } else {
                        System.out.println("Cannot divide by zero!");
                    }
                    break;

                case 5:
                    if (y != 0) {
                        System.out.println("Result: " + (x % y));
                    } else {
                        System.out.println("Cannot perform modulus with zero!");
                    }
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    s.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please select 1-6.");
            }
        }
    }
}

output:
Enter the two numbers to perform operations

Enter the first number: 20
Enter the second number: 10

Choose the operation you want to perform
1. ADDITION
2. SUBTRACTION
3. MULTIPLICATION
4. DIVISION
5. MODULUS
6. EXIT

1
Result: 30

RESULT:
Thus, the Java program to perform addition, subtraction, multiplication, division, and modulus using arithmetic operators and a menu-driven switch statement was successfully executed.
