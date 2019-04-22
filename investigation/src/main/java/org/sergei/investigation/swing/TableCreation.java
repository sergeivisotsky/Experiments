package org.sergei.investigation.swing;

import javax.swing.*;

public class TableCreation extends JFrame {

    private static final long serialVersionUID = 1L;

    public TableCreation() {
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
            TableCreation frame = new TableCreation();
            frame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
