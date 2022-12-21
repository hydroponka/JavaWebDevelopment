package learn.task2.entity;

import java.util.StringJoiner;

public class Order {
    private int numberOfOrder;
    private int numberOfClient;
    private Bouquet bouquet;

    private int amount;

    public Order(int numberOfOrder, int numberOfClient, Bouquet bouquet, int amount) {
        this.numberOfOrder = numberOfOrder;
        this.numberOfClient = numberOfClient;
        this.bouquet = bouquet;
        this.amount = amount;
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Order.class.getSimpleName() + "[", "]")
                .add("numberOfOrder=" + numberOfOrder)
                .add("numberOfClient=" + numberOfClient)
                .add("bouquet=" + bouquet)
                .add("amount=" + amount)
                .toString();
    }
}
