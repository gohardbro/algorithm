package baekjoon.step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 나머지
// HashSet 을 이용한 방법도 시도 해보자.
public class No3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] remainder = new int[10];
        int cnt = 0;
        int temp = -1;

        for (int i = 0; i < remainder.length; i++) {
            int num = Integer.parseInt(br.readLine());
            remainder[i] = num % 42;
        }
        Arrays.sort(remainder);

        for (int no : remainder) {
            if (no != temp) {
                temp = no;
                ++cnt;
            }
        }
        System.out.println(cnt);

    }
}
