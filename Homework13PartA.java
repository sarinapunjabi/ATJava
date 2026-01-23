import javax.swing.*;
import java.awt.*;
public class Homework13PartA extends JComponent{
    final static int CONTENT_WIDTH = 400;
    final static int CONTENT_HEIGHT = 400;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(CONTENT_WIDTH, CONTENT_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Homework13PartA drawing = new Homework13PartA();
        frame.add(drawing);
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        draw(g);
    }
    public static void draw(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 300, 300);

        g.setColor(Color.BLACK);
        g.fillOval(125, 130, 40, 40);
        g.fillOval(235, 130, 40, 40);

        g.setColor(Color.GRAY);
        g.drawLine(120, 250, 280, 250);
    }
}