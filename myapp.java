import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;

class MyFrame extends JFrame implements Runnable {
    JLabel label;
    Thread t;
    int c;

    public MyFrame() {
        label = new JLabel("jayanth");
        this.getContentPane().setLayout(null);
        label.setBounds(300, 200, 250, 50);
        this.getContentPane().add(label);
        Font f = new Font("Arial", Font.BOLD, 50);
        label.setFont(f);

        t = new Thread(this);
        t.start();
    }

    public void run() {
        Color[] colors = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA,
                new Color(75, 0, 130), new Color(128, 0, 128) };
        while (true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            label.setForeground(colors[c]);
            c = (c + 1) % colors.length;
        }
    }

    public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setBounds(100, 100, 800, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}