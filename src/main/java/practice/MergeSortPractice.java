package practice;

import java.util.Arrays;

// 병합정렬 구현 연습
public class MergeSortPractice {

    private static int[] tmp;

    public static void main(String[] args) {
        int[] nums = {2, 9, 6, 4, 1, 5, 8, 7, 3};
        tmp = new int[nums.length];

        System.out.println("정렬 전: " + Arrays.toString(nums));
        mergeSort(nums);
        System.out.println("정렬 후: " + Arrays.toString(nums));
    }

    private static void mergeSort(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
    }

    private static void mergeSort(int[] nums, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int mid = (startIndex + endIndex) / 2;
            mergeSort(nums, 0, mid); // 왼쪽
            mergeSort(nums, mid + 1, endIndex); // 오른쪽
            merge(nums, startIndex, mid, endIndex);
        }
    }

    private static void merge(int[] nums, int startIndex, int mid, int endIndex) {
        int part1First = startIndex;
        int part2First = mid + 1;
        int index = startIndex;

        while (part1First <= mid && part2First <= endIndex) {
            if (nums[part1First] <= nums[part2First]) {
                tmp[index] = nums[part1First];
                part1First++;
            } else {
                tmp[index] = nums[part2First];
                part2First++;
            }

            index++;
        }


        while (part1First <= mid) {
            tmp[index++] = nums[part1First++];
        }

        while (part2First <= endIndex) {
            tmp[index++] = nums[part2First++];
        }


        for (int i = startIndex; i <= endIndex; i++) {
            nums[i] = tmp[i];
        }
    }


}
