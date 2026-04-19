package Button;
import javax.swing.*;
import java.awt.event.*;

public class CountryButtonDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Country Button Demo");
        JButton btnIndia = new JButton("India");
        JButton btnSrilanka = new JButton("Srilanka");
        JLabel label = new JLabel("Press a button", JLabel.CENTER);

        // Add ActionListeners
        btnIndia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("India is pressed");
            }
        });

        btnSrilanka.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Srilanka is pressed");
            }
        });

        frame.setLayout(new java.awt.GridLayout(3, 1));
        frame.add(label);
        frame.add(btnIndia);
        frame.add(btnSrilanka);

        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
