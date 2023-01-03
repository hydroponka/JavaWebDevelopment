package by.ageenko.learn.task2.service.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class OrderInputService implements by.ageenko.learn.task2.service.OrderInputService {
    @Override
    public String readData(String file) {
        String data = null;
        try (FileReader inputStream = new FileReader(file);
             BufferedReader reader = new BufferedReader(inputStream)) {
            data = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

}

