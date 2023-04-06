import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChangingText extends JPanel implements Runnable {
    private static final long serialVersionUID = 1L;
    private int x = 20, y = 50;
    private Color color = Color.BLACK;
    private String text = "Hello, world!";
    private Font font = new Font("Arial", Font.BOLD, 20);

    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            color = getNextColor();
            repaint();
        }
    }

    private Color getNextColor() {
        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();

        if (r == 255 && g < 255 && b == 0) {
            g++;
        } else if (r > 0 && g == 255 && b == 0) {
            r--;
        } else if (r == 0 && g == 255 && b < 255) {
            b++;
        } else if (r == 0 && g > 0 && b == 255) {
            g--;
        } else if (r < 255 && g == 0 && b == 255) {
            r++;
        } else if (r == 255 && g == 0 && b > 0) {
            b--;
        }

        return new Color(r, g, b);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(font);
        g.setColor(color);
        g.drawString(text, x, y);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Changing Text");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ColorChangingText panel = new ColorChangingText();
        frame.add(panel);
        frame.setBounds(100, 100, 400, 200);
        frame.setVisible(true);

        Thread thread = new Thread(panel);
        thread.start();
    }
}
