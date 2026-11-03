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