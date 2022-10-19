package baekjoon;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] nums = new int[10];

        for (int i=0; i<nums.length; i++) {
            nums[i] = i;
        }
        System.out.println(Arrays.toString(nums));

        for (int i=0; i<nums.length; i++) {
            int r = (int) (Math.random() * 10);
            int temp = nums[0];
            nums[0] = nums[r];
            nums[r] = temp;
        }
        System.out.println(Arrays.toString(nums));



    }
}
