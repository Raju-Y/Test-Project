package com.java.basics;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CarGroup {

    public static void main(String [] args) {
        List<String> carslist = Arrays.asList("Benz", "Ford", "Audi", "BMW", "Audi", "BMW", "KIA", "TATA", "Hundai", "Hundai", "BMW", "LAM", "Bugati", "Foreri", "Bugati", "Foreri", "LAM", "TATA", "Bugati", "Audi", "BMW", "KIA");
        Map<String, Long> CarGroup = carslist.stream()
                .collect(Collectors.groupingBy(word ->word,
                        Collectors.counting()));
        System.out.println(CarGroup);
          }
}
