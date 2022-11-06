package baekjoon.steps.step8.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 손익분기점
public class No1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (b >= c) {
            System.out.println(-1);
        } else {

            for (int i = 1; i <= 2100000001; i++) {
                long totalCost = a + ((long) b * i);
                long totalIncome = (long) c * i;

                if (totalIncome > totalCost) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
