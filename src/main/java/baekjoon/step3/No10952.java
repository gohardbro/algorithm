package baekjoon.step3;

import java.io.*;
import java.util.StringTokenizer;

// A+B - 5
public class No10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int a, b, sum;
        while (true) {
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            sum = a + b;

            if (sum == 0)
                break;

            System.out.println(sum);
        }
        br.close();
    }
}
