package baekjoon.step5.two_demensional_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 행렬 덧셈
public class No2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] a = getInts(br, n, m); //a 배열 생성
        int[][] b = getInts(br, n, m); //b 배열 생성

        int sum = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                sum = a[i][j] + b[i][j];
                sb.append(sum).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    // 배열 한개 생성
    private static int[][] getInts(BufferedReader br, int n, int m) throws IOException {
        int[][] nums = new int[n][m];
        for (int i = 0; i< n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j< m; j++) {
                nums[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        return nums;
    }
}
