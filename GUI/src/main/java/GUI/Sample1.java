package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sample1 implements ActionListener {

    class ColorListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            frame.repaint();
        }
    }

    class LabelListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            n++;
            label.setText("I've been changed " + n);
        }
    }
    JFrame frame;
    JLabel label;
    int n;

    public static void main(String[] args) {
        Sample1 s1 = new Sample1();
        s1.go();

    }
    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        label = new JLabel("I'm label");

        JButton button = new JButton("Change color");
        button.addActionListener(new ColorListener());

        JButton button2 = new JButton("Change label");
        button2.addActionListener(new LabelListener());

        MyDrawPanel panel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.EAST, button2);
        frame.getContentPane().add(BorderLayout.WEST, label);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event){
        frame.repaint();
    }
}
