package baekjoon.steps.step3.loop;

import java.io.*;

// 별 찍기 - 2
public class No2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            sb.append(" ".repeat(n-(i+1))).append("*".repeat(i+1));
            sb.append("\n");
        }

        br.close();
        bw.write(sb.toString());
        bw.close();
    }
}
