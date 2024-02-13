package algorithms;

import java.util.ArrayList;
import java.util.List;

public class CountRemoveElement {

    public static void main(String[] args) {

        // Есть массив чисел nums, есть число target которое нужно удалить из массива.
        // Вывести новый массив без таргет и посчитать удалённые элементы.
        // Например nums = {3, 5, 3, 0, 6, 3}  {5, 0, 6}
        // target = 3   3

        int[] nums = new int[]{};
        int target = 3;

        System.out.println(countRemoveElement(nums, target));
    }

    public static List countRemoveElement(int[] nums, int target){

        if (nums.length == 0) {
            throw new ArrayIndexOutOfBoundsException("Null");
        } else {
            return removeAndCount(nums, target);
        }
    }
    private static List removeAndCount(int[] nums, int target) {

        int count = 0;
        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target) {
                integerList.add(nums[i]);
            } else {
                count++;
            }
        }
        System.out.println(count);
        return integerList;
    }

}
