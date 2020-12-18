/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OO_Restaurants;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class SuperClass_Parent {
    
    public double DriedChicken;
    public double Hamburger;
    public double Coffee;
    public double Cocacola;
    
    public double Meals;
    public double Drinks;
    public double TotalofMD;
    
    public double AllTotalofMD;
    
    public double GetAmount()
    {
        Meals = DriedChicken + Hamburger;
        Drinks = Coffee + Cocacola;
        TotalofMD = Meals + Drinks;
        AllTotalofMD = TotalofMD;
        return AllTotalofMD + Drinks;   
    }
    
    private JFrame frame;
    
    public void iExitSystem(){
        frame = new JFrame("Exit");
        
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Restaurant Management System", JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }
    
    //price=========================
    public double pDriedChicken = 30;
    public double pHamburger = 25;
    public double pCoffee = 20;
    public double pCocacola = 10;
    
    //tax===========================
    public double mcTax=0.9;
    
    public Double cFindTax(double cAmount){
        double FindTax = cAmount - (cAmount*mcTax);
        return FindTax;
    }
    
}
