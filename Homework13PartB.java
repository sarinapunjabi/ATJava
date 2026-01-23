import javax.swing.*;
import java.awt.*;
public class Homework13PartB extends JComponent {
    final static int CONTENT_WIDTH = 400;
    final static int CONTENT_HEIGHT = 400;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(CONTENT_WIDTH, CONTENT_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Homework13PartB canvas = new Homework13PartB();
        frame.add(canvas);
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        draw(g);
    }

    public static void draw(Graphics g) {
        int size = 100;
        for (int row = 0; row < 4; row++)
        {
            for (int col = 0; col < 4; col++)
            {
                setTileColor(g, row, col);
                g.fillRect(col * size, row * size, size, size);
            }
        }
    }

    public static void setTileColor(Graphics g, int row, int col) {
        if ((row + col) % 2 == 0)
        {
            g.setColor(Color.BLUE);
        }
        else
        {
            g.setColor(Color.RED);
        }
    }
}

// i used chat gpt to debug my code because the image wasn't showing up 

