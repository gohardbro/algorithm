package baekjoon.steps.step3.loop;

import java.io.*;

// 별 찍기 - 1
public class No2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            //java 11 부터는 for문을 사용하지않고 String 타입의 메소드 repeat(n) 을 사용하여 문자열을 n번 반복 할 수 있다.
            //ex) sb.append("*".repeat(i + 1));
            for (int j = 0; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        br.close();
        bw.write(sb.toString());
        bw.close();
    }
}
