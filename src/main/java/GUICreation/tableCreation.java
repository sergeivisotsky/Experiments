package GUICreation;

import javax.swing.*;

public class tableCreation extends JFrame {

    public tableCreation() {
        setTitle("Employee data manager");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 500);
        JPanel panel = new JPanel();
        add(panel);
        setContentPane(panel);
        setLocationRelativeTo(null);
        JTable table = new JTable(3,3);
        add(table);
    }

    public static void main(String[] args) {
        try {
            tableCreation frame = new tableCreation();
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
