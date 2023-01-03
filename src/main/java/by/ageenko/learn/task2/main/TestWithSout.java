package by.Ageenko.learn.task2.main;

import by.Ageenko.learn.task2.entity.Bouquet;
import by.Ageenko.learn.task2.entity.Order;
import by.Ageenko.learn.task2.entity.FlowerType;
import by.Ageenko.learn.task2.entity.TypeOfPackage;
import by.Ageenko.learn.task2.service.impl.BouquetOutputServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestWithSout {
    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet("FlowerWar 17", TypeOfPackage.BASKET, 1);
        Bouquet bouquet2 = new Bouquet("FlowerWar 18", TypeOfPackage.REGULAR, 1);
        bouquet.addFlower(FlowerType.GERBERA, 4);
        bouquet.addFlower(FlowerType.DAISY, 5);
        bouquet2.addFlower(FlowerType.SUNFLOWER, 3);
        bouquet2.addFlower(FlowerType.DAISY, 4);
        Order order = new Order();
        order.addBouquet(bouquet);
        order.addBouquet(bouquet2);
        BouquetOutputServiceImpl bouquetOutputService = new BouquetOutputServiceImpl();
        bouquetOutputService.attributeOutput(order);
        bouquetOutputService.fileWriter(bouquetOutputService.attributeOutput(order));
    }
}
