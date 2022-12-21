package learn.task1.service.impl;

import java.util.List;
import learn.task1.entity.Ball;
import learn.task1.entity.Basket;
import learn.task1.service.ColorsBallsInBasket;

public class ColorsBallsInBasketImpl implements ColorsBallsInBasket {

    public int colorOfBallsInBasket(Basket basket, String color) {
        List<Ball> list = basket.getBalls();
        int sumOfTheSameColors = 0;

        for(int j = 0; j < list.size(); ++j) {
            if (color.equals(list.get(j).getColor())) {
                sumOfTheSameColors++;
            }
        }
        return sumOfTheSameColors;
    }
}
