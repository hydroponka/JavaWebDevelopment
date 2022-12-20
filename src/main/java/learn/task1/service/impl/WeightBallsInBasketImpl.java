package learn.task1.service.impl;

import learn.task1.objects.Ball;
import learn.task1.objects.Basket;
import learn.task1.service.WeightBallsInBasket;

import java.util.List;

public class WeightBallsInBasketImpl implements WeightBallsInBasket {

    @Override
    public int weightOfBallsInBasket(Basket basket) {
        List<Ball> list = basket.getBalls();
        int sumOfWeight = 0;
        for ( Ball i : list) {
            sumOfWeight += i.getWeight();
        }
        return sumOfWeight;
    }
}
