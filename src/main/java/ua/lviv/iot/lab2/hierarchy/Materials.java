package ua.lviv.iot.lab2.hierarchy;

public abstract class Materials {
    private int pricePerKilo;
    private int quantityInKg;
    private int preparationTime;
    private String name;

    public int getPreparationTime(){
        return preparationTime;
    }
    public void setPreparationTime(int preparationTime){
        this.preparationTime = preparationTime;
    }

    public int getPricePerKilo(){
        return pricePerKilo;
    }
    public void setPricePerKilo(int pricePerKilo) {
        this.pricePerKilo = pricePerKilo;
    }

    public int getQuantityInKg(){
        return quantityInKg;
    }
    public void setQuantityInKg(int quantityInKg){
        this.quantityInKg = quantityInKg;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    protected Materials(String name, int pricePerKilo, int quantityInKg, int preparationTime){
        this.setName(name);
        this.setPricePerKilo(pricePerKilo);
        this.setQuantityInKg(quantityInKg);
        this.setPreparationTime(preparationTime);

    }
    public String getHeaders() {
        return "pricePerKilo;quantityInKg;PreparationTime;name";
    }
    public String toCSV() {
        return String.format("%d; %d; %d; %s", getPricePerKilo(), getQuantityInKg(), getPreparationTime(), getName());
    }
    @Override
    public String toString() {
        return "Material{" +
                " Price Per Kilo = " + pricePerKilo +
                ", Quantity In KG = " + quantityInKg +
                ", Preparation Time = " + preparationTime +
                ", name = '" + name + '\'' +
                '}';
    }
    public abstract String Renovate();
}

