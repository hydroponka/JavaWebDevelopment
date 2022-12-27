package by.Ageenko.learn.task2.entity;

public enum FlowerType {
    TULIP(2),
    ROSE(3),
    NARCISSE(1.5),
    SUNFLOWER(5),
    GERBERA(2),
    CHRYSANTHEMUM(0.9),
    DAISY(1.3),
    POPPY(0.7);

    private double priceOfFlower;
    FlowerType(double priceOfFlower){
        this.priceOfFlower = priceOfFlower;
    }
    public double getPrice(){
        return priceOfFlower;
    }
}
