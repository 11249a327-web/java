Program to Read a File Using FileReader in Java

 Aim:
To write and execute a Java program to read and display the contents of a text file using the FileReader class.

Algorithm:
Create a FileReader object for sample.txt.
Declare an integer variable to store each character.
Read the file character by character.
Continue reading until the end of the file is reached.
Convert each character to char and display it.
Close the file after reading.
Handle any file reading errors using IOException.

Program:
import java.io.FileReader;
import java.io.IOException;

class FileReaderDemo
{
    public static void main(String args[])
    {
        try
        {
            FileReader fr = new FileReader("sample.txt");

            int ch;

            while ((ch = fr.read()) != -1)
            {
                System.out.print((char) ch);
            }

            fr.close();
        }
        catch (IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

Output:

Welcome to Java File Handling
This is a sample text file.

Result:
Thus, the Java program successfully reads and displays the contents of the file using FileReader
