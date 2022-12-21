package learn.task1.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Basket {
    private List<Ball> balls = new ArrayList<>();

    public Basket(List<Ball> balls) {
        this.balls = balls;
    }

    public List<Ball> getBalls() {
        return balls;
    }

    public void setBalls(List<Ball> balls) {
        this.balls = balls;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Basket.class.getSimpleName() + "[", "]")
                .add("balls=" + balls)
                .toString();
    }
}
