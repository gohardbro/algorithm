package baekjoon.step3.loop;

import java.io.*;
import java.util.StringTokenizer;

// A+b-7
public class No11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        int a, b, sum, i = 0;

        // StringBuilder 를 써서 append 하여 한번에 write 하면 더 속도를 올릴 수 있다.
        while (t != 0) {
            t--;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            sum = a + b;
            bw.write("Case #" + (++i) + ": " + sum + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
