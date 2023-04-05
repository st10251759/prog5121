
package com.mycompany.lecture10_bills;


public class bill {
       private String strCustomer;
   private double dblMinutes, dblCost;
   
    
   //constructor receiving var
   
   public bill (String strName,double dblCostPerMin,double dblMinsTalked){
   strCustomer= strName;
   dblMinutes= dblMinsTalked;
   dblCost= dblCostPerMin;
   
} //
    public String getName(){
    return strCustomer;
 }
    
    public double getTotalBill(){
        return (dblMinutes * dblCost);
    }
}
