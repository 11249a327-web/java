Program to Check Whether a Number is Even or Odd Using Switch Case

Aim:
To write and execute a Java program to check whether the given number is even or odd using a switch statement.

Algorithm:
Read a number n from the user.
Find the remainder using n % 2.
Use the remainder as the switch expression.
If the remainder is 0, display that the number is even.
If the remainder is 1, display that the number is odd.

PROGRAM:
import java.util.Scanner;

class EvenOddSwitch {
    public static void main(String args[]) {

        int n;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = s.nextInt();

        switch (n % 2) {
            case 0:
                System.out.println("This number is even");
                break;

            case 1:
                System.out.println("This number is odd");
                break;
        }

        s.close();
    }
}

Output:
Enter a number: 25
This number is odd

RESULT:
Thus, the given number was successfully checked and identified as even or odd using switch case
