Program to Display Students Scoring 60 and Above

Aim:
To write and execute a Java program to read the names and marks of six students and display the students who have scored 60 marks or above.

Algorithm:
Create arrays to store the names and marks of six students.
Read the name and marks of each student.
Store the values in the respective arrays.
Traverse the arrays and check each student's marks.
If the marks are greater than or equal to 60, display the student's name and marks.
Continue the process for all six students.


Program:
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


Output:
Enter Name of Student and Marks of Subject 1: Arun 75
Enter Name of Student and Marks of Subject 2: Priya 55
Enter Name of Student and Marks of Subject 3: Ravi 82
Enter Name of Student and Marks of Subject 4: Anu 48
Enter Name of Student and Marks of Subject 5: Kiran 60
Enter Name of Student and Marks of Subject 6: Meena 91

Students scoring 60 and above:
Arun 75
Ravi 82
Kiran 60
Meena 91


Result:
Thus, the students who scored 60 marks and above were successfully identified and displayed.
