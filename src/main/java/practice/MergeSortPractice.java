package practice;

import java.util.Arrays;

// 병합정렬 구현 연습
public class MergeSortPractice {
    public static void main(String[] args) {
        int[] nums = {2,9,6,4,1,5,8,7,3};

        System.out.println("정렬 전: " + Arrays.toString(nums));
        mergeSort(nums);
        System.out.println("정렬 후: " + Arrays.toString(nums));
        
    }

    private static void mergeSort(int[] nums) {
        int[] tmp = new int[nums.length];
        mergeSort(nums, tmp, 0, nums.length-1);
    }

    private static void mergeSort(int[] nums, int[] tmp, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(nums, tmp, 0, mid);
            mergeSort(nums, tmp, mid+1, end);
            merge(nums, tmp, start, mid, end);
        }
    }

    private static void merge(int[] nums, int[] tmp, int start, int mid, int end) {
        for (int i = start; i <= end; i++) {
            tmp[i] = nums[i];
        }

        int part1 = start;
        int part2 = mid + 1;
        int index = start;

        while (part1 <= mid && part2 <= end) {
            if (tmp[part1] <= tmp[part2]) {
                nums[index] = tmp[part1];
                part1++;
            } else {
                nums[index] = tmp[part2];
                part2++;
            }

            index++;
        }

        for (int i = 0; i <= mid-part1; i++) {
            nums[index + i] = tmp[part1 + i];
        }
    }
}
