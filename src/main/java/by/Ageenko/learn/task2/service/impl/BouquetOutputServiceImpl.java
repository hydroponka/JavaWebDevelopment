package by.Ageenko.learn.task2.service.impl;

import by.Ageenko.learn.task2.entity.Order;
import by.Ageenko.learn.task2.service.BouquetOutputService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;

public class BouquetOutputServiceImpl implements BouquetOutputService {
    static Logger logger = LogManager.getLogger();
    @Override
    public String attributeOutput(Order order)  {
        StringBuilder sb = new StringBuilder();
        LocalTime localTime = LocalTime.now();
        String numberOfOrder = String.valueOf(order.getNumberOfOrder());
        String numberOfClient = String.valueOf(order.getNumberOfClient());
        String orderPrice = String.valueOf(order.calculateOrderPrice());

        sb.append("\n" + localTime.getHour() +":"+localTime.getMinute() + ":"+ localTime.getSecond() +
                          "\n" +"*".repeat(30) +
                          "\n" +"Order: " +numberOfOrder +
                          "\n" +"Client : " +numberOfClient +
                          "\n" +"-".repeat(30));
        for (int i = 0; i<order.getListOfBouquets().size(); i++){
            sb.append(String.format("\n" + "%s %7s %5s","Base "+"("+order.getListOfBouquets().get(i).getTypeOfPackage()+")",
                                      "1",order.getListOfBouquets().get(i).getTypeOfPackage().getPriceOfPackage() +  "$" + "\n"));
            for (int j = 0; j<order.getListOfBouquets().size(); j++){
                sb.append(String.format("%s %14s %5s", order.getListOfBouquets().get(i).getListOfFlower().get(j),order.getListOfBouquets().get(i).getAmountOfFlower().get(j),order.getListOfBouquets().get(i).getListOfFlower().get(j).getPrice() + "$" + "\n"));
            }
            sb.append(String.format("-".repeat(30)));
            sb.append(String.format("\n" +"%s %15s ","Total ", order.getListOfBouquets().get(i).calculateBouquetsPrice() + "$"));
            sb.append(String.format("\n" + "%s %7s ", "Amount of bouquets",order.getListOfBouquets().get(i).getAmountOfBouquets()));
            sb.append(String.format("\n" + "-".repeat(30)));
        }
        sb.append(String.format("\n" + "%s %7s ","Tolal Price:",orderPrice + "$"));
        sb.append(String.format("\n" + "*".repeat(30)));
        return sb.toString();
    }

    @Override
    public void fileWriter(String string) {
        try (FileWriter writer = new FileWriter("check.txt", false)) {
            String text = string;
            writer.write(text);
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
