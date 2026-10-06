Armstrong Number Program

Aim:
To write and execute a Java program to check whether the given number is an Armstrong number or not.

Algorithm:
Read a number num from the user.
Store the original number in original.
Initialize sum = 0.
Extract each digit using num % 10.
Find the cube of each digit and add it to sum.
Remove the last digit using num / 10.
Repeat until all digits are processed.
Compare sum with original.
Display whether the number is an Armstrong number or not.

program:
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }

output:
Enter a number: 153
153 is an Armstrong number

RESULT:
Thus, the Java program to check whether the given number is an Armstrong number or not was successfully executed

        sc.close();
    }
}
