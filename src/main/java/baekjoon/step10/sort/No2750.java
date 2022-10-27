package baekjoon.step10.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 수 정렬하기
public class No2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];

        for (int i=0; i<n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        for (int i=0; i<nums.length-1; i++) {
            boolean status = false;

            for (int j=0; j<nums.length-1-i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    status = true;
                }
            }

            if (!status)
                break;
        }

        for (int num : nums) {
            sb.append(num).append("\n");
        }

        System.out.println(sb);
    }
}
