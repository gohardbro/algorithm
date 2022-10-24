package baekjoon.step3.loop;

import java.io.*;
import java.util.StringTokenizer;

// A+B - 5
public class No10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String val;
        while ((val = br.readLine()) != null) {
            st = new StringTokenizer(val, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a > 0 && b > 0 && a < 10 && b < 10)
                System.out.println(a + b);
        }
        br.close();
    }
}
