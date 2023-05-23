/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.awt.*;
import javax.swing.*;

public class AdminInterface {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            JFrame frame = new JFrame("Admin Functions");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create buttons for admin functions
            JButton viewBooksButton = new JButton("View Books");
            JButton viewUsersButton = new JButton("View Users");
            JButton viewIssuedBooksButton = new JButton("View Issued Books");
            JButton issueBookButton = new JButton("Issue Book");
            JButton addUserButton = new JButton("Add User");
            JButton addBookButton = new JButton("Add Book");
            JButton returnBookButton = new JButton("Return Book");
            JButton createResetButton = new JButton("Create/Reset");

            // Create panel for the interface
            JPanel panel = new JPanel(new GridBagLayout());
            panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.anchor = GridBagConstraints.WEST;
            gbc.insets = new Insets(0, 0, 5, 0);
            panel.add(viewBooksButton, gbc);
            gbc.gridx = 1;
            panel.add(viewUsersButton, gbc);
            gbc.gridx = 2;
            panel.add(viewIssuedBooksButton, gbc);
            gbc.gridx = 3;
            panel.add(issueBookButton, gbc);
            gbc.gridy = 1;
            gbc.gridx = 0;
            panel.add(addUserButton, gbc);
            gbc.gridx = 1;
            panel.add(addBookButton, gbc);
            gbc.gridx = 2;
            panel.add(returnBookButton, gbc);
            gbc.gridx = 3;
            panel.add(createResetButton, gbc);

            Box box = Box.createHorizontalBox();
            box.add(panel);

            frame.getContentPane().add(box);
            frame.pack();
            frame.setVisible(true);
        });
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
