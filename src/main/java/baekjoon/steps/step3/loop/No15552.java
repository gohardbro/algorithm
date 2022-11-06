package baekjoon.steps.step3.loop;

import java.io.*;
import java.util.StringTokenizer;

// 빠른 A+B
public class No15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int a, b = 0;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;

        while (t != 0) {
            t--;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            sum = a+b;
            bw.write(sum+"\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
