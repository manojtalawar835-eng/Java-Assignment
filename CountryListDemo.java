/* 5a. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark,
France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and display them on console
whenever the countries are selected on the list.
*/

package Swing;

import javax.swing.*;
import javax.swing.event.*;

public class CountryListDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Country List Demo");
        String[] countries = {"USA", "India", "Vietnam", "Canada", "Denmark",
                              "France", "Great Britain", "Japan", "Africa",
                              "Greenland", "Singapore"};

        JList<String> countryList = new JList<>(countries);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    for (String country : countryList.getSelectedValuesList()) {
                        System.out.println("Selected: " + country);
                    }
                }
            }
        });

        frame.add(new JScrollPane(countryList));
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
