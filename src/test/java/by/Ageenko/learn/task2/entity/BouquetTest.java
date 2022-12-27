package by.Ageenko.learn.task2.entity;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BouquetTest {
    static Logger logger = LogManager.getLogger();
    @Test
    void addFlower() {
        Bouquet bouquet = new Bouquet( "FlowerWar 17", TypeOfPackage.BASKET, 1);
        bouquet.addFlower(FlowerType.GERBERA, 4);
        bouquet.addFlower(FlowerType.SUNFLOWER, 4);
        logger.log(Level.INFO, "addFlower = {},{}", bouquet.getListOfFlower(), bouquet.getAmountOfFlower());
    }

    @Test
    void addAmountOfBouquet() {
        Bouquet bouquet = new Bouquet( "FlowerWar 17", TypeOfPackage.BASKET, 1);
        bouquet.addFlower(FlowerType.GERBERA, 4);
        bouquet.addAmountOfBouquet(9);
        int actual = bouquet.getAmountOfBouquets();
        int expected = 10;
        assertEquals(expected,actual);
        logger.log(Level.INFO, "addAmountOfBouquet = {}", bouquet.getAmountOfBouquets());
    }

    @Test
    void deleteAmountOfBouquet() {
        Bouquet bouquet = new Bouquet( "FlowerWar 17", TypeOfPackage.BASKET, 4);
        bouquet.addFlower(FlowerType.GERBERA, 4);
        bouquet.deleteAmountOfBouquet(3);
        int actual = bouquet.getAmountOfBouquets();
        int expected = 1;
        assertEquals(expected,actual);
        logger.log(Level.INFO, "addAmountOfBouquet = {}", bouquet.getAmountOfBouquets());
    }

    @Test
    void changeAmountOfBouquet() {
        Bouquet bouquet = new Bouquet( "FlowerWar 17", TypeOfPackage.BASKET, 4);
        bouquet.addFlower(FlowerType.GERBERA, 4);
        bouquet.changeAmountOfBouquet(3,"add");
        int actual = bouquet.getAmountOfBouquets();
        int expected = 7;
        assertEquals(expected,actual);
        logger.log(Level.INFO, "changeAmountOfBouquet = {}", bouquet.getAmountOfBouquets());
    }

    @Test
    void changeAmountOfBouquetNegative() {
        Bouquet bouquet = new Bouquet( "FlowerWar 17", TypeOfPackage.BASKET, 4);
        bouquet.addFlower(FlowerType.GERBERA, 4);
        bouquet.changeAmountOfBouquet(3,"delete");
        int actual = bouquet.getAmountOfBouquets();
        int expected = 1;
        assertEquals(expected,actual);
        logger.log(Level.INFO, "changeAmountOfBouquet = {}", bouquet.getAmountOfBouquets());
    }

    @Test
    void calculateBouquetsPrice() {
        Bouquet bouquet = new Bouquet( "FlowerWar 17", TypeOfPackage.BASKET, 4);
        bouquet.addFlower(FlowerType.GERBERA, 4);
        double actual = bouquet.calculateBouquetsPrice();
        double expected = 39;
        assertEquals(expected,actual);
        logger.log(Level.INFO, "calculateBouquetsPrice = {}", bouquet.calculateBouquetsPrice());
    }
}