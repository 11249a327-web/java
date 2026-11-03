Drawing Different Shapes Using Java Applet

Aim:
To write a Java applet program to draw a line, rectangle, filled rectangle, rounded rectangle, filled rounded rectangle, and two intersecting lines using Graphics methods.

Algorithm
1. Import the Applet and Graphics classes.
2. Create a class named Shapes that extends the Applet class.
3. Define the paint() method.
4. Use drawLine() to draw a line and two intersecting lines.
5. Use drawRect() and fillRect() to draw a rectangle and a filled rectangle.
6. Use drawRoundRect() and fillRoundRect() to draw rounded rectangles

Program:

import java.applet.Applet;
import java.awt.Graphics;

public class linerect extends Applet
{
    public void paint(Graphics g)
    {
        g.drawLine(20, 20, 100, 20);

        g.drawRect(20, 40, 100, 50);

        g.fillRect(150, 40, 100, 50);

        g.drawRoundRect(20, 110, 100, 50, 20, 20);

        g.fillRoundRect(150, 110, 100, 50, 20, 20);

        g.drawLine(20, 200, 100, 250);
        g.drawLine(100, 200, 20, 250);
    }
}

Result:
Thus, the Java applet program to draw different shapes using Graphics methods was written and executed successfully.
