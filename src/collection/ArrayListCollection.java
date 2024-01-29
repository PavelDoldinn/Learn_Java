package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCollection {

    public static void main(String[] args) {

        ex3();

    }

    public static void ex3() {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(0,5);
        System.out.println(integerList);
        integerList.addFirst(6);
        System.out.println(integerList);

    }
    public static void ex2 () {

        /**
         * Напишите Java-программу для извлечения элемента (по указанному индексу) из заданного списка массивов.
         */

        List<String> list = new ArrayList<>();
        list.add("один");
        list.add("два");
        list.add("три");
        list.add("четыре");
        list.add("пять");
        list.add("шесть");

    }

    public static void ex1() {

        /**
         * 1. Напишите программу на Java, чтобы создать новый список массивов, добавить несколько цветов
         * (строку) и распечатать коллекцию.
         */

        List<String> listColor = new ArrayList<>();
        listColor.add("Зелёный");
        listColor.add("Reed");
        listColor.add("Orange");
        listColor.add("Белый");
        listColor.add("Black");

        for (String s : listColor) {
            System.out.println(s);
        }

        System.out.println("=====================================");

        for (int i = 0; i < listColor.size(); i++) {
            String s = listColor.get(i);
            System.out.println(s);
        }

        System.out.println("===================================");
        System.out.println(listColor);
    }

}















