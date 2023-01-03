package by.Ageenko.learn.task2.entity;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Bouquet {
    static Logger logger = LogManager.getLogger();
    static final int MAX_SIZE_OF_AMOUNT_OF_BOUQUETS = 10;
    static final int MAX_SIZE_OF_FLOWER_IN_BOUQUET = 8;
    private List<FlowerType> listOfFlower = new ArrayList<>();
    private List <Integer> amountOfFlower = new ArrayList<>();
    private String bouquetName;
    private TypeOfPackage typeOfPackage;
    private int amountOfBouquets;

    public Bouquet(String bouquetName, TypeOfPackage typeOfPackage, int amountOfBouquets) {
        this.bouquetName = bouquetName;
        this.typeOfPackage = typeOfPackage;
        if (amountOfBouquets<=MAX_SIZE_OF_AMOUNT_OF_BOUQUETS) {
            this.amountOfBouquets = amountOfBouquets;
        }else logger.log(Level.ERROR,"The maximum number of bouquets has been exceeded", MAX_SIZE_OF_AMOUNT_OF_BOUQUETS);
    }

    public List<FlowerType> getListOfFlower() {
        return listOfFlower;
    }

    public List getAmountOfFlower() {
        return amountOfFlower;
    }

    public String getBouquetName() {
        return bouquetName;
    }

    public void setBouquetName(String bouquetName) {
        this.bouquetName = bouquetName;
    }

    public int getAmountOfBouquets() {
        return amountOfBouquets;
    }

    public TypeOfPackage getTypeOfPackage() {
        return typeOfPackage;
    }
    public void addFlower(FlowerType typeOfFlower, int amountOfFlower){
        if (listOfFlower.size()==MAX_SIZE_OF_FLOWER_IN_BOUQUET){
            logger.log(Level.ERROR,"The bouquet already has all kinds of flowers", MAX_SIZE_OF_FLOWER_IN_BOUQUET); //log need
        }else if (listOfFlower.contains(typeOfFlower)){
            listOfFlower.remove(typeOfFlower);
            this.amountOfFlower.remove(amountOfFlower);
            listOfFlower.add(typeOfFlower);
            this.amountOfFlower.add(amountOfFlower);
        }else if(!listOfFlower.contains(typeOfFlower)) {
            listOfFlower.add(typeOfFlower);
            this.amountOfFlower.add(amountOfFlower);
        }
    }
    public void addAmountOfBouquet(int amountOfBouquets) {
        if (this.amountOfBouquets + amountOfBouquets <= MAX_SIZE_OF_AMOUNT_OF_BOUQUETS) {
            this.amountOfBouquets += amountOfBouquets;
        }else {
            logger.log(Level.ERROR,"The maximum number of bouquets has been exceeded", MAX_SIZE_OF_FLOWER_IN_BOUQUET);
        }
    }
    public void deleteAmountOfBouquet(int amountOfBouquets){
        if(this.amountOfBouquets>=amountOfBouquets){
            this.amountOfBouquets -= amountOfBouquets;
        }
    }
    public void changeAmountOfBouquet(int amountOfBouquets, String option){
        if(option == "delete"){
            deleteAmountOfBouquet(amountOfBouquets);
        }
        if (option == "add"){
            addAmountOfBouquet(amountOfBouquets);
        }
    }
    public double calculateBouquetsPrice() {
        double priceOfFlowers = 0;
        for (int i = 0; i < listOfFlower.size(); i++) {
            priceOfFlowers += listOfFlower.get(i).getPrice() * amountOfFlower.get(i);
        }return (priceOfFlowers * amountOfBouquets + typeOfPackage.getPriceOfPackage());
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", Bouquet.class.getSimpleName() + "[", "]")
                .add("listOfFlower=" + listOfFlower)
                .add("amountOfFlower=" + amountOfFlower)
                .add("bouquetName='" + bouquetName + "'")
                .add("typeOfPackage=" + typeOfPackage)
                .add("amountOfBouquets=" + amountOfBouquets)
                .toString();
    }
}