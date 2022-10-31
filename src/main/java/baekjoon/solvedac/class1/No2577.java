package baekjoon.solvedac.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 숫자의 개수
public class No2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String multiplyStr = String.valueOf(a * b * c);
        String[] nums = multiplyStr.split("");
        int[] counter = new int[10];

        for (String num : nums) {
            for (int i = 0; i < counter.length; i++) {
                if (num.equals(String.valueOf(i))) {
                    counter[i]++;
                    break;
                }
            }
        }

        for (int cnt : counter) {
            sb.append(cnt).append("\n");
        }

        System.out.println(sb);

    }
}
