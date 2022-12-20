package learn.task1.service.impl;

import java.util.List;
import learn.task1.objects.Ball;
import learn.task1.objects.Basket;
import learn.task1.service.ColorsBallsInBasket;

public class ColorsBallsInBasketImpl implements ColorsBallsInBasket {
    public ColorsBallsInBasketImpl() {
    }

    public int colorOfBallsInBasket(Basket basket) {
        List<Ball> list = basket.getBalls();
        int sumOfTheSameColors = 0;

        for(int i = 0; i < list.size(); ++i) {
            for(int j = i + 1; j < list.size(); ++j) {
                if (((Ball)list.get(i)).getColor().equals(((Ball)list.get(j)).getColor())) {
                    ++sumOfTheSameColors;
                }
            }
        }

        return sumOfTheSameColors;
    }
}