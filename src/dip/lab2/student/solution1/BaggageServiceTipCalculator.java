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
public class BaggageServiceTipCalculator implements TipCalculator {
    
  
    
    private double baseTipPerBag;
    private int bagCount;
    private ServiceQuality serviceQuality;
    
    public BaggageServiceTipCalculator() {
        baseTipPerBag = 0.0;
        bagCount = 0;
    }

    public BaggageServiceTipCalculator(double baseTipPerBag, int bagCount) {
        this.baseTipPerBag = baseTipPerBag;
        this.bagCount = bagCount;
    }

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public void setBaseTipPerBag(double baseTipPerBag) {
        this.baseTipPerBag = baseTipPerBag;
    }

    public int getBagCount() {
        return bagCount;
    }

    public void setBagCount(int bagCount) {
        this.bagCount = bagCount;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public void setServiceQuality(ServiceQuality serviceQuality) {
        this.serviceQuality = serviceQuality;
    }
        
    @Override
    public double getTip(TipCalculator.ServiceQuality servQuality) {
        double tip = 0.00; // always initialize local variables

        switch(servQuality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + .20);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + .15);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + 0);
                break;
        }

        return tip;
    }
}
