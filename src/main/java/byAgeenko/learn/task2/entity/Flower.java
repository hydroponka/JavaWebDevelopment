package byAgeenko.learn.task2.entity;

public enum Flower {
    TULIP(2, 0),
    ROSE(3, 0),
    NARCISSE(1.5, 0),
    SUNFLOWER(5, 0),
    GERBERA(2, 0),
    CHRYSANTHEMUM(0.9, 0),
    DAISY(1.3, 0),
    POPPY(0.7, 0);

    private double priceOfFlower;
    private int amountOfFlower;
    Flower(double priceOfFlower, int amountOfFlower){
        this.priceOfFlower = priceOfFlower;
        setAmountOfFlower(amountOfFlower);
    }
    public double getPrice(){
        return priceOfFlower;
    }
    public void setAmountOfFlower(int amountOfFlower){
        this.amountOfFlower = amountOfFlower;
    }
    public int getAmountOfFlower(){
        return amountOfFlower;
    }
}
