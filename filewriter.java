Program to Write Data into a File Using FileWriter in Java

Aim:
To write and execute a Java program to create a file and write uppercase alphabets into it using the FileWriter class.

Algorithm:
Create a FileWriter object for sample2.txt.
Initialize a character variable with ASCII value 65.
Write characters from A to Z into the file.
Repeat the process until ASCII value 90.
Close the file.
Handle exceptions using Exception.

Program:
import java.io.*; class Filewriter
{
public static void main(String[]args)
{
try
{
FileWriter fw= new FileWriter("sample2.txt"); for(char i=65;i<91;i++)
{
fw.write(i);
}
fw.close();
}
catch(Exception e)
{
System.out.println("Exception :"+e);
}
}
}

Output:

ABCDEFGHIJKLMNOPQRSTUVWXYZ

Result:
Thus, the program successfully writes the uppercase alphabets from A to Z into the file using FileWriter.
