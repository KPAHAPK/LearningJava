package GUI;

import javax.swing.*;
import java.awt.*;

public class Gradient extends JPanel {
    public static void main(String[] args) {

    }
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        GradientPaint gradientPaint = new GradientPaint(70, 70, Color.blue, 150, 150, Color.red);

        g2d.setPaint(gradientPaint);
        g2d.fillOval(70,70,100,100);
    }
}
