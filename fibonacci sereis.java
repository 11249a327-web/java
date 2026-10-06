Program to Generate Fibonacci Series up to N Terms

Aim:
To write and execute a Java program to generate the Fibonacci series up to the given number of terms.

Algorithm:
Read the number of terms n.
Initialize a = 0 and b = 1.
Display a if the number of terms is at least 1.
Display b if the number of terms is at least 2.
Calculate the next term using c = a + b.
Display c and update a = b and b = c.
Repeat the process until n terms are generated

Program:
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = s.nextInt();

        int a = 0, b = 1, c;

        System.out.print("Fibonacci Series: ");

        if (n >= 1)
            System.out.print(a + " ");

        if (n >= 2)
            System.out.print(b + " ");

        for (int i = 3; i <= n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}

Output:
Enter the number of terms: 8
Fibonacci Series: 0 1 1 2 3 5 8 13

Result:
Thus, the Fibonacci series up to the given number of terms was successfully generated.
