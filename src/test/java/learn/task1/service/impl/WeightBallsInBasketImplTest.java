package learn.task1.service.impl;

import learn.task1.entity.Ball;
import learn.task1.entity.Basket;
import learn.task1.service.WeightBallsInBasket;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WeightBallsInBasketImplTest {

    @Test
    public void weightOfBallsInBasket() {
        Ball ball = new Ball(3, "green");
        Ball ball2 = new Ball(5, "red");
        Ball ball3 = new Ball(6, "blue");

        List<Ball> ballList = List.of(ball, ball2, ball3);
        Basket basket = new Basket(ballList);
        WeightBallsInBasket service = new WeightBallsInBasketImpl();

        int actual = service.weightOfBallsInBasket(basket);
        int expected = 14;
        assertEquals(actual,expected, .1);
    }
}