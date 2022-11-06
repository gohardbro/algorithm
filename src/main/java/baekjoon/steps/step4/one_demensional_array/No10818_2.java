package baekjoon.steps.step4.one_demensional_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 최소, 최대
// + 최적화
public class No10818_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int min = 1000000;
        int max = -1000000;

        while (n-- > 0) {
            int no = Integer.parseInt(st.nextToken());
            if (no < min) {
                min = no;
            }
            if (no > max) {
                max = no;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(min).append(" ").append(max);
        System.out.println(sb);
    }
}