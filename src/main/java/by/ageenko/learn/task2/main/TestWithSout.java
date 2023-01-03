package by.ageenko.learn.task2.main;

import by.ageenko.learn.task2.entity.Bouquet;
import by.ageenko.learn.task2.entity.Order;
import by.ageenko.learn.task2.entity.FlowerType;
import by.ageenko.learn.task2.entity.TypeOfPackage;
import by.ageenko.learn.task2.service.impl.OrderInputService;
import by.ageenko.learn.task2.service.impl.OrderOutputServiceImpl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class TestWithSout {
    public static void main(String[] args) throws IOException {
        Bouquet bouquet = new Bouquet("FlowerWar 17", TypeOfPackage.BASKET, 1);
        Bouquet bouquet2 = new Bouquet("FlowerWar 18", TypeOfPackage.REGULAR, 1);
        bouquet.addFlower(FlowerType.GERBERA, 4);
        bouquet.addFlower(FlowerType.DAISY, 5);
        bouquet2.addFlower(FlowerType.SUNFLOWER, 3);
        bouquet2.addFlower(FlowerType.DAISY, 4);
        Order order = new Order();
        order.addBouquet(bouquet);
        order.addBouquet(bouquet2);
        OrderOutputServiceImpl bouquetOutputService = new OrderOutputServiceImpl();
        bouquetOutputService.attributeOutput(order);
        bouquetOutputService.fileWriter(bouquetOutputService.attributeOutput(order), "bill.txt");
        OrderInputService orderInputService = new OrderInputService();
        String filePath = "bill.txt";
    }
}
