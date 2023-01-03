package by.ageenko.learn.task2.entity;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    static Logger logger = LogManager.getLogger();
    @Test
    void addBouquet() {
        Bouquet bouquet = new Bouquet( "FlowerWar 17", TypeOfPackage.BASKET, 1);
        bouquet.addFlower(FlowerType.GERBERA, 4);
        Order order = new Order();
        order.addBouquet(bouquet);
        logger.log(Level.INFO, "addBouquet = {}", order.getListOfBouquets());

    }

    @Test
    void calculateOrderPrice() {
        Bouquet bouquet = new Bouquet( "FlowerWar 17", TypeOfPackage.BASKET, 4);
        bouquet.addFlower(FlowerType.GERBERA, 4);
        Order order = new Order();
        order.addBouquet(bouquet);
        double actual = order.calculateOrderPrice();
        double expected = 39;
        assertEquals(expected,actual);
        logger.log(Level.INFO, "orderPrice = {}", order.calculateOrderPrice());
    }
}