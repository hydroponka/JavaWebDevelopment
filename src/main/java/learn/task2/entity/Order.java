package learn.task2.entity;

import java.util.List;
import java.util.Locale;

public class Order {
    private int numberOfOrder;
    private int numberOfClient;
    private Bouquet bouquet;

    private int amountOfBouquets;
    private int amountOfPackage;

    public Order(int numberOfOrder, int numberOfClient, Bouquet bouquet, int amountOfBouquets, int getAmountOfPackage) {
        this.numberOfOrder = numberOfOrder;
        this.numberOfClient = numberOfClient;
        this.bouquet = bouquet;
        this.amountOfBouquets = amountOfBouquets;
        this.amountOfPackage = amountOfBouquets;
    }

    public int getNumberOfOrder() {
        return numberOfOrder;
    }

    public void setNumberOfOrder(int numberOfOrder) {
        this.numberOfOrder = numberOfOrder;
    }

    public int getNumberOfClient() {
        return numberOfClient;
    }

    public void setNumberOfClient(int numberOfClient) {
        this.numberOfClient = numberOfClient;
    }

    public Bouquet getBouquet() {
        return bouquet;
    }

    public void setBouquet(Bouquet bouquet) {
        this.bouquet = bouquet;
    }

    public int getAmountOfBouquets() {
        return amountOfBouquets;
    }

    public void setAmountOfBouquets(int amount) {
        this.amountOfBouquets = amount;
    }

    public int getAmountOfPackage() {
        return amountOfPackage;
    }

    public void setAmountOfPackage(int amountOfPackage) {
        this.amountOfPackage = amountOfPackage;
    }

    public void toStringOrder(){
        System.out.println("* ".repeat(20));
        System.out.println("Order: " + getNumberOfOrder());
        System.out.println("Client: " + getNumberOfClient());
        System.out.println("Name of bouquet: " + bouquet.getBouquetName());
        System.out.println("- ".repeat(20));
        System.out.printf("Base "+ "( " + bouquet.getTypeOfPackage() +" )" + "%18x" + "%7.2f",getAmountOfPackage(), bouquet.getTypeOfPackage().getPriceOfPackage());
        for (int i = 0; i<bouquet.getListOfFlower().size(); i++){
            System.out.println();
            System.out.printf(bouquet.getListOfFlower().get(i).toString().substring(1).toLowerCase() + "%26x" + "%7.2f",bouquet.getListOfFlower().get(i).getAmountOfFlower(),bouquet.getListOfFlower().get(i).getPrice());

        }
    }
}
