package baekjoon.step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 평균은 넘겠지
public class No4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int caseCnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < caseCnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int studentCnt = Integer.parseInt(st.nextToken());

            int sum = 0;
            int[] scores = new int[studentCnt];
            for (int j=0; j<studentCnt; j++) {
                scores[j] = Integer.parseInt(st.nextToken());
                sum += scores[j];
            }
            double average = (double) sum/studentCnt;

            int cnt = 0;
            for (int j=0; j<studentCnt; j++) {
                if (scores[j] > average) {
                    cnt++;
                }
            }

            double percent = (double) cnt/studentCnt*100;
            sb.append(String.format("%.3f", percent)).append("%\n");
        }
        System.out.println(sb);
    }
}
