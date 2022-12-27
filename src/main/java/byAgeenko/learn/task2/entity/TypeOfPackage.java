package byAgeenko.learn.task2.entity;

public enum TypeOfPackage {
    REGULAR(2, 1),
    BASKET(7, 1);

    private double priceOfPackage;
    private int amountOfPackage;

    TypeOfPackage(double priceOfPackage, int amountOfPackage){
        this.priceOfPackage = priceOfPackage;
        this.amountOfPackage = amountOfPackage;
    }

    public double getPriceOfPackage() {
        return priceOfPackage;
    }

    public int getAmountOfPackage() {
        return amountOfPackage;
    }
}

