package baekjoon.steps.step10.sort;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// 소트인사이드
public class No1472 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> arrList = new ArrayList<>();
        int n = System.in.read() - 48; // 0 문자의 10진수는 48
        while (n>-1) {
            arrList.add(n);
            n = System.in.read() - 48;
        }

        // 정렬 하기위해 배열에 넣음
        Integer[] nums = new Integer[arrList.size()];
        for (int i=0; i<nums.length; i++) {
            nums[i] = arrList.get(i);
        }

        Arrays.sort(nums, Collections.reverseOrder()); // 내림차순 정렬

        for (int num : nums) {
            sb.append(num);
        }
        System.out.println(sb);
    }
}
