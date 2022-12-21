package learn.task2.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class Bouquet {
    private List<Flower> listOfFlower = new ArrayList<>();
    private String bouquetName;
    private String[] typeOfPackage = {"regular", "basket"};

    public Bouquet(List<Flower> listOfFlower) {
        this.listOfFlower = listOfFlower;
    }

    public List<Flower> getListOfFlower() {
        return listOfFlower;
    }

    public void setListOfFlower(List<Flower> listOfFlower) {
        this.listOfFlower = listOfFlower;
    }

    public String getBouquetName() {
        return bouquetName;
    }

    public void setBouquetName(String bouquetName) {
        this.bouquetName = bouquetName;
    }

    public String[] getTypeOfPackage() {
        return typeOfPackage;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Bouquet.class.getSimpleName() + "[", "]")
                .add("listOfFlower=" + listOfFlower)
                .add("bouquetName='" + bouquetName + "'")
                .add("typeOfPackage=" + Arrays.toString(typeOfPackage))
                .toString();
    }
}