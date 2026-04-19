/* 5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark,
France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and display the capital of the
countries on console whenever the countries are selected on the list.
*/

package Swing;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class CountryCapitalListDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Country-Capital List Demo");

        String[] countries = {"USA", "India", "Vietnam", "Canada", "Denmark",
                              "France", "Great Britain", "Japan", "Africa",
                              "Greenland", "Singapore"};

        Map<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("Vietnam", "Hanoi");
        capitals.put("Canada", "Ottawa");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("France", "Paris");
        capitals.put("Great Britain", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("Africa", "Addis Ababa (AU HQ)");
        capitals.put("Greenland", "Nuuk");
        capitals.put("Singapore", "Singapore");

        JList<String> countryList = new JList<>(countries);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    for (String country : countryList.getSelectedValuesList()) {
                        System.out.println("Capital of " + country + " is " + capitals.get(country));
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
