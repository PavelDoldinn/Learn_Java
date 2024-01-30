package collection;

import java.util.*;

public class ArrayListCollection {

    public static void main(String[] args) {

        ex12();

    }

    public static void ex12() {

        //Напишите программу на Java для сравнения двух списков массивов.

        List<String> stringList1 = new ArrayList<>();
        stringList1.add("Red");
        stringList1.add("Green");
        stringList1.add("Pink");
        stringList1.add("Black");
        stringList1.add("White");

        List<String> stringList2 = new ArrayList<>();
        stringList2.add("Red");
        stringList2.add("Green");
        stringList2.add("Pink");
        stringList2.add("Orange");
        stringList2.add("White");

        List<String> stringList3 = new ArrayList<>();

        for (String s : stringList1){
            stringList3.add(stringList2.contains(s) ? "Yes" : "No");
        }
        System.out.println(stringList3);

    }
    public static void ex11() {

        //Напишите программу на Java для извлечения части списка массивов.

        var integerList = new ArrayList<Integer>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        System.out.println(integerList);

        List<Integer> sudList = integerList.subList(2, 5);
        System.out.println(sudList);


    }
    public static void ex10() {

        //Напишите программу на Java для перемешивания элементов в списке массивов.

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        System.out.println(integerList);

        Collections.shuffle(integerList); // Перемешевает .shuffle
        System.out.println(integerList);

    }
    public static void ex9() {

        /**
         * Напишите программу на Java для копирования одного списка массивов в другой.
         */

        List<Integer> integerList1 = new ArrayList<>();
        integerList1.add(1);
        integerList1.add(2);
        integerList1.add(3);
        integerList1.add(4);
        integerList1.add(5);

        List<Integer> integerList2 = new ArrayList<>(integerList1);
        System.out.println(integerList2);

        List<Integer> integerList3 = new ArrayList<>();

        for (int i = 0; i < integerList2.size(); i++) {
            integerList3.add(integerList2.get(i));
        }
        System.out.println(integerList3);

        List<Integer> integerList4 = new ArrayList<>(integerList3);
        System.out.println(integerList4);
    }
    public static void ex8() {

        /**
         * Напишите программу на Java для сортировки заданного списка массивов.
         */

        List<Integer> integerList = new ArrayList<>();
        integerList.add(9);
        integerList.add(4);
        integerList.add(8);
        integerList.add(5);
        integerList.add(1);
        integerList.add(0);
        integerList.add(3);
        System.out.println(integerList);
        Collections.sort(integerList);
        System.out.println(integerList);
        Collections.reverse(integerList);
        System.out.println(integerList);

        List<String> listName = new ArrayList<>();
        listName.add("Pol");
        listName.add("Ivan");
        listName.add("Anna");
        listName.add("Pavel");
        listName.add("Lena");
        System.out.println(listName);

        Collections.sort(listName);
        System.out.println(listName);

        Collections.reverse(listName);
        System.out.println(listName);
    }
    public static void ex7() {

        /**
         * Напишите программу на Java для поиска элемента в списке массивов.
         */

        Scanner scanner = new Scanner(System.in);

        List<String> listName = new ArrayList<>();
        listName.add("Pavel");
        listName.add("Ivan");
        listName.add("Sergei");
        listName.add("Slava");
        listName.add("Lena");

        //if (listName.contains("сыв")) {
        //    System.out.println("Есть такое Имя ! ");
        //} else {
        //    System.out.println("Нет такого имени.");
        //}

        System.out.println("Введите имя которое нужно найти! ");
        String searchName = scanner.nextLine();

        if (listName.contains(searchName)) {
            System.out.println("Ваше имя найдено " + searchName);
        } else {
            System.out.println("Мы не нашли ваше имя в списке " + searchName);
        }

    }
    public static void ex6() {

        /**
         * Напишите программу на Java для удаления третьего элемента из списка массивов.
         */

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        System.out.println(integerList);

        integerList.remove(3);
        System.out.println(integerList);

    }
    public static void ex5() {

        /**
         * Напишите Java-программу для обновления определенного элемента массива по заданному элементу.
         */

        List<String> listName = new ArrayList<>();
        listName.add("Ivan");
        listName.add("Pavel");
        listName.add("Lena");
        listName.add("Jon");
        System.out.println(listName);

        listName.set(2, "Vlad");
        System.out.println(listName);

    }
    public static void ex4() {

        /**
         * Напишите Java-программу для извлечения элемента (по указанному индексу) из заданного списка массивов.
         */

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        System.out.println(integerList.get(4));
        System.out.println(integerList.get(0));
        System.out.printf("%d, %d", integerList.get(0), integerList.get(4));

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
    public static void ex2() {

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















