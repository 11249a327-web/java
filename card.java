Card Layout Using Java Applet

Aim:
To write a Java applet program to implement CardLayout using three buttons and display the next card when a button is clicked.

Algorithm:
1. Import the AWT, event, and applet packages.
2. Create a class named card that extends Applet and implements ActionListener.
3. Create a panel and set its layout to CardLayout.
4. Create three buttons and add them to the panel.
5. Register the action listener for all three buttons.
6. Define the actionPerformed() method.
7. Use next() to display the next card when a button is clicked.

Program:
    
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class card extends Applet implements ActionListener
{
    Panel p;
    CardLayout cl;
    Button b1, b2, b3;

    public void init()
    {
        cl = new CardLayout();
        p = new Panel();

        p.setLayout(cl);

        b1 = new Button("Card 1");
        b2 = new Button("Card 2");
        b3 = new Button("Card 3");

        p.add("First", b1);
        p.add("Second", b2);
        p.add("Third", b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        add(p);
    }

    public void actionPerformed(ActionEvent e)
    {
        cl.next(p);
    }
}

Result:
Thus, the Java applet program implementing CardLayout with three buttons and an ActionListener was written and executed successfully.
