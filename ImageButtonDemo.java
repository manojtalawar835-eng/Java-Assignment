/* 4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour Glass
is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is pressed by
implementing the event handling mechanism with addActionListener( ).
*/



package Button;
import javax.swing.*;
import java.awt.event.*;

public class ImageButtonDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Button Demo");
        JLabel label = new JLabel("Press an image button", JLabel.CENTER);

        // Load images (make sure images are in project folder)
        ImageIcon clockIcon = new ImageIcon("digital_clock.png");
        ImageIcon hourGlassIcon = new ImageIcon("hour_glass.png");

        JButton btnClock = new JButton(clockIcon);
        JButton btnHourGlass = new JButton(hourGlassIcon);

        // Add ActionListeners
        btnClock.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Digital Clock is pressed");
            }
        });

        btnHourGlass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hour Glass is pressed");
            }
        });

        frame.setLayout(new java.awt.GridLayout(3, 1));
        frame.add(label);
        frame.add(btnClock);
        frame.add(btnHourGlass);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
