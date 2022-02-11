import javax.swing.*;
import java.text.NumberFormat;

public class Main1f {
    public static void main (String args[]) {
        displayWelcome();
        String location = getLocation();
        String aptNum1 = getApartmentNum();
        int sqrFeet1 = getSquareFeet(aptNum1);
        double price1 = getPrice(aptNum1);

        String aptNum2 = getApartmentNum();
        int sqrFeet2 = getSquareFeet(aptNum2);
        double price2 = getPrice(aptNum2);

        displayApartment(location, aptNum1, sqrFeet1, price1);
        displayApartment(location, aptNum2, sqrFeet2, price2);
        displayTotals(sqrFeet1, sqrFeet2, price1, price2);
    }

    public static void displayWelcome() {
        JOptionPane.showMessageDialog(null, "Zac Anderson COMC2740 Ex1F1\nProperty Managment");
    }

    public static String getLocation() {
        String loc = JOptionPane.showInputDialog("Building Location");
        return loc;
    }

    public static String getApartmentNum() {
        String num = JOptionPane.showInputDialog("Apartment Number");
        return num;
    }

    public static int getSquareFeet(String aptNum) {
        String strSqrFeet = JOptionPane.showInputDialog("Square feet for Apt# " + aptNum);
        int sqrfeet = Integer.parseInt(strSqrFeet);
        return sqrfeet;
    }

    public static double getPrice(String aptNum) {
        String strGetPrice = JOptionPane.showInputDialog("Price for Apt# " + aptNum);
        double price = Double.parseDouble(strGetPrice);
        return price;
    }


    public static void displayApartment(String location, String aptNum, int sqrFeet, double price) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        JOptionPane.showMessageDialog(null,"Location: " + location
        + "\nApartment #: " + aptNum + "\nSquare Feet: " + sqrFeet + "\nPrice: " + currency.format(price));

    }

    public static void displayTotals(int sqrFeet1, int sqrFeet2, double price1, double price2) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        int totalSqFeet = (sqrFeet1 + sqrFeet2);
        double totalPrice = (price1 + price2);
        JOptionPane.showMessageDialog(null, "Total square feet: " + totalSqFeet
        + "\nTotal monthly revenue:  " + currency.format(totalPrice));
    }

}
