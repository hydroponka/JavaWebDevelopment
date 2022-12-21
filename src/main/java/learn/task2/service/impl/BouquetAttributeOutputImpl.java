package learn.task2.service.impl;

import learn.task2.entity.Bouquet;
import learn.task2.entity.Flower;
import learn.task2.entity.Order;
import learn.task2.service.BouquetAttributeOutput;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class BouquetAttributeOutputImpl implements BouquetAttributeOutput {
    @Override
    public String attributeOutput(Order order) throws IllegalArgumentException {
        int numberOfOrder = order.getNumberOfOrder();
        if (numberOfOrder<10000) {
            throw new IllegalArgumentException("Ошибка! Неверное число. Номер заказа должен быть пятизначным.");
        }
        int numberOfClient = order.getNumberOfClient();
        int numberOfAmount = order.getAmount();
        String bouquetName = order.getBouquet().getBouquetName();
        if(bouquetName.length()>19){
            bouquetName = "Клиент " + numberOfOrder;
        }
        return (numberOfOrder + " : " + numberOfClient + " : " + bouquetName + " : " + numberOfAmount);
    }

}
