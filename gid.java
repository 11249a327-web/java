Grid Layout Using Java Applet

Aim:
To write a Java applet program to create ten buttons labelled A to J using GridLayout and arrange them in five rows and two columns with 20-pixel insets on all four sides.

Algorithm:
1. Import the java.awt, java.applet, and java.io packages.
2. Create a class named gid that extends the Applet class.
3. Declare ten button variables, from b1 to b10.
4. Define the init() method and set the layout to GridLayout(5, 2).
5. Create ten buttons labelled A to J.
6. Add all ten buttons to the applet using separate add() statements.
7. Override the getInsets() method to set 20-pixel insets on all four sides.

Program:
    
import java.awt.*;
import java.applet.*;
import java.io.*;

public class gid extends Applet
{
    Button b1, b2, b3, b4, b5;
    Button b6, b7, b8, b9, b10;

    public void init()
    {
        setLayout(new GridLayout(5, 2));

        b1 = new Button("A");
        b2 = new Button("B");
        b3 = new Button("C");
        b4 = new Button("D");
        b5 = new Button("E");
        b6 = new Button("F");
        b7 = new Button("G");
        b8 = new Button("H");
        b9 = new Button("I");
        b10 = new Button("J");

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
    }

    public Insets getInsets()
    {
        return new Insets(20, 20, 20, 20);
    }
}

Result:
Thus, the Java applet program using GridLayout was written and executed successfully, displaying ten buttons labelled A to J in five rows and two columns.
