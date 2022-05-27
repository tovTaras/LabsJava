package ua.lviv.iot.lab2.hierarchy;

public class Cables extends Materials{
    protected int lengthInMetres;


    public Cables(String name, int pricePerKilo, int quantityInKg, int preparationTime, int lengthInMetres ){
        super(name, pricePerKilo, quantityInKg, preparationTime);
        this.lengthInMetres=lengthInMetres;

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

