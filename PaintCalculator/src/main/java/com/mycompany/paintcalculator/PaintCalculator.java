
package com.mycompany.paintcalculator;
import java.util.Scanner;

public class PaintCalculator {

    public static void main(String[] args) {
        double dblPricePaint = 0.0;
        Scanner scan = new Scanner(System.in); 
        
        //prompt user for the lenght width and height of room
        System.out.print("Enter the length of the room: ");
        double dblLength = scan.nextDouble();
        
        System.out.print("Enter the width of the room: ");
        double dblWidth = scan.nextDouble();
        
        System.out.print("Enter the height of the room: ");
        double dblHeight = scan.nextDouble();
        
        
    dblPricePaint = CalcPaintRequired(dblLength, dblWidth, dblHeight);
     //display the cost to paint the walls
        System.out.println("The cost to paint the walls is : $" + dblPricePaint);       
        
    }


    //method that Calulates the area of the room without painting the ceiling and the floor
    private static double CalcWallArea(double dblLength, double dblWidth, double dblHeight) {
       double dblTotalArea =  (2 * dblLength*dblHeight) + (2 * dblHeight * dblWidth);
       return dblTotalArea;
    }
        //method that calulates the number of gallons of paint required
    public static double CalcPaintRequired(double dblLength, double dblWidth, double dblHeight) {
        
        double dblArea = CalcWallArea(dblLength, dblWidth, dblHeight);
        double gallons = dblArea / 350;
        System.out.println("The number of gallons of paint needed: " +gallons);
        double dblPrice = 32 * gallons;
        return dblPrice;
    }
    
    
}
