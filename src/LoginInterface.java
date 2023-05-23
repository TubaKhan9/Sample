/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author GTS
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class UserDao {
    public boolean authenticate(String username, String password) {
        return username.equals("admin") && password.equals("password");
    }
}

public class LoginInterface extends JFrame {

    private UserDao userDao;

    public LoginInterface() {
        userDao = new UserDao();

        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(300, 150));
        
        JPanel contentPanel = new JPanel(new BorderLayout());
        JPanel centerPanel = new JPanel(new GridLayout(3, 2));
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        
        JLabel usernameLabel = new JLabel("Username");
        JLabel passwordLabel = new JLabel("Password");
        JTextField usernameField = new JTextField(20);
        JPasswordField passwordField = new JPasswordField(20);
        JButton loginButton = new JButton("Login");

        

        centerPanel.add(usernameLabel);
        centerPanel.add(usernameField);
        centerPanel.add(passwordLabel);
        centerPanel.add(passwordField);
        buttonPanel.add(loginButton);
        
        contentPanel.add(centerPanel, BorderLayout.CENTER);
        contentPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(contentPanel);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (userDao.authenticate(username, password)) {
                    JOptionPane.showMessageDialog(LoginInterface.this, "Login successful!");
                    AdminInterface AdminInterface = new AdminInterface();
                    AdminInterface.setVisible(true);
                   
                    
  
                
                
                } else {
                    JOptionPane.showMessageDialog(LoginInterface.this, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

           
        });

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        LoginInterface loginInterface = new LoginInterface();
        loginInterface.setVisible(true);
    }
}