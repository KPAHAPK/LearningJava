package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animation implements ActionListener {

    JFrame frame;
    DrawPanel panel;
    int x = 20;
    int y = 20;

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    class DrawPanel extends JPanel implements ActionListener {
        @Override
        protected void paintComponent(Graphics g) {
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
            g.setColor(Color.blue);
            g.fillOval(x, y, 50, 50);


        }

        @Override
        public void actionPerformed(ActionEvent e) {


        }
    }

    public static void main(String[] args) {
        Animation animation = new Animation();
        animation.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton button = new JButton("Click me");
        button.addActionListener(new DrawPanel());

        panel = new DrawPanel();

        frame.getContentPane().add(panel);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.setSize(300, 300);
        frame.setVisible(true);

        }
    }
}


