import javax.swing.*;
import java.awt.*;

public class Homework13PartC extends JComponent {
    final static int CONTENT_WIDTH = 400;
    final static int CONTENT_HEIGHT = 400;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(CONTENT_WIDTH, CONTENT_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Homework13PartC canvas = new Homework13PartC();
        frame.add(canvas);
        frame.setVisible(true);
    }

    public void paintComponent(Graphics g) {
        drawBackground(g);
        drawRose(g);
    }

    public static void drawBackground(Graphics g) {
        g.setColor(new Color(244, 182, 182));
        g.fillRect(0, 0, CONTENT_WIDTH, CONTENT_HEIGHT);
    }

    public static void drawRose(Graphics g) {
        g.setColor(Color.BLUE);
        int steps = 1000;
        double scale = 150.0;

        int centerX = CONTENT_WIDTH / 2;
        int centerY = CONTENT_HEIGHT / 2;
        int prevX = 0;
        int prevY = 0;

        for (int i = 0; i <= steps; i++) {
            double theta = (2.0 * Math.PI) * i / steps;
            double r = Math.cos(2.0 * theta);
            double x = scale * r * Math.cos(theta);
            double y = scale * r * Math.sin(theta);

            int plotX = centerX + (int) x;
            int plotY = centerY - (int) y;

            if (i > 0) {
                g.drawLine(prevX, prevY, plotX, plotY);
            }

            prevX = plotX;
            prevY = plotY;
        }
    }
}