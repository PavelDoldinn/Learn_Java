package algorithms;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement27 {

    public static void main(String[] args) {

        // Есть массив nums и число k, удалите из масива числа равные k
        // Вернуть массив без k

        int[] nums = new int[]{3, 2, 3, 1, 3};
        int target = 3;

        System.out.println(removeElement1(nums, target));

    }

    public static List removeElement1(int[] nums, int target) {

        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target) {
                integerList.add(nums[i]);
            }
        }
        return integerList;
    }

}
