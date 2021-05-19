package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class GUI {
    static JButton button = new JButton("click me");
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JButton button = new JButton("click me");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(300,300);
        frame.setVisible(true);

    }


    public static ActionEvent changeIT(){
        button.setText("I've been clicked");
        return null;
    }
}
