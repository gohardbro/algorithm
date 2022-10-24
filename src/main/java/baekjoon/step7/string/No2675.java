package baekjoon.step7.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문자열 반복
public class No2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testcase = Integer.parseInt(br.readLine());

        for (int i=0; i<testcase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int loop = Integer.parseInt(st.nextToken());
            String[] splits = st.nextToken().split("");

            for (String str : splits) {
                sb.append(str.repeat(loop)); // 자바 11 부터는 repeat() 로 문자열 반복가능
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
