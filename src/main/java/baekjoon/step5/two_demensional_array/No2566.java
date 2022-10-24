package baekjoon.step5.two_demensional_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 최대값
public class No2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[][] nums = new int[9][9];
        int max = -1;
        int row = 0;
        int col = 0;
        for (int i=0; i< nums.length; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j=0; j<nums[i].length; j++) {
                nums[i][j] = Integer.parseInt(st.nextToken());
                if (max < nums[i][j]) {
                    max = nums[i][j];
                    row = i+1;
                    col = j+1;
                }
            }
        }

        sb.append(max).append("\n")
                .append(row).append(" ").append(col);

        System.out.println(sb);
    }
}
