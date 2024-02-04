package collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCollection {

    public static void main(String[] args) {

        ex4();

    }

    public static void ex4() {

        //Напишите Java-программу для итерации связанного списка в обратном порядке.
        List<String> stringList = new LinkedList<>();
        stringList.add("Alisa");
        stringList.add("Riga");
        stringList.add("Peta");
        stringList.add("Roza");
        stringList.add("Bolt");
        System.out.println(stringList);

        for (int i = stringList.size()-1; i > stringList.size() ; i--) {
            System.out.println(stringList.get(i));
        }

    }
    public static void ex3() {

        //Напишите Java-программу для итерации по всем элементам в связанном списке, начиная с указанной позиции.
        List<String> stringList = new LinkedList<>();
        stringList.add("Pavel");
        stringList.add("Red");
        stringList.add("Lena");
        stringList.add("Slava");
        System.out.println(stringList);

        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }

    }
    public static void ex2() {

        //Напишите Java-программу для перебора всех элементов в связанном списке

        List<String> stringList = new LinkedList<>();
        stringList.add("Pavel");
        stringList.add("Vasa");
        stringList.add("Peta");
        stringList.add("Lena");
        stringList.add("Jon");
        System.out.println(stringList);

        for (String s : stringList) {
            System.out.println(s);
        }


    }
    public static void ex1() {

        //Напишите программу на Java, чтобы добавить указанный элемент в конец связанного списка

        List<Integer> integerList = new LinkedList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.addLast(5);
        System.out.println(integerList);
    }

}
