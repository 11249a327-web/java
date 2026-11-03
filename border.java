BorderLayout in Java

Aim:
To write a Java program to create a frame using BorderLayout and arrange five buttons in the North, South, East, West, and Center regions

Algorithm:
1. Import the AWT package.
2. Create a class named Border with the main() method.
3. Create a frame.
4. Set the frame layout to BorderLayout.
5. Create five buttons named North, South, East, West, and Center.
6. Add each button to its respective region.
7. Set the frame size and make it visible.

Program:
    
import java.awt.*;
import java.awt.event.*;

public class border
{
    public static void main(String[] args)
    {
        Frame f = new Frame("Border Layout");

        f.setLayout(new BorderLayout());

        Button b1 = new Button("North");
        Button b2 = new Button("South");
        Button b3 = new Button("East");
        Button b4 = new Button("West");
        Button b5 = new Button("Center");

        f.add(b1, BorderLayout.NORTH);
        f.add(b2, BorderLayout.SOUTH);
        f.add(b3, BorderLayout.EAST);
        f.add(b4, BorderLayout.WEST);
        f.add(b5, BorderLayout.CENTER);

        f.setSize(400, 300);
        f.setVisible(true);
    }
}


Result:
Thus, the Java program to implement BorderLayout by placing five buttons in the North, South, East, West, and Center regions was executed successfully
