package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

// 입실 관리
public class No5524 {
    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        final int testCase = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCase; i++) {
            sb.append(br.readLine().toLowerCase(Locale.ROOT)).append("\n");
        }
        sb.setLength(sb.length() - 1);
        System.out.print(sb);
    }
}
