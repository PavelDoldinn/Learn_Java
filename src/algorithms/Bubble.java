package algorithms;

import java.util.Arrays;

public class Bubble {

    public static void main(String[] args) {

        int[] nums = new int[]{8, 6, 5, 9, 1, 4};
        sortBubble1(nums);

    }

    public static void sortBubble1(int[] nums) {

        System.out.println(Arrays.toString(nums));
        int temp;
        for (int i = 0; i <= nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
