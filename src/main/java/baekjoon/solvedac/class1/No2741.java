package baekjoon.solvedac.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// N 찍기
public class No2741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {
            sb.append(i+1).append("\n");
        }

        System.out.println(sb);
    }
}
