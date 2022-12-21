package learn.task2.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;


public class Flower {
    private String name;

    public Flower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Flower.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .toString();
    }
}
