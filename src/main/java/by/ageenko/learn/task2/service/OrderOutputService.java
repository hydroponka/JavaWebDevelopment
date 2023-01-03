package by.ageenko.learn.task2.service;

import by.ageenko.learn.task2.entity.Order;

public interface OrderOutputService {
    String attributeOutput(Order order);
    void fileWriter(String bill, String file);
}
