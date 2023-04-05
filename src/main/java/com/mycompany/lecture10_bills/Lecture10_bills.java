

package com.mycompany.lecture10_bills;
import javax.swing.*;

public class Lecture10_bills {

    public static void main(String[] args) {
               String strName= JOptionPane.showInputDialog("Enter the customer's name:");
       double dblMinsTalked= Double.parseDouble(JOptionPane.showInputDialog(null, "Enter mins talked"));
              double dblCostPerMin= Double.parseDouble(JOptionPane.showInputDialog(null, "Enter cost per minute"));

       //send var to constructor in bill class
       bill b = new bill(strName,dblCostPerMin, dblMinsTalked);
       JOptionPane.showMessageDialog(null, "Customer NAME: "+ b.getName().toUpperCase() + "\n" + "Total Due: R " + b.getTotalBill());
    }
}
