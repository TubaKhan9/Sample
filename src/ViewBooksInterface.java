/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class ViewBooksInterface {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new JFrame("View Books");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create table for book data
            String[] columnNames = {"BID", "BNAME", "GENRE", "PRICE"};
            Object[][] data = {
                {1, "War and Peace", "Mystery", 200},
                {2, "The Guest Book", "Fiction", 300},
                {3, "The Perfect Murder", "Mystery", 150},
                {4, "Accidental Presidents", "Biography", 250},
                {5, "The Wicked King", "Fiction", 350}
            };

            JTable table = new JTable(data, columnNames);
            table.setPreferredScrollableViewportSize(new Dimension(400, 150));
            table.setFillsViewportHeight(true);

            JScrollPane scrollPane = new JScrollPane(table);

            // Create panel for the interface
            JPanel panel = new JPanel(new GridBagLayout());
            panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.gridwidth = 2;
            gbc.fill = GridBagConstraints.BOTH;
            gbc.weightx = 1.0;
            gbc.weighty = 1.0;
            gbc.insets = new Insets(0, 0, 0, 0);
            panel.add(scrollPane, gbc);

            Box box = Box.createHorizontalBox();
            box.add(panel);

            frame.getContentPane().add(box);
            frame.pack();
            frame.setVisible(true);
        });
    }
}
