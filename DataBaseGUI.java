
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class DataBaseGUI extends JFrame {
    public DataBaseGUI(DaoInterface daointerface) {
        setTitle("Message Database");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton createButton = new JButton("Create/Reset Database");

        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                daointerface.createDatabase();
                JOptionPane.showMessageDialog(null, "Database created/reset!");
            }
        });

        JPanel panel = new JPanel();
        panel.add(createButton);
        add(panel);
        setVisible(true);
       
}
    }






