package learn.task1.service.impl;

import learn.task1.objects.Ball;
import learn.task1.objects.Basket;
import learn.task1.service.ColorsBallsInBasket;
import learn.task1.service.WeightBallsInBasket;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ColorsBallsInBasketImplTest {

    @Test
    void colorOfBallsInBasket() {
        Ball ball = new Ball(3, "green");
        Ball ball2 = new Ball(5, "green");
        Ball ball3 = new Ball(6, "green");
        Ball ball4 = new Ball(6, "green");
        Ball ball5 = new Ball(6, "green");

        List<Ball> ballList = List.of(ball, ball2, ball3, ball4,ball5);
        Basket basket = new Basket(ballList);
        ColorsBallsInBasket service = new ColorsBallsInBasketImpl();

        int actual = service.colorOfBallsInBasket(basket);
        int expected = 2;
        assertEquals(actual,expected, .1);
    }
}