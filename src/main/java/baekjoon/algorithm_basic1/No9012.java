package baekjoon.algorithm_basic1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 괄호
public class No9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String isVps = "NO";
            String str = br.readLine();

            for (int j = 0; j < str.length() - 1; j++) {

                if (str.charAt(j) == '(' && str.charAt(j + 1) == ')') {
                    str = str.substring(0, j) + str.substring((j + 1) + 1); // () 를 뺀 문자열 합치기
                    isVps = "YES";
                    j = -1; // 첫 문자부터 시작하기 위해
                }
            }

            if (str.length() > 0) {
                isVps = "NO";
            }

            sb.append(isVps).append("\n");
        }

        System.out.println(sb);
    }
}
