package ru.HomeWork;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>(List.of(6, 7, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
        double result = number.stream()
                .filter(e -> e % 2 == 0)
                .mapToDouble(Integer::doubleValue)
                .average().getAsDouble();

        System.out.printf("Среднее зачение: %.2f", result);
    }
}
