package baekjoon.step3.loop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 더하기 사이클
public class No1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int firstN = n;
        int cycle = 0;

        do {
            int sum = n/10 + n%10;
//            n = Integer.parseInt(""+n%10 + sum%10);
            n = (n%10)*10 + sum%10;
            ++cycle;
        } while (firstN!=n);

        System.out.println(cycle);
    }
}
