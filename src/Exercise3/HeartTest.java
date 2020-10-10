package Exercise3;
/*  Program created by Uchechi
    Date:   27/09/2020
    Time:   10:20 pm
*/


import javax.swing.*;

public class HeartTest {

    public static void main(String[] args) {

        String firstName = JOptionPane.showInputDialog("First name: ");
        String lastName = JOptionPane.showInputDialog("Last name: ");
        int month = Integer.parseInt(JOptionPane.showInputDialog("Month of birth: "));
        int day = Integer.parseInt(JOptionPane.showInputDialog("Day of birth: "));
        int year = Integer.parseInt(JOptionPane.showInputDialog("Year of birth: "));
        int currentyear = Integer.parseInt(JOptionPane.showInputDialog("Enter the current year"));

        Ex3_16 user = new Ex3_16(firstName, lastName, month, day, year, currentyear);
        String message = firstName + " " + lastName + " " + " born " + month + "/" + day + "/" + year + "\n"
                + "Age " + user.getAge() + " with maximum heart rate " + user.getMaxHeartRate() + "\nhas " + user.getTargetRate();

        JOptionPane.showMessageDialog(null, message);

    }

}
