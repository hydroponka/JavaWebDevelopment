package byAgeenko.learn.task2.entity;

import java.util.ArrayList;
import java.util.List;

public class Order {
    static final int MAX_SIZE_OF_NUMBER_OF_ORDER = 99999;
    static final int MAX_SIZE_OF_AMOUNT_OF_BOUQUETS = 10;
    private int numberOfOrder = 9999;
    private int numberOfClient;
    private List<Bouquet> listOfBouquets = new ArrayList<>();

    private int amountOfBouquets;
    private double orderPrice;

    public Order() {
        this.numberOfClient++;
        if (numberOfOrder<MAX_SIZE_OF_NUMBER_OF_ORDER){
            numberOfOrder++;
        }
    }

    public int getNumberOfOrder() {
        return numberOfOrder;
    }

    public int getNumberOfClient() {
        return numberOfClient;
    }

    public void setNumberOfClient(int numberOfClient) {
        this.numberOfClient = numberOfClient;
    }

    public List<Bouquet> getListOfBouquets() {
        return listOfBouquets;
    }

    public void setListOfBouquets(List<Bouquet> listOfBouquets) {
        this.listOfBouquets = listOfBouquets;
    }

    public int getAmountOfBouquets() {
        return amountOfBouquets;
    }

    public void setAmountOfBouquets() {
        if (listOfBouquets.size()<MAX_SIZE_OF_AMOUNT_OF_BOUQUETS) {
            this.amountOfBouquets = listOfBouquets.size();
        }else System.out.println("The maximum number of bouquets has been exceeded");
    }
    public void addBouquet(Bouquet bouquet, int amountOfBouquets){
        this.amountOfBouquets += amountOfBouquets;
        if (listOfBouquets.size()<=MAX_SIZE_OF_AMOUNT_OF_BOUQUETS){
            listOfBouquets.add(bouquet);
        }else System.out.println("Order is already maxed out");
        orderPrice = 0;
        calculateOrderPrice(listOfBouquets);
    }
    public void addAmountOfBouquet(Bouquet bouquet, int amountOfBouquets){
        if (amountOfBouquets<=MAX_SIZE_OF_AMOUNT_OF_BOUQUETS){
            this.amountOfBouquets += amountOfBouquets;
        }
    }
    public void deleteAmountOfBouquet(Bouquet bouquet, int amountOfBouquets){
        int difference = 0;
        difference = this.amountOfBouquets - amountOfBouquets;
        if(difference<=0){
            listOfBouquets.remove(bouquet);
            this.amountOfBouquets -= 1;
        }else this.amountOfBouquets -= amountOfBouquets;
        orderPrice = 0;
        calculateOrderPrice(listOfBouquets);
    }
    public void changeAmountOfBouquet(Bouquet bouquet, int amountOfBouquets, int option){
        if(listOfBouquets.contains(bouquet)){
            if(option == 1){
                deleteAmountOfBouquet(bouquet,amountOfBouquets);
            }
            if (option == 2){
                addAmountOfBouquet(bouquet,amountOfBouquets);
            }
            orderPrice = 0;
            calculateOrderPrice(listOfBouquets);
        }
    }
    public double getOrderPrice() {
        return orderPrice;
    }

    public void calculateOrderPrice(List<Bouquet> bouquets) {
        double bouquetsPrice = 0;
        double packagePrice = 0;
        for (int i = 0; i< bouquets.size(); i++){
           bouquetsPrice += bouquets.get(i).getBouquetsPrice();
           packagePrice += (bouquets.get(i).getTypeOfPackage().getPriceOfPackage() * bouquets.get(i).getTypeOfPackage().getAmountOfPackage());
        }
        orderPrice = bouquetsPrice * amountOfBouquets + packagePrice;
    }

    public void toStringOrder(){
        System.out.println("* ".repeat(20));
        System.out.println("Order: " + getNumberOfOrder());
        System.out.println("Client: " + getNumberOfClient());
        for (int i = 0; i< listOfBouquets.size(); i++){
            System.out.println("Name of bouquet: " + listOfBouquets.get(i).getBouquetName());
            System.out.println("- ".repeat(20));
            System.out.printf("Base "+ "( " + listOfBouquets.get(i).getTypeOfPackage() +" )" + "%18x" + "%7.2f",listOfBouquets.get(i).getTypeOfPackage().getAmountOfPackage(), listOfBouquets.get(i).getTypeOfPackage().getPriceOfPackage());
            for (int j = 0; j< listOfBouquets.get(i).getListOfFlower().size(); j++){
                System.out.println();
                System.out.printf(listOfBouquets.get(i).getListOfFlower().get(j) + "%26x" + "%7.2f", listOfBouquets.get(i).getListOfFlower().get(j).getAmountOfFlower(), listOfBouquets.get(i).getListOfFlower().get(j).getPrice());

            }
            System.out.println();
            System.out.println("- ".repeat(20));
            System.out.printf("Total:" + "%7.2f",(listOfBouquets.get(i).getBouquetsPrice()));
            System.out.println();
            System.out.printf("Amount:" +"%26x",(getAmountOfBouquets()));
            System.out.println();
            System.out.println("- ".repeat(20));
        }
        System.out.printf("Total amount:" +"%26s",getOrderPrice());
        System.out.println();
        System.out.println("* ".repeat(20));
    }
}
