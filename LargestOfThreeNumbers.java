Program to Find the Largest of Three Numbers

Aim:
To write and execute a Java program to find the largest among three given integers using conditional statements.

Algorithm:
Read three integers x, y, and z.
Compare x with y and z.
If x is greater than both, display the first number as largest.
Otherwise, compare y with x and z.
If y is greater than both, display the second number as largest.
Otherwise, compare z with x and y.
Display the appropriate largest number or an equal-number message.

    
Program:
import java.util.Scanner;

class LargestOfThreeNumbers {
    public static void main(String args[]) {

        int x, y, z;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter three integers: ");
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        if (x > y && x > z) {
            System.out.println("First number is largest.");
        } else if (y > x && y > z) {
            System.out.println("Second number is largest.");
        } else if (z > x && z > y) {
            System.out.println("Third number is largest.");
        } else {
            System.out.println("The numbers are not distinct or some are equal.");
        }
        in.close();
    }
}

output:
Enter three integers: 25 45 15
Second number is largest.

Result:
Thus, the largest among the three given numbers was successfully determined using Java conditional statements
