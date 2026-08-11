import java.util.Scanner;

public class MarksAbvsixty {
    public static void main(String args[]) {

        int marks[] = new int[6];
        String name[] = new String[6];   // keep same size as marks

        Scanner scanner = new Scanner(System.in);

        // Input
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter Name of Student and Marks of Subject " + (i + 1) + ": ");
            name[i] = scanner.next();
            marks[i] = scanner.nextInt();
        }

        // Output students with marks >= 60
        System.out.println("\nStudents scoring 60 and above:");
        for (int i = 0; i < 6; i++) {
            if (marks[i] >= 60) {
                System.out.println(name[i] + " " + marks[i]);
            }
        }

        scanner.close();
    }
}