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