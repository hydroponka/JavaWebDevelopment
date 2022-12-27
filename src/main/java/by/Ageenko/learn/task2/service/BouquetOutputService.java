package by.Ageenko.learn.task2.service;

import by.Ageenko.learn.task2.entity.Order;

public interface BouquetOutputService {
    String attributeOutput(Order order);
    void fileWriter(String string);

}
