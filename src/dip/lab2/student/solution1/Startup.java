/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author mschoenauer1
 */



public class Startup {
    
    public static enum ServiceQuality {
           GOOD, FAIR, POOR
    };
    
    TipCalculator fs = new FoodServiceTipCalculator(30.00);
    TipCalculator bs = new BaggageServiceTipCalculator(0.50, 4);
    
    
    
    TipCalculatorService service = new TipCalculatorService();
    
    
}
