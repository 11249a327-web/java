Drawing a Human Face Using Java Swing

Aim:
To write a Java program to draw a human face using the Graphics class and Swing components.

Algorithm:
1. Import the java.awt and javax.swing packages.
2. Create a class named Face that extends JPanel.
3. Override the paintComponent() method.
4. Use drawOval() to draw the face, eyes, nose, and ears.
5. Use fillOval() and fillArc() to draw facial features.
6. Create a JFrame to display the human face.
7. Set the frame size and make it visible.

Program:

import java.awt.*;
import javax.swing.*;

public class Face extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawOval(40, 40, 120, 150);
        g.drawOval(57, 73, 30, 20);
        g.drawOval(110, 75, 30, 40);
        g.drawOval(68, 81, 10, 10);
        g.fillOval(121, 81, 8, 10);
        g.fillOval(85, 100, 30, 30);
        g.fillArc(69, 125, 80, 40, 180, 180);
        g.drawOval(92, 155, 30, 30);
        g.drawOval(100, 92, 15, 30);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Human Face");
        Face panel = new Face();

        frame.add(panel);
        frame.setSize(250, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

Result:
Thus, the Java program to draw a human face using Java Swing and Graphics methods was written and executed successfully.
