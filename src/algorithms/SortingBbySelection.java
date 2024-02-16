package algorithms;

import java.util.Arrays;

public class SortingBbySelection {

    public static void main(String[] args) {

        // Сортировка выбором

        int[] array = {29, 10, 14, 37, 13, 4, 78, -5};
        sortingBbySelection(array);
    }


    public static void sortingBbySelection (int[] array) {

        if (array.length == 0) {
            throw new NullPointerException("Массив пуст");
        } else {
            sorting(array);
        }

    }
    private static void sorting (int[] array) {

        for (int i = 0; i < array.length; i++) {

            int minIndex = i;
            for (int j = i +1 ; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

        System.out.println(Arrays.toString(array));;
    }
}


