package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCollection {

    public static void main(String[] args) {

        ex2();

    }

    public static void ex2 () {

        /**
         *
         */

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















