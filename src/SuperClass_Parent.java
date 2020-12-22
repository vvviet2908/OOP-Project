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
    
    public double Beef;
    public double Vegetable;
    public double Sprite;
    public double Cocacola;
    
    public double Meals;
    public double Drinks;
    public double TotalofMD;
    
    public double AllTotalofMD;
    
    public double GetAmount()
    {
        Meals = Beef + Vegetable;
        Drinks = Sprite + Cocacola;
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
    public double pBeef = 30;
    public double pVegetable = 25;
    public double pSprite = 10;
    public double pCocacola = 10;
    
    //tax===========================
    public double mcTax=0.9;
    
    public Double cFindTax(double cAmount){
        double FindTax = cAmount - (cAmount*mcTax);
        return FindTax;
    }
    
}
