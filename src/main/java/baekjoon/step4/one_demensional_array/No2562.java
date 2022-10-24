package baekjoon.step4.one_demensional_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 최대값
public class No2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = new int[9];
        int max = 0;
        int cnt = 0;

        for (int i = 0; i < 9; i++) {
            nums[i] = Integer.parseInt(br.readLine());

            if (nums[i] > max) {
                max = nums[i];
                cnt = i;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(max).append("\n").append(cnt+1);
        System.out.println(sb);
    }

}
