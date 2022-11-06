package baekjoon.steps.step10.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 대표값2
public class No2587 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] nums = new int[5];
        int sum = 0;
        for (int i=0; i<nums.length; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            sum += nums[i];
        }

        // 오름차순정렬 (BubbleSort)
        // Arrays.sort() 를 쓸수도 있다.
        for (int i=0; i<nums.length-1; i++) {
            boolean status = false;

            for (int j=0; j<nums.length-1-i; j++) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    status = true;
                }
            }

            if (!status)
                break;
        }

        int average = sum/nums.length;
        int middle = nums[2];
        sb.append(average).append("\n")
                        .append(middle);

        System.out.println(sb);
    }
}
