package ua.lviv.iot.lab2.hierarchy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Bricks extends Materials{
    protected int weightOfOne;

    public Bricks(String name, int pricePerKilo, int quantityInKg, int preparationTime, int weightOfOne ){
        super(name, pricePerKilo, quantityInKg, preparationTime);
        this.weightOfOne=weightOfOne;
    }
    public String toCSV() {
        return super.toCSV();
    }
    @Override
    public String Renovate(){
        return "For this renovation you will need "+this.getName()+" for the price of "+this.getPricePerKilo()+" UAH" +
                ", we need about "+getQuantityInKg()+" kilo, will be done in "+getPreparationTime()+" hours, final material price: "+getPricePerKilo()*getQuantityInKg()+ " UAH...";
    };
}