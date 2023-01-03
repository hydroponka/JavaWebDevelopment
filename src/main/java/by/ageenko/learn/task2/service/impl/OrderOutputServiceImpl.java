package by.ageenko.learn.task2.service.impl;

import by.ageenko.learn.task2.entity.Order;
import by.ageenko.learn.task2.service.OrderOutputService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class OrderOutputServiceImpl implements OrderOutputService {
    static Logger logger = LogManager.getLogger();

    @Override
    public String attributeOutput(Order order) {
        StringBuilder sb = new StringBuilder();
        LocalTime localTime = LocalTime.now();
        LocalDate localDate = LocalDate.now();

        String numberOfOrder = String.valueOf(order.getNumberOfOrder());
        String numberOfClient = String.valueOf(order.getNumberOfClient());
        String orderPrice = String.valueOf(order.calculateOrderPrice());

        sb.append("\n" + "Date: " + localDate.get(ChronoField.DAY_OF_MONTH) + ":" + localDate.get(ChronoField.MONTH_OF_YEAR) + ":" + localDate.get(ChronoField.YEAR) +
                 ("\n" + "Time: " + localTime.getHour() + ":" + localTime.getMinute() + ":" + localTime.getSecond() +
                  "\n" + "*".repeat(30) +
                  "\n" + "Order: " + numberOfOrder +
                  "\n" + "Client : " + numberOfClient +
                  "\n" + "-".repeat(30)));
        for (int i = 0; i < order.getListOfBouquets().size(); i++) {
            sb.append(String.format("\n" + "%-18s %3s %3s", "Base " + "(" + order.getListOfBouquets().get(i).getTypeOfPackage() + ")",
                    "1" , order.getListOfBouquets().get(i).getTypeOfPackage().getPriceOfPackage() + "$" + "\n"));
            for (int j = 0; j < order.getListOfBouquets().size(); j++) {
                sb.append(String.format("%-18s %3s %3s", order.getListOfBouquets().get(i).getListOfFlower().get(j), order.getListOfBouquets().get(i).getAmountOfFlower().get(j), order.getListOfBouquets().get(i).getListOfFlower().get(j).getPrice() + "$" + "\n"));
            }
            sb.append(String.format("-".repeat(30)));
            sb.append(String.format("\n" + "%-20s %3s ", "Total ", order.getListOfBouquets().get(i).calculateBouquetsPrice() + "$"));
            sb.append(String.format("\n" + "%-20s %3s ", "Amount of bouquets", order.getListOfBouquets().get(i).getAmountOfBouquets()));
            sb.append(String.format("\n" + "-".repeat(30)));
        }
        sb.append(String.format("\n" + "%-20s %3s", "Tolal Price:", orderPrice + "$"));
        sb.append(String.format("\n" + "*".repeat(30)));
        return sb.toString();
    }

    @Override
    public void fileWriter(String bill, String file) {
        try (FileWriter writer = new FileWriter(file, false)) {
            String text = bill;
            writer.write(text);
            writer.flush();
        } catch (IOException ex) {
            logger.log(Level.ERROR, ex.getMessage());
        }
    }
}
