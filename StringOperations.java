import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // 1. Length
        System.out.println("\n1. Length of string:");
        System.out.println("Length = " + str1.length());

        // 2. Character at a particular position
        System.out.println("\n2. Character at index 0:");
        System.out.println(str1.charAt(0));

        // 3. Concatenation
        System.out.println("\n3. Concatenation:");
        System.out.println(str1.concat(str2));

        // 4. String comparison
        System.out.println("\n4. String comparison:");
        System.out.println("equals() = " + str1.equals(str2));

        // 5. Compare ignoring case
        System.out.println("\n5. Compare ignoring case:");
        System.out.println("equalsIgnoreCase() = "
                + str1.equalsIgnoreCase(str2));

        // 6. Convert to uppercase
        System.out.println("\n6. Uppercase:");
        System.out.println(str1.toUpperCase());

        // 7. Convert to lowercase
        System.out.println("\n7. Lowercase:");
        System.out.println(str1.toLowerCase());

        // 8. Substring
        System.out.println("\n8. Substring:");
        if (str1.length() >= 3) {
            System.out.println(str1.substring(0, 3));
        }

        // 9. Contains
        System.out.println("\n9. Contains:");
        System.out.println("Contains 'a' = " + str1.contains("a"));

        // 10. Starts with
        System.out.println("\n10. Starts with:");
        System.out.println("Starts with 'A' = " + str1.startsWith("A"));

        // 11. Ends with
        System.out.println("\n11. Ends with:");
        System.out.println("Ends with 'a' = " + str1.endsWith("a"));

        // 12. Index of a character
        System.out.println("\n12. Index of 'a':");
        System.out.println(str1.indexOf('a'));

        // 13. Last index of a character
        System.out.println("\n13. Last index of 'a':");
        System.out.println(str1.lastIndexOf('a'));

        // 14. Replace
        System.out.println("\n14. Replace:");
        System.out.println(str1.replace('a', 'A'));

        // 15. Remove spaces from beginning and end
        System.out.println("\n15. Trim:");
        System.out.println(str1.trim());

        // 16. Check empty string
        System.out.println("\n16. Check empty:");
        System.out.println("Is empty = " + str1.isEmpty());

        // 17. Convert String to character array
        System.out.println("\n17. Character array:");
        char[] chars = str1.toCharArray();

        for (char c : chars) {
            System.out.print(c + " ");
        }

        // 18. Compare using compareTo()
        System.out.println("\n\n18. compareTo():");
        System.out.println(str1.compareTo(str2));

        // 19. Join strings
        System.out.println("\n19. Join:");
        System.out.println(String.join(" ", str1, str2));

        sc.close();
    }
}