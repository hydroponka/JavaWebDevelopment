package byAgeenko.learn.task2.main;

import byAgeenko.learn.task2.entity.Bouquet;
import byAgeenko.learn.task2.entity.Flower;
import byAgeenko.learn.task2.entity.Order;
import byAgeenko.learn.task2.entity.TypeOfPackage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestWithSout {
    static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet( "FlowerWar 17", TypeOfPackage.BASKET);
        Bouquet bouquet2 = new Bouquet("FlowerWar 18", TypeOfPackage.REGULAR);
        bouquet.addFlower(Flower.GERBERA, 4);
        bouquet.addFlower(Flower.DAISY, 5);
        bouquet2.addFlower(Flower.SUNFLOWER,3);
        bouquet2.addFlower(Flower.DAISY, 4);
        Order order = new Order();
        order.addBouquet(bouquet, 3);
        order.addBouquet(bouquet2, 2);
        order.toStringOrder();
        Order order1 = new Order();
    }
}
