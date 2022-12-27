package byAgeenko.learn.task2.entity;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

class CalculateOrderPrice {
    static Logger logger = LogManager.getLogger();
    @Test
    void calculateOrderPrice() {
        Bouquet bouquet = new Bouquet( "FlowerWar 17", TypeOfPackage.BASKET);
        Bouquet bouquet2 = new Bouquet("FloweWar 18", TypeOfPackage.REGULAR);
        bouquet.addFlower(Flower.GERBERA, 1);
        bouquet.addFlower(Flower.DAISY, 1);
        bouquet2.addFlower(Flower.SUNFLOWER,1);
        bouquet2.addFlower(Flower.DAISY, 1);
        Order order = new Order();
        order.addBouquet(bouquet, 1);
        order.addBouquet(bouquet2, 1);
        logger.log(Level.INFO, "orderprice = {}", order.getOrderPrice());
    }
}