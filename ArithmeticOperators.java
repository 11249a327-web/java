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