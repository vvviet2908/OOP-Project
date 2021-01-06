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
    public double Seafood;
    public double Vegetable;
    public double Combo;
    public double Sprite;
    public double Cocacola;
    public double PannaCotta;
    public double IceTea;
    
    public double Meals;
    public double Drinks;
    public double TotalofMD;
    
    public double AllTotalofMD;
    
    public double GetAmount()
    {
        Meals = Beef + Vegetable + Seafood + Combo;
        Drinks = Sprite + Cocacola + PannaCotta + IceTea;
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
    public double pSeafood = 35;
    public double pCombo = 2*pBeef+2*pVegetable+2*pSeafood-5;
    public double pSprite = 10;
    public double pCocacola = 10;
    public double pPannaCotta = 20;
    public double pIceTea = 5;
    
    //tax===========================
    public double mcTax=0.9;
    
    public Double cFindTax(double cAmount){
        double FindTax = cAmount - (cAmount*mcTax);
        return FindTax;
    }
    
}
