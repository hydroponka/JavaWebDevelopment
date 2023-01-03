package by.ageenko.learn.task2.entity;

import by.ageenko.learn.task2.generator.NumberGenerator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Order {
    static Logger logger = LogManager.getLogger();
    static final int MAX_SIZE_OF_NUMBER_OF_ORDER = 99999;
    static final int MIN_SIZE_OF_NUMBER_OF_ORDER = 10000;
    static final int MAX_SIZE_OF_BOUQUET_NAME = 20;
    static final int MIN_SIZE_OF_BOUQUET_NAME = 4;
    private int numberOfOrder;
    private int numberOfClient;
    private List<Bouquet> listOfBouquets = new ArrayList<>();

    public Order() {
        this.numberOfOrder = NumberGenerator.generateNumberOfOrder();
        this.numberOfClient = NumberGenerator.generateNumberOfClient();
    }

    public List<Bouquet> getListOfBouquets() {
        return listOfBouquets;
    }

    public int getNumberOfOrder() {
        return numberOfOrder;
    }
    public int getNumberOfClient() {
        return numberOfClient;
    }

    public void addBouquet(Bouquet bouquet) {
        if (bouquet.getAmountOfBouquets() > 0) {
            listOfBouquets.add(bouquet);
        } else {
            logger.log(Level.ERROR, "Number of bouquets must be positive", bouquet.getAmountOfBouquets());;
        }
        if (bouquet.getBouquetName().length() <= MIN_SIZE_OF_BOUQUET_NAME && bouquet.getBouquetName().length() >= MAX_SIZE_OF_BOUQUET_NAME) {
            bouquet.setBouquetName("Client " + numberOfOrder);
        }
    }
    public double calculateOrderPrice() {
        double bouquetsPrice = 0;
        for (int i = 0; i< listOfBouquets.size(); i++){
           bouquetsPrice += listOfBouquets.get(i).calculateBouquetsPrice();
        }
        return bouquetsPrice;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Order.class.getSimpleName() + "[", "]")
                .add("numberOfOrder=" + numberOfOrder)
                .add("numberOfClient=" + numberOfClient)
                .add("listOfBouquets=" + listOfBouquets)
                .toString();
    }
}
