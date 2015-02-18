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
public class FoodServiceTipCalculator implements TipCalculator {
    
    
    
    private double bill;
    private ServiceQuality serviceQuality;
    
    private static final double MIN_BILL = 0.00;
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + MIN_BILL;

    public FoodServiceTipCalculator() {
        bill = 0.0;
    }
    
    public FoodServiceTipCalculator(double bill) {
        this.bill = bill;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        if(bill < MIN_BILL) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        this.bill = bill;
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
                tip = bill * .15;
                break;
            case FAIR:
                tip = bill * .10;
                break;
            case POOR:
                tip = bill * 0;
                break;
        }

        return tip;
    }
}
