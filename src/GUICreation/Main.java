package GUICreation;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame();

        JPanel panel = new JPanel();

        JButton btn = new JButton();
        btn.setText("Start");
        btn.setSize(150, 30);
        btn.setFont(new Font("Arial", Font.BOLD, 14));
        btn.setVisible(true);

        window.setTitle("Hello world!!!");
        window.setVisible(true);
        window.setSize(500, 500);

        window.add(panel);
        panel.add(btn);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
