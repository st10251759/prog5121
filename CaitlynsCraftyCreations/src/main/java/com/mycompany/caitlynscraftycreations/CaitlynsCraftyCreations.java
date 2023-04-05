
package com.mycompany.caitlynscraftycreations;
import java.util.Scanner;

public class CaitlynsCraftyCreations {

    public static void main(String[] args) {
    String product;
    double materialCost;
    double numHoursWorked;
    double price;
        
    Scanner input = new Scanner(System.in);  
    
       System.out.println("Enter your product >>");
       product = input.nextLine();
       
       System.out.println("Enter cost of materials >>");
       materialCost = input.nextDouble();
       
       System.out.println("Enter hours worked on the Job >>");
       numHoursWorked = input.nextDouble();
       
       price = calCost(materialCost, numHoursWorked);
       
       System.out.println("The price for " + product + " is $" + price);
    }

    private static double calCost(double materialCost, double numHoursWorked) {
    double price;
    final double RATE_HOURS = 12;
    final double RATE_SHIPPING = 7;
    price = materialCost + (numHoursWorked*RATE_HOURS) + RATE_SHIPPING;
    return price;
    }
}
