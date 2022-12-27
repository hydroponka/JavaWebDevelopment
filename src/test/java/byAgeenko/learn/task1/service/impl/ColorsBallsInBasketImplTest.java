package byAgeenko.learn.task1.service.impl;

import learn.task1.entity.Ball;
import learn.task1.entity.Basket;
import learn.task1.service.ColorsBallsInBasket;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ColorsBallsInBasketImplTest {

    @Test
    void colorOfBallsInBasket() {
        Ball ball = new Ball(3, "green");
        Ball ball2 = new Ball(5, "yellow");
        Ball ball3 = new Ball(6, "white");
        Ball ball4 = new Ball(6, "red");
        Ball ball5 = new Ball(6, "red");

        List<Ball> ballList = List.of(ball, ball2, ball3, ball4,ball5);
        Basket basket = new Basket(ballList);
        String color = "green";
        ColorsBallsInBasket service = new ColorsBallsInBasketImpl();

        int actual = service.colorOfBallsInBasket(basket, color);
        int expected = 2;
        assertEquals(actual,expected, .1);
    }
}