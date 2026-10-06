Program to Arrange Array Elements in Ascending Order

Aim:
To write and execute a Java program to arrange the elements of an array in ascending order.

Algorithm:
Read the number of elements n.
Create an integer array of size n.
Read all the elements into the array.
Compare each element with the remaining elements.
If the first element is greater, swap the two elements.
Repeat the comparison until all elements are arranged.
Display the elements in ascending order.

PROGRAM:
import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        int n, temp;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter no. of elements you want in array: ");
        n = s.nextInt();

        int a[] = new int[n];

        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        // Sorting logic (Ascending Order)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.print("Ascending Order: ");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.print(a[n - 1]);
    }
}


Output:
Enter no. of elements you want in array: 5
Enter all the elements:
50
20
40
10
30
Ascending Order: 10, 20, 30, 40, 50

RESULT:
Thus, the elements of the array were successfully arranged in ascending order
