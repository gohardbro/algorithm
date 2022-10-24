package baekjoon.step5.two_demensional_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 색종이
public class No2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        int[][] position = new int[100][100];

        for (int i=0; i<cnt; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int col = Integer.parseInt(st.nextToken());
            int row = Integer.parseInt(st.nextToken());

            for (int j=0; j<10; j++) {
                for (int k=0; k<10; k++) {
                    position[row+j][col+k] += 1;
                    if (position[row+j][col+k] > 1)
                        position[row+j][col+k] = 1;
                }
            }
        }

        int sum = 0;
        for (int[] v : position) {
            sum += Arrays.stream(v).sum(); // 배열의 모든 숫자 더한 값
        }

        System.out.println(sum);
    }
}
