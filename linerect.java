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