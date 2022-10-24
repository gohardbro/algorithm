package baekjoon.step3.loop;

import java.io.*;
import java.util.StringTokenizer;

// A+b-8
public class No11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        int a, b, sum, i = 0;
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (t != 0) {
            t--;
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            sum = a + b;

            sb.append("Case #").append(++i).append(": ").append(a).append(" + ").append(b).append(" = ").append(sum).append("\n");
        }

        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }
}
