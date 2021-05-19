package GUI;

import javax.swing.*;
import java.awt.*;

class MyDrawPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        g.fillRect(0,0,this.getWidth(),this.getHeight());
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);

        Color randomColor = new Color(red, green, blue);
        g.setColor(randomColor);
        g.fillOval(20, 20, 50, 50);
    }



}
