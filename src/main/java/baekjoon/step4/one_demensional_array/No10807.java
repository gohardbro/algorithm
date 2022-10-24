package baekjoon.step4.one_demensional_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 개수 세기
public class No10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int v = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i=0; i<n; i++) {
            if (v == Integer.parseInt(st.nextToken()))
               cnt++;
        }

        System.out.println(cnt);
    }
}
