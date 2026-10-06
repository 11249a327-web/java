Program to Check Whether a Year is a Leap Year or Not

Aim:
To write and execute a Java program to check whether the given year is a leap year or not using conditional statements.

Algorithm:
Read the year from the user.
Check whether the year is divisible by 400.
If divisible by 400, it is a leap year.
Otherwise, check whether it is divisible by 100.
If divisible by 100, it is not a leap year.
Otherwise, check whether it is divisible by 4.
If divisible by 4, it is a leap year; otherwise, it is not.

Program:
import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter any year: ");
        int year = s.nextInt();

        boolean flag = false;

        if (year % 400 == 0) {
            flag = true;
        } else if (year % 100 == 0) {
            flag = false;
        } else if (year % 4 == 0) {
            flag = true;
        } else {
            flag = false;
        }

        if (flag) {
            System.out.println("Year " + year + " is a Leap Year");
        } else {
            System.out.println("Year " + year + " is not a Leap Year");
        }

        s.close();
    }
}

Output:
Enter any year: 2024
Year 2024 is a Leap Year

Result:
Thus, the given year was successfully checked and identified as a leap year or not
