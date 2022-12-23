package learn.task1.service.impl;

import java.util.List;
import learn.task1.entity.Ball;
import learn.task1.entity.Basket;
import learn.task1.service.ColorsBallsInBasket;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ColorsBallsInBasketImpl implements ColorsBallsInBasket {
    static Logger logger = LogManager.getLogger();
    public int colorOfBallsInBasket(Basket basket, String color) {
        List<Ball> list = basket.getBalls();
        int sumOfTheSameColors = 0;

        for(int j = 0; j < list.size(); ++j) {
            if (color.equals(list.get(j).getColor())) {
                sumOfTheSameColors++;
            }
        }
        logger.log(Level.INFO, "sum = {}", sumOfTheSameColors);
        return sumOfTheSameColors;
    }
}
