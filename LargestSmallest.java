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