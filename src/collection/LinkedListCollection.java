package collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCollection {

    public static void main(String[] args) {

        ex1();

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
