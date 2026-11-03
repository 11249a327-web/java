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