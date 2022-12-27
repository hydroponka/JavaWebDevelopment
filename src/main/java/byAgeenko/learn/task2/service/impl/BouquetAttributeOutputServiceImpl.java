package byAgeenko.learn.task2.service.impl;

import byAgeenko.learn.task2.entity.Order;
import byAgeenko.learn.task2.service.BouquetAttributeOutputService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BouquetAttributeOutputServiceImpl implements BouquetAttributeOutputService {
    static Logger logger = LogManager.getLogger();
    @Override
    public String attributeOutput(Order order)  {
        int numberOfOrder = order.getNumberOfOrder();
        int numberOfClient = order.getNumberOfClient();
        int numberOfAmount = order.getAmountOfBouquets();
        return (numberOfOrder + " : " + numberOfClient + " : " +" : " + numberOfAmount);
    }

}
