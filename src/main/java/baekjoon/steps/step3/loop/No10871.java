package baekjoon.steps.step3.loop;

import java.io.*;
import java.util.StringTokenizer;

// X보다 작은 수
public class No10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int a = 0;

        st = new StringTokenizer(br.readLine(), " ");
        br.close();

        for (int i=0; i<n; i++) {
            a = Integer.parseInt(st.nextToken());
            if (a<x) {
                sb.append(a).append(" ");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
