package learn.task2.main;

import learn.task2.entity.Bouquet;
import learn.task2.entity.Flower;
import learn.task2.entity.Order;
import learn.task2.entity.TypeOfPackage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class TestWithSout {
    static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        List<Flower> flowers = new ArrayList<>();
        Bouquet bouquet = new Bouquet(flowers, "FlowerWar 17", TypeOfPackage.BASKET); // FIXME: 24.12.2022 
        bouquet.addFlower(Flower.GERBERA, 4);
        bouquet.addFlower(Flower.DAISY, 5);
        Order order = new Order(10000, 24,bouquet,2, 1); // FIXME: 24.12.2022 
        order.toStringOrder();
    }
}
