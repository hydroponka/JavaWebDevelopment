package learn.task2.entity;

import java.util.List;
import java.util.StringJoiner;

public class Bouquet {
    static final int MIN_SIZE_NAME_OF_BOUQUET = 4;
    static final int MAX_SIZE_NAME_OF_BOUQUET = 20;
    static final int MAX_SIZE_OF_BOUQUET = 8;
    private List<Flower> listOfFlower;
    private String bouquetName;
    private TypeOfPackage typeOfPackage;

    public Bouquet(List<Flower> listOfFlower, String bouquetName, TypeOfPackage typeOfPackage) {
        this.listOfFlower = listOfFlower;
        setBouquetName(bouquetName);
        this.typeOfPackage = typeOfPackage;
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
        if (bouquetName.length() >= MIN_SIZE_NAME_OF_BOUQUET && bouquetName.length() <= MAX_SIZE_NAME_OF_BOUQUET){
            this.bouquetName = bouquetName;
        }else this.bouquetName = "Client ";
    }

    public TypeOfPackage getTypeOfPackage() {
        return typeOfPackage;
    }

    public void setTypeOfPackage(TypeOfPackage typeOfPackage) {
        this.typeOfPackage = typeOfPackage;
    }


    public void addFlower(Flower typeOfFlower, int amountOfFlower){
        if (listOfFlower.size()>MAX_SIZE_OF_BOUQUET){
            System.out.println("The bouquet already has all kinds of flowers");
        }
        if (listOfFlower.contains(typeOfFlower)){
            listOfFlower.remove(typeOfFlower);
            listOfFlower.add(typeOfFlower);
            typeOfFlower.setAmountOfFlower(amountOfFlower);
        }else if(!listOfFlower.contains(typeOfFlower)) {
            listOfFlower.add(typeOfFlower);
            typeOfFlower.setAmountOfFlower(amountOfFlower);
        }
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Bouquet.class.getSimpleName() + "[", "]")
                .add("listOfFlower=" + listOfFlower)
                .add("bouquetName='" + bouquetName + "'")
                .add("typeOfPackage=" + typeOfPackage)
                .toString();
    }
}