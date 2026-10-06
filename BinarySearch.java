Program to Search an Element Using Binary Search

Aim:
To write and execute a Java program to search for a given element in a sorted array using binary search.

Algorithm:
Read the number of elements and store them in an array.
Read the array elements in sorted order.
Read the element x to be searched.
Initialize first = 0 and last = n - 1.
Find the middle position using mid = (first + last) / 2.
Compare the middle element with x.
Adjust first or last based on the comparison.
Display the position if the element is found; otherwise display not found.

PROGRAM:
import java.util.Scanner;

class BinarySearch {
    public static void main(String[] args) {
        int i, mid, first, last, x, n;
        int flag = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements of array (in sorted order):");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter element to search:");
        x = sc.nextInt();

        first = 0;
        last = n - 1;

        while (first <= last) {
            mid = (first + last) / 2;

            if (a[mid] > x) {
                last = mid - 1;
            } else if (a[mid] < x) {
                first = mid + 1;
            } else {
                flag = 1;
                System.out.println("Element found at position: " + (mid + 1));
                break;
            }
        }

        if (flag == 0) {
            System.out.println("Element not found");
        }


Outputl:
Enter number of elements:
5
Enter elements of array (in sorted order):
10
20
30
40
50
Enter element to search:
30
Element found at position: 3

RESULT:
Thus, the given element was successfully searched in the sorted array using binary search.
        sc.close();
    }
}
