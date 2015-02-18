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

public class TipCalculatorService {
    
    public double getTheTip(TipCalculator t, TipCalculator.ServiceQuality s) {
        return t.getTip(s);
    }
}
