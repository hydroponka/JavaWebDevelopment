package learn.task2.main;

import learn.task2.entity.Bouquet;
import learn.task2.entity.Flower;
import learn.task2.entity.Order;
import learn.task2.service.BouquetAttributeOutput;
import learn.task2.service.impl.BouquetAttributeOutputImpl;

import java.util.List;
import java.util.Scanner;

public class TestWithSout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Flower flower1 = new Flower("Tulip");
        List<Flower> flower = List.of(flower1);
        Bouquet bouquet = new Bouquet(flower);
        System.out.println("Введите название название букета");
        bouquet.setBouquetName(sc.nextLine());
        System.out.println("Введите название номер заказа, номер клиента, количество букетов");
        Order order = new Order(sc.nextInt(), sc.nextInt(), bouquet, sc.nextInt() );
        BouquetAttributeOutput output = new BouquetAttributeOutputImpl();
        System.out.println(output.attributeOutput(order));
    }
}
