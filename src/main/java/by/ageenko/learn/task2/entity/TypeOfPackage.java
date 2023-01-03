package by.ageenko.learn.task2.entity;

public enum TypeOfPackage {
    REGULAR(2),
    BASKET(7);

    private double priceOfPackage;

    TypeOfPackage(double priceOfPackage){
        this.priceOfPackage = priceOfPackage;
    }

    public double getPriceOfPackage() {
        return priceOfPackage;
    }

}

