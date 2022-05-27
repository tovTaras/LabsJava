package ua.lviv.iot.lab2.hierarchy;

public class Wallpapers extends Materials {
    boolean withPrintOrNo;

    public Wallpapers(String name, int pricePerKilo, int quantityInKg, int preparationTime, boolean withPrintOrNo ){
    super(name, pricePerKilo, quantityInKg, preparationTime);
    this.withPrintOrNo=withPrintOrNo;
    }
    public String toCSV() {
        return super.toCSV();
    }
    @Override
    public String Renovate(){
        return "For this renovation you will need "+this.getName()+" for the price of "+this.getPricePerKilo()+" UAH" +
                ", we need about "+getQuantityInKg()+" kilo, will be done in "+getPreparationTime()+" hours, final material price: "+getPricePerKilo()*getQuantityInKg()+" UAH...";
    };
}
