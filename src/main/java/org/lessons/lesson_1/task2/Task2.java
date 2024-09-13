package org.lessons.lesson_1.task2;

import java.util.Arrays;
import java.util.List;


public class Task2 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Привет ", "мир ", "! ", "я ", "родился. ");

//        list = list.stream().filter(str -> str.length() > 4).collect(Collectors.toList());
//        for(String item : list) {
//            System.out.println(item);
//        }
        //Выводим отфильтрованные эелементы списка через цикл.

        list.stream().filter(str -> str.length() > 4).filter(str -> str.contains("о"))
                .forEach(System.out::println);

        Arrays.asList(1, 2, 3, 4).stream().map(chislo -> "число" + chislo +
                        ". Квадрат числа: " + chislo*chislo).
                forEach(System.out::println);
    }
}
