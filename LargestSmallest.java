Program to Find the Sum, Largest and Smallest Number in an Array

Aim:
To write and execute a Java program to calculate the sum of array elements and find the largest and smallest elements in an array.

Algorithm:
Initialize an array with integer elements.
Initialize sum, min, and max with the first element.
Traverse the array from the second element.
Compare each element with max and update it if necessary.
Compare each element with min and update it if necessary.
Add each element to sum.
Display the sum, largest number, and smallest number

program:
public class LargestSmallest {
    public static void main(String[] args) {

        int a[] = {23, 34, 13, 64, 72, 90, 10, 15, 9, 27};

        int sum = a[0];   // include first element
        int min = a[0];
        int max = a[0];

        for (int i = 1; i < a.length; i++) {

            if (a[i] > max) {
                max = a[i];
            }

            if (a[i] < min) {
                min = a[i];
            }

            sum = sum + a[i];
        }

        System.out.println("The sum is : " + sum);
        System.out.println("Largest Number in array is : " + max);
        System.out.println("Smallest Number in array is : " + min);
    }
}

Output:
The sum is : 357
Largest Number in array is : 90
Smallest Number in array is : 9

Result:
Thus, the sum, largest number, and smallest number in the given array were successfully calculated
